package com.girish.springmvcdemo.model;

import com.girish.springmvcdemo.validator.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    @NotNull(message = "name is required")
    @Size(min = 1, message = "name is required")
    private String name;

    @Min(value = 18, message = "age should be at least 18")
    @Max(value = 60, message = "age can be at max  60")
    private int age;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "invalid postal code")
    private String postalCode;

    @NotNull(message = "freePasses is required field")
    private Integer freePasses;

    @CourseCode(value = "sub")
    private String courseCode;

    public String getPostalCode() {
        return postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
