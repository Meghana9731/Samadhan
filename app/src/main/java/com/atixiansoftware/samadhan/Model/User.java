package com.atixiansoftware.samadhan.Model;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private int id;
    @SerializedName("project_file_id")
    private int project_file_id;
    @SerializedName("procedure_id")
    private int procedure_id;
    @SerializedName("vendor_id")
    private int vendor_id;
    @SerializedName("amount")
    private double 	amount;
    @SerializedName("chalan_no")
    private String 	chalan_no;
    @SerializedName("chalan_created_date")
    private String 	chalan_created_date;
    @SerializedName("provision")
    private String 	provision;
    @SerializedName("part_name")
    private String 	part_name;
    @SerializedName("total_qty")
    private double 	total_qty;
    @SerializedName("remain_qty")
    private double 	remain_qty;
    @SerializedName("price")
    private double 	price;
    @SerializedName("total_price")
    private double 	total_price;
    @SerializedName("image_name")
    private String 	image_name;
    @SerializedName("pdf_name")
    private String 	pdf_name;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("customer_name")
    private String customer_name;
    @SerializedName("address")
    private String address;
    @SerializedName("whatsapp_number")
    private String whatsapp_number;
    @SerializedName("project_start_date")
    private String project_start_date;
    @SerializedName("project_end_date")
    private String project_end_date;
    @SerializedName("project_file")
    private String project_file;
    @SerializedName("duration")
    private String duration;
    @SerializedName("policy")
    private String policy;
    @SerializedName("full_name")
    private String full_name;
    @SerializedName("company_name")
    private String company_name;
    @SerializedName("procedure_name")
    private String procedure_name;
    @SerializedName("description")
    private String description;
    @SerializedName("project_name")
    private String project_name;
    @SerializedName("is_active")
    private Boolean is_active;
    @SerializedName("value")
    private String value;
    @SerializedName("message")
    private String massage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getProject_file_id() {
        return project_file_id;
    }

    public void setProject_file_id(int project_file_id) {
        this.project_file_id = project_file_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void setTotal_qty(double total_qty) {
        this.total_qty = total_qty;
    }
    public double getTotal_qty() {
        return amount;
    }

    public void setRemain_qty(double remain_qty) {
        this.remain_qty = remain_qty;
    }
    public double getRemain_qty() {
        return remain_qty;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    public double getTotal_price() {
        return total_price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getProcedure_id() {
        return procedure_id;
    }

    public void setProcedure_id(int procedure_id) {
        this.procedure_id = procedure_id;
    }
    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }
    public String getChalan_no() {
        return chalan_no;
    }
    public void setChalan_no(String chalan_no) {
        this.chalan_no = chalan_no;
    }

    public String getProvision() {
        return provision;
    }
    public void setProvision(String provision) {
        this.provision = provision;
    }

    public String getPart_name() {
        return part_name;
    }
    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }
    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
    public String getPdf_name() {
        return pdf_name;
    }

    public void setPdf_name(String pdf_name) {
        this.pdf_name = pdf_name;
    }

    public String getEmail() {
        return email;
    }

    public void setProject_name(String project_name) {
        this. project_name =  project_name;
    }
    public String getProject_name() {
        return  project_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name= customer_name;
    }

    public String getWhatsapp_numbe() {
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

    public String getProject_start_date() {
        return project_start_date;
    }

    public void setProject_start_date(String project_start_date) {
        this.project_start_date = project_start_date;
    }

    public String getProject_file() {
        return project_file;
    }

    public void setProject_file(String project_file) {
        this.project_file = project_file;
    }
    public String getProject_end_date() {
        return project_end_date;
    }

    public void setProject_end_date(String project_end_date) {
        this.project_end_date = project_end_date;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration= duration;
    }
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String full_name) {
        this.full_name= full_name;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name= full_name;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name= company_name;
    }
    public String getProcedure_name() {
        return procedure_name;
    }
    public void setProcedure_name(String procedure_name) {
        this.procedure_name= procedure_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description= description;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}