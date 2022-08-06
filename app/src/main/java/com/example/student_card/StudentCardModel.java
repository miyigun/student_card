package com.example.student_card;

public class StudentCardModel {
    private int pictureId;
    private String tc;
    private String name;
    private String surname;
    private String fatherName;
    private String motherName;
    private String schoolNumber;
    private String classBranch;
    private String address;
    private String tel;

    public StudentCardModel(int pictureId, String tc, String name, String surname, String fatherName, String motherName, String schoolNumber, String classBranch, String address, String tel) {
        this.pictureId = pictureId;
        this.tc = tc;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.schoolNumber = schoolNumber;
        this.classBranch = classBranch;
        this.address = address;
        this.tel = tel;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getClassBranch() {
        return classBranch;
    }

    public void setClassBranch(String classBranch) {
        this.classBranch = classBranch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
