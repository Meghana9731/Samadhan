package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.atixiansoftware.samadhan.Adapter.ProcedureAdapter;
import com.atixiansoftware.samadhan.Adapter.ProjectAdapter;
import com.atixiansoftware.samadhan.Adapter.VendorAdapter;
import com.atixiansoftware.samadhan.Model.ApiClient;
import com.atixiansoftware.samadhan.Model.ApiInterface;
import com.atixiansoftware.samadhan.Model.Proceduregetset;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.Model.Vendorgetset;
import com.atixiansoftware.samadhan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ProcedureActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Proceduregetset> proceduregetsets;
    private ApiInterface apiInterface;
    private ProcedureAdapter adapter;
    FloatingActionButton aadd,edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure);

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
        proceduregetsets = new ArrayList<>();



        apiInterface= ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Proceduregetset>> call=apiInterface.getProc();
        call.enqueue(new Callback<List<Proceduregetset>>() {
            @Override
            public void onResponse(Call<List<Proceduregetset>> call, Response<List<Proceduregetset>> response) {
                proceduregetsets=response.body();
                adapter=new ProcedureAdapter(proceduregetsets, getApplication());
                rv.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Proceduregetset>> call, Throwable t) {

            }
        });

    }
}