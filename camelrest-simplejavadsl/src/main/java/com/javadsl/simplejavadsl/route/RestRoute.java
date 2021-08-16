package com.javadsl.simplejavadsl.route;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.DefaultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javadsl.simplejavadsl.model.WeatherDto;
import com.javadsl.simplejavadsl.repo.WeatherDetails;

@Component
public class RestRoute extends RouteBuilder{
	@Autowired
	private WeatherDetails weatherDetails;

	@Override
	public void configure() throws Exception {
		from("rest:get:weather/{city}?produces=application/json")
		.outputType(WeatherDto.class)
		.process(this::getWeather);
	}
	
	
	public void getWeather(Exchange exchange) {
		String city = exchange.getMessage().getHeader("city",String.class);
		WeatherDto currentweather =  weatherDetails.getCurrentWeather(city);
		Message message = new DefaultMessage(exchange.getContext());
		message.setBody(currentweather);
		exchange.setMessage(message);
	}

}
