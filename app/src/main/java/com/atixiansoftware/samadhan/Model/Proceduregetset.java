package com.atixiansoftware.samadhan.Model;

import com.google.gson.annotations.SerializedName;

public class Proceduregetset {

    @SerializedName("id")
    private int id;

    @SerializedName("procedure_name")
    private String procedure_name;

    @SerializedName("description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcedure_name() {
        return procedure_name;
    }

    public void setProcedure_name(String procedure_name) {
        this.procedure_name = procedure_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

