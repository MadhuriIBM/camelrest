package com.javadsl.simplejavadsl.repo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javadsl.simplejavadsl.model.WeatherDto;

@Component
public class WeatherDetails {
	
	
	private WeatherDto dto;
	private static Map<String, WeatherDto> map = new HashMap<String, WeatherDto>();
	
	
	
	public WeatherDetails() {
		//WeatherDto dto = WeatherDto.builder().city("Pune").temperature("27").unit("c").date(new Date().toString()).build();
		dto = new WeatherDto();
		dto.setCity("Pune");
		dto.setTemperature("20");
		dto.setUnit("A");
		dto.setDate(new Date().toString());
		map.put("PUNE", dto);
	
	}
	public WeatherDto getCurrentWeather(String city) {
		return map.get(city.toUpperCase());
	}
	public void setWeather() {
		dto.setDate(new Date().toString());
		map.put(dto.getCity().toUpperCase(), dto);
		
	}

	

}
