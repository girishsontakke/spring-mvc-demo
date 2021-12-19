package com.girish.springmvcdemo.model;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String favCountry;
    private String favLanguage;
    private LinkedHashMap<String, String> countryMap;
    private String[] languageArray;

    public Student(){
        countryMap = new LinkedHashMap<>();
        languageArray = new String[]{"Javascript", "Python", "Java", "C++"};
        countryMap.put("IN", "India");
        countryMap.put("BR", "Brazil");
        countryMap.put("SR", "Sri Lanka");
        countryMap.put("USA", "United States Of America");

    }

    public String getFavCountry() {
        return favCountry;
    }

    public void setFavCountry(String favCountry) {
        this.favCountry = this.getCountryMap().get(favCountry);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryMap() {
        return countryMap;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public String[] getLanguageArray() {
        return languageArray;
    }
}
