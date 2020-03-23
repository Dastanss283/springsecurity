package com.attractor.springsecurity;

import java.time.LocalDate;

public class Profile {

    private int id;
    private String fullName;
    private LocalDate birthDate;
    private boolean male;

    public Profile(int id, String fullName, LocalDate birthDate, boolean male) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.male = male;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

}
