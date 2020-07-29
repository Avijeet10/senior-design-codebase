package com.fitbitsample.fitbitdata;

public class FitbitUser {
    private String dateOfBirth, fullName, gender, height, weight;

    public FitbitUser(String dateOfBirth, String fullName, String gender, String height, String weight) {
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
