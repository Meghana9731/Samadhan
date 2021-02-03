package com.atixiansoftware.samadhan.Model;

import com.google.gson.annotations.SerializedName;

public class Projectgetset {

    @SerializedName("id")
    private int id;

    @SerializedName("project_name")
    private String project_name;

    @SerializedName("customer_name")
    private String customer_name;

    @SerializedName("whatsapp_number")
    private String whatsapp_number;

    @SerializedName("address")
    private String address;

    @SerializedName("email")
    private String email;

    @SerializedName("project_start_date")
    private String project_start_date;

    @SerializedName("project_end_date")
    private String project_end_date;

    @SerializedName("project_file")
    private String project_file;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getWhatsapp_number() {
        return whatsapp_number;
    }

    public void setWhatsapp_number(String whatsapp_number) {
        this.whatsapp_number = whatsapp_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProject_start_date() {
        return project_start_date;
    }

    public void setProject_start_date(String project_start_date) {
        this.project_start_date = project_start_date;
    }

    public String getProject_end_date() {
        return project_end_date;
    }

    public void setProject_end_date(String project_end_date) {
        this.project_end_date = project_end_date;
    }

    public String getProject_file() {
        return project_file;
    }

    public void setProject_file(String project_file) {
        this.project_file = project_file;
    }
}
