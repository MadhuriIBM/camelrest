package com.javadsl.simplejavadsl.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@NoArgsConstructor
//@Builder
@Data
public class WeatherDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String city;
	private String temperature;
	private String unit;
	private String date;
	}

