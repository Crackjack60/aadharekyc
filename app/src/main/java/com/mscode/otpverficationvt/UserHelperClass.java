package com.mscode.otpverficationvt;

public class UserHelperClass {
    public String aadhar;
    public String name;
    public String address;
    public String dob;
    public String gender;
    public UserHelperClass(){}

    public UserHelperClass(String aadhar, String name, String address, String dob, String gender) {


        this.aadhar = aadhar;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getaadhar() {
        return aadhar;
    }

    public void setaadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
