package ru.sachenkov.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private LinkedHashMap<String, String> languageOptions;
    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("RU", "Russia");
        countryOptions.put("IN", "India");

        languageOptions = new LinkedHashMap<>();
        languageOptions.put("Java", "Java");
        languageOptions.put("C#", "C#");
        languageOptions.put("PHP", "PHP");
        languageOptions.put("Ruby", "Ruby");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

}
