package com.atixiansoftware.samadhan.Model;
import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    //
    @POST("project.php")
    Call<List<Projectgetset>> getProject();
    //
    @FormUrlEncoded
    @POST("project.php")
    Call<Projectgetset> prgdata(

            @Field("id") int id,
            @Field("project_name") String project_name,
            @Field("customer_name") String customer_name,
            @Field("whatsapp_number") String whatsapp_number,
            @Field("address") String address,
            @Field("email") String email,
            @Field("project_start_date") String project_start_date,
            @Field("project_end_date") String project_end_date);

    @POST("vendor.php")
    Call<List<Vendorgetset>> getVendo();
    //
    @FormUrlEncoded
    @POST("vendor.php")
    Call<Vendorgetset> vendodata(

            @Field("id") int id,
            @Field("full_name") String full_name,
            @Field("email") String email,
            @Field("whatsapp_number") String whatsapp_number,
            @Field("address") Text address);


    @POST("procedure.php")
    Call<List<Proceduregetset>> getProc();
    //
    @FormUrlEncoded
    @POST("procedure.php")
    Call<Proceduregetset> procdata(

            @Field("id") int id,
            @Field("procedure_name") String procedure_name,
            @Field("description") String description);


    @POST("indoorprg.php")
    Call<List<Indoorgetset>> getIndoor();
    //
    @FormUrlEncoded
    @POST("indoorprg.php")
    Call<Indoorgetset> indodata(

            @Field("id") int id,
            @Field("project_file_id") String project_file_id,
            @Field("provision") String provision,
            @Field("start_date") String start_date,
            @Field("end_date") String end_date,
            @Field("chalan_no") String chalan_no,
            @Field("amount") String amount,
            @Field("is_active") String is_active);

    @POST("outdoor.php")
    Call<List<Outdoorgetset>> getOutdoor();
    //
    @FormUrlEncoded
    @POST("outdoor.php")
    Call<Outdoorgetset> outdata(

            @Field("id") int id,
            @Field("project_file_id") String project_file_id,
            @Field("vendor_id") String vendor_id,
            @Field("provision") String provision,
            @Field("start_date") String start_date,
            @Field("end_date") String end_date,
            @Field("chalan_no") String chalan_no,
            @Field("amount") String amount,
            @Field("is_active") String is_active);



}
