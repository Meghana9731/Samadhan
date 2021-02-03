package com.atixiansoftware.samadhan.Model;

import com.google.gson.annotations.SerializedName;

public class Outdoorgetset {

    @SerializedName("id")
    private int id;

    @SerializedName("project_file_id")
    private String project_file_id;

    @SerializedName("vendor_id")
    private String vendor_id;

    @SerializedName("provision")
    private String provision;

    @SerializedName("start_date")
    private String start_date;

    @SerializedName("end_date")
    private String end_date;

    @SerializedName("chalan_no")
    private String chalan_no;

    @SerializedName("amount")
    private String amount;

    @SerializedName("is_active")
    private String is_active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject_file_id() {
        return project_file_id;
    }

    public void setProject_file_id(String project_file_id) {
        this.project_file_id = project_file_id;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getProvision() {
        return provision;
    }

    public void setProvision(String provision) {
        this.provision = provision;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getChalan_no() {
        return chalan_no;
    }

    public void setChalan_no(String chalan_no) {
        this.chalan_no = chalan_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }
}
