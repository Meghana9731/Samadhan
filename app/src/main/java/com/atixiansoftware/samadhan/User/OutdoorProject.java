package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.atixiansoftware.samadhan.Adapter.IndoorAdapter;
import com.atixiansoftware.samadhan.Adapter.OutdoorAdapter;
import com.atixiansoftware.samadhan.Adapter.ProjectAdapter;
import com.atixiansoftware.samadhan.Adapter.VendorAdapter;
import com.atixiansoftware.samadhan.Model.ApiClient;
import com.atixiansoftware.samadhan.Model.ApiInterface;
import com.atixiansoftware.samadhan.Model.Indoorgetset;
import com.atixiansoftware.samadhan.Model.Outdoorgetset;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.Model.Vendorgetset;
import com.atixiansoftware.samadhan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class OutdoorProject extends AppCompatActivity {
    private RecyclerView rv;
    private List<Outdoorgetset> outdoorgetsets;
    private ApiInterface apiInterface;
    private OutdoorAdapter adapter;
    FloatingActionButton aadd,edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_project);

        aadd = findViewById(R.id.fab);
//        aadd.setOnClickListener(v -> {
//            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
//            startActivity( intent );
//        });


        edit = findViewById(R.id.edit);


        rv=findViewById(R.id.recycle);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        rv.setItemViewCacheSize(20);
        rv.setDrawingCacheEnabled(true);
        rv.setDrawingCacheQuality( View.DRAWING_CACHE_QUALITY_HIGH);
        outdoorgetsets = new ArrayList<>();



        apiInterface= ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Outdoorgetset>> call=apiInterface.getOutdoor();
        call.enqueue(new Callback<List<Outdoorgetset>>() {
            @Override
            public void onResponse(Call<List<Outdoorgetset>> call, Response<List<Outdoorgetset>> response) {
                outdoorgetsets=response.body();
                adapter=new OutdoorAdapter(outdoorgetsets, getApplication());
                rv.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Outdoorgetset>> call, Throwable t) {

            }
        });

    }
}