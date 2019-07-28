package com.sean.springpractice.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String city;
	private LinkedHashMap<String, String> cityOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		
		cityOptions = new LinkedHashMap<>();
		
		cityOptions.put("BOS", "Boston");
		cityOptions.put("NY", "New York");
		cityOptions.put("MIA", "Miami");
		cityOptions.put("HOU", "Houston");
		cityOptions.put("LA", "Los Angeles");
		cityOptions.put("CHI", "Chicago");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LinkedHashMap<String, String> getCityOptions() {
		return cityOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
