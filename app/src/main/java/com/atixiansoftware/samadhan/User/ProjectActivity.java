package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.atixiansoftware.samadhan.Adapter.ProjectAdapter;
import com.atixiansoftware.samadhan.Model.ApiClient;
import com.atixiansoftware.samadhan.Model.ApiInterface;
import com.atixiansoftware.samadhan.Model.Projectgetset;
import com.atixiansoftware.samadhan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ProjectActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Projectgetset> projectgetsets;
    private ApiInterface apiInterface;
    private ProjectAdapter adapter;
    FloatingActionButton aadd,edit,pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        aadd = findViewById(R.id.fab);
//        aadd.setOnClickListener(v -> {
//            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
//            startActivity( intent );
//        });


        edit = findViewById(R.id.edit);
        pdf = findViewById(R.id.pdf);


        rv=findViewById(R.id.recycle);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        rv.setItemViewCacheSize(20);
        rv.setDrawingCacheEnabled(true);
        rv.setDrawingCacheQuality( View.DRAWING_CACHE_QUALITY_HIGH);
        projectgetsets = new ArrayList<>();



        apiInterface= ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Projectgetset>> call=apiInterface.getProject();
        call.enqueue(new Callback<List<Projectgetset>>() {
            @Override
            public void onResponse(Call<List<Projectgetset>> call, Response<List<Projectgetset>> response) {
                projectgetsets=response.body();
                adapter=new ProjectAdapter(projectgetsets, getApplication());
                rv.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Projectgetset>> call, Throwable t) {

            }
        });

    }
}


//        end = findViewById(R.id.prg7);
//        std = findViewById(R.id.prg8);
//
//        end.setOnClickListener(v -> {
//
//            final Calendar cldr = Calendar.getInstance();
//            int day = cldr.get(Calendar.DAY_OF_MONTH);
//            int month = cldr.get(Calendar.MONTH);
//            int year = cldr.get(Calendar.YEAR);
//            // date picker dialog
//            picker = new DatePickerDialog(NewProjectActivity.this,
//                    new DatePickerDialog.OnDateSetListener() {
//                        @Override
//                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                            end.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//                        }
//                    }, year, month, day);
//            picker.show();
//        });
//
//        std.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Calendar cldr = Calendar.getInstance();
//                int day = cldr.get(Calendar.DAY_OF_MONTH);
//                int month = cldr.get(Calendar.MONTH);
//                int year = cldr.get(Calendar.YEAR);
//                // date picker dialog
//                picker1 = new DatePickerDialog(NewProjectActivity.this,
//                        new DatePickerDialog.OnDateSetListener() {
//                            @Override
//                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                                std.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//                            }
//                        }, year, month, day);
//                picker1.show();
//            }
//        });




































//    p=findViewById( R.id.owner1 );
//        pro=findViewById( R.id.owner );
//        part=findViewById( R.id.Contact );
//        sd=findViewById( R.id.v );
//        mbod=findViewById( R.id.edate );
//        c=findViewById( R.id.d );
//        a=findViewById( R.id.p );
//
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
//        setDataFromIntentExtra();
//
////        sd.setFocusableInTouchMode(false);
//        sd.setFocusable(false);
//        sd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Calendar cldr = Calendar.getInstance();
//                int day = cldr.get(Calendar.DAY_OF_MONTH);
//                int month = cldr.get(Calendar.MONTH);
//                int year = cldr.get(Calendar.YEAR);
//                // date picker dialog
//                picker = new DatePickerDialog(NewProjectActivity.this,
//                        new DatePickerDialog.OnDateSetListener() {
//                            @Override
//                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                                sd.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//                            }
//                        }, year, month, day);
//                picker.getDatePicker().setMinDate(System.currentTimeMillis());
//                picker.show();
//            }
//        });
//
//
//        mbod.setFocusable(false);
//
//       mbod.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Calendar cldr = Calendar.getInstance();
//                int day = cldr.get(Calendar.DAY_OF_MONTH);
//                int month = cldr.get(Calendar.MONTH);
//                int year = cldr.get(Calendar.YEAR);
//                // date picker dialog
//                picker = new DatePickerDialog(NewProjectActivity.this,
//                        new DatePickerDialog.OnDateSetListener() {
//                            @Override
//                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                                mbod.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//                            }
//                        }, year, month, day);
//                picker.getDatePicker().setMinDate(System.currentTimeMillis());
//                picker.show();
//            }
//        });
//
//
//    }
//
//    private void setDataFromIntentExtra() {
////        if (id != 0) {
////
////            readMode();
////            getSupportActionBar().setTitle("Edit " + name.toString());
////
////            mName.setText(name);
////            mSpecies.setText(species);
////            mBreed.setText(breed);
////            mBirth.setText(birth);
////
////            RequestOptions requestOptions = new RequestOptions();
////            requestOptions.skipMemoryCache(true);
////            requestOptions.diskCacheStrategy(DiskCacheStrategy.NONE);
////            requestOptions.placeholder(R.drawable.logo);
////            requestOptions.error(R.drawable.logo);
////
////            Glide.with(EditorActivity.this)
////                    .load(picture)
////                    .apply(requestOptions)
////                    .into(mPicture);
////
////            switch (gender) {
////                case GENDER_MALE:
////                    mGenderSpinner.setSelection(1);
////                    break;
////                case GENDER_FEMALE:
////                    mGenderSpinner.setSelection(2);
////                    break;
////                default:
////                    mGenderSpinner.setSelection(0);
////                    break;
////            }
////
////        } else {
////            getSupportActionBar().setTitle("Add a Pet");
////        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.update, menu);
//        action = menu;
//        action.findItem(R.id.menu_save).setVisible(false);
//
//        if (id == 0){
//
//            action.findItem(R.id.menu_edit).setVisible(false);
//            action.findItem(R.id.menu_delete).setVisible(false);
//            action.findItem(R.id.menu_save).setVisible(true);
//
//        }
//
//        return true;
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.M)
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//
//                this.finish();
//
//                return true;
//            case R.id.menu_edit:
//                //Edit
//
//                editMode();
//
//                InputMethodManager imm = (InputMethodManager) getSystemService( Context.INPUT_METHOD_SERVICE);
//                imm.showSoftInput(p, InputMethodManager.SHOW_IMPLICIT);
//
//                action.findItem(R.id.menu_edit).setVisible(false);
//                action.findItem(R.id.menu_delete).setVisible(false);
//                action.findItem(R.id.menu_save).setVisible(true);
//
//                return true;
//            case R.id.menu_save:
//                //Save
//
//                if (id == 0) {
//
//                    if ( TextUtils.isEmpty(p.getText().toString()) ||
//                            TextUtils.isEmpty(pro.getText().toString()) ||
//                            TextUtils.isEmpty(part.getText().toString()) ||
//                            TextUtils.isEmpty(sd.getText().toString()) ||
//                            TextUtils.isEmpty(mbod.getText().toString()) ||
//                            TextUtils.isEmpty(c.getText().toString()) ||
//                            TextUtils.isEmpty(a.getText().toString())
//                    ){
//                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
//                        alertDialog.setMessage("Please complete the field!");
//                        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        });
//                        alertDialog.show();
//                    }
//
//                    else {
//
//                        insertData();
//                        action.findItem(R.id.menu_edit).setVisible(true);
//                        action.findItem(R.id.menu_save).setVisible(false);
//                        action.findItem(R.id.menu_delete).setVisible(true);
//
//                        readMode();
//
//                    }
//
//                } else {
//
////                    updateData( id);
////                    action.findItem(R.id.menu_edit).setVisible(true);
////                    action.findItem(R.id.menu_save).setVisible(false);
////                    action.findItem(R.id.menu_delete).setVisible(true);
//
//                    readMode();
//                }
//
//                return true;
////            case R.id.menu_delete:
////
////                AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
////                dialog.setMessage("Delete?");
////                dialog.setPositiveButton("Yes" ,new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////                        dialog.dismiss();
//////                        deleteData("delete", id, picture);
////                    }
////                });
////                dialog.setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////                        dialog.dismiss();
////                    }
////                });
////                dialog.show();
////
////                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//
//    private void updateData( final int id) {
//
//        project_name =p.getText().toString().trim();
//        procedure_name = pro.getText().toString().trim();
//        part_name= part.getText().toString().trim();
//
//        project_start_date = sd.getText().toString().trim();
//        project_end_date=mbod.getText().toString().trim();
//        chalan_no = c.getText().toString().trim();
//        description=a.getText().toString().trim();
//
//        final ProgressDialog progressDialog=new ProgressDialog( this );
//        progressDialog.setMessage( "Loading..." );
//        readMode();
//
//        if (project_name.isEmpty()) {
//            p.setError("Enter Name");
//            p.requestFocus();
//            return;
//        }
////        else if (!w.getText().toString().matches
////                ( "(?:(?:\\+)91)?[6-9]\\d{9}$" )) {
////            w.setError( "Enter valid mobile number" );
////            return;
////        }else if (!Patterns.EMAIL_ADDRESS.matcher(em).matches()) {
////            e.setError("Please enter a valid email address");
////            return ;
////        }
////        else if (pad.isEmpty()) {
////            paddress.setError("Enter Address");
////            paddress.requestFocus();
////            return;
////        }
////        else if (password.isEmpty()) {
////            pass.setError("Enter Password");
////            pass.requestFocus();
////            return;
////        }
////        else if (bod.isEmpty()) {
////            b.setError("Enter Date");
////            b.requestFocus();
////            return;
////        }
//        else {
//            progressDialog.show();
//            StringRequest stringRequest = new StringRequest( Request.Method.POST, "http://192.168.43.28/samadhan/updateproject.php",
//                    new com.android.volley.Response.Listener<String>() {
//
//                        @Override
//                        public void onResponse(String response) {
//                            if (response.equalsIgnoreCase( "Done" )) {
//                                Toast.makeText( getApplication(), "Done", Toast.LENGTH_SHORT ).show();
//                                progressDialog.dismiss();
//
//                            }else {
//                                Toast.makeText(getApplication(), response, Toast.LENGTH_SHORT ).show();
//                                progressDialog.dismiss();
//                            }
//
//                        }
//                    }, new com.android.volley.Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    Toast.makeText( getApplication(), error.getMessage(), Toast.LENGTH_SHORT )
//                            .show();
//                    progressDialog.dismiss();
//                }
//            }
//
//            ){
//                @Override
//                protected Map<String, String> getParams() {
//                    Map<String, String> parms = new HashMap<String, String>();
//
//                    parms.put( "project_name", project_name );
//                    parms.put( "project_start_date", project_start_date );
////                    parms.put( "current_address",cad);
////                    parms.put( "permanent_address", pad );
////                    parms.put( "email", em );
////                    parms.put( "bod", bod );
////                    parms.put( "gender", gender);
//
//                    return parms;
//                }
//            };
//            RequestQueue requestQueue = Volley.newRequestQueue( getApplicationContext() );
//            requestQueue.add( stringRequest );
//        }
//    }
//    private void insertData() {
//
//
//        project_name =p.getText().toString().trim();
//        procedure_name = pro.getText().toString().trim();
//        part_name= part.getText().toString().trim();
//
//        project_start_date = sd.getText().toString().trim();
//        project_end_date=mbod.getText().toString().trim();
//        chalan_no = c.getText().toString().trim();
//        description=a.getText().toString().trim();
//
//        final ProgressDialog progressDialog=new ProgressDialog( this );
//        progressDialog.setMessage( "Loading..." );
//        readMode();
//
//        if (project_name.isEmpty()) {
//            p.setError("Enter Name");
//            p.requestFocus();
//            return;
//        }
////        else if (!w.getText().toString().matches
////                ( "(?:(?:\\+)91)?[6-9]\\d{9}$" )) {
////            w.setError( "Enter valid mobile number" );
////            return;
////        }else if (!Patterns.EMAIL_ADDRESS.matcher(em).matches()) {
////            e.setError("Please enter a valid email address");
////            return ;
////        }
////        else if (pad.isEmpty()) {
////            paddress.setError("Enter Address");
////            paddress.requestFocus();
////            return;
////        }
////        else if (password.isEmpty()) {
////            pass.setError("Enter Password");
////            pass.requestFocus();
////            return;
////        }
////        else if (bod.isEmpty()) {
////            b.setError("Enter Date");
////            b.requestFocus();
////            return;
////        }
//        else {
//            progressDialog.show();
//            StringRequest stringRequest = new StringRequest( Request.Method.POST, "http://192.168.43.28/samadhan/project.php",
//                    new com.android.volley.Response.Listener<String>() {
//
//                        @Override
//                        public void onResponse(String response) {
//                            if (response.equalsIgnoreCase( "Done" )) {
//                                Toast.makeText( getApplication(), "Done", Toast.LENGTH_SHORT ).show();
//                                progressDialog.dismiss();
//
//                            }else {
//                                Toast.makeText(getApplication(), response, Toast.LENGTH_SHORT ).show();
//                                progressDialog.dismiss();
//                            }
//
//                        }
//                    }, new com.android.volley.Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    Toast.makeText( getApplication(), error.getMessage(), Toast.LENGTH_SHORT )
//                            .show();
//                    progressDialog.dismiss();
//                }
//            }
//
//            ){
//                @Override
//                protected Map<String, String> getParams() {
//                    Map<String, String> parms = new HashMap<String, String>();
//
//                    parms.put( "project_name", project_name );
//                    parms.put( "project_start_date", project_start_date );
////                    parms.put( "current_address",cad);
////                    parms.put( "permanent_address", pad );
////                    parms.put( "email", em );
////                    parms.put( "bod", bod );
////                    parms.put( "gender", gender);
//
//                    return parms;
//                }
//            };
//            RequestQueue requestQueue = Volley.newRequestQueue( getApplicationContext() );
//            requestQueue.add( stringRequest );
//        }
//    }
////    private void postData() {
////
////        final ProgressDialog progressDialog = new ProgressDialog(this);
////        progressDialog.setMessage("Saving...");
////        progressDialog.show();
////
////        readMode();
////
////         project_name =p.getText().toString().trim();
////         procedure_name = pro.getText().toString().trim();
////         part_name= part.getText().toString().trim();
//////        double  amount = e9;
////         project_start_date = sd.getText().toString().trim();
////         project_end_date=mbod.getText().toString().trim();
////        chalan_no = c.getText().toString().trim();
////        description=a.getText().toString().trim();
////
////
////         apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
////
////        Call<User> call = apiInterface.insertUser( project_name, procedure_name, part_name,
////                project_start_date, project_end_date, chalan_no,amount);
////
////        call.enqueue(new Callback<User>() {
////            @Override
////            public void onResponse(Call<User> call, Response<User> response) {
////
////                progressDialog.dismiss();
////
////                Log.i(NewProjectActivity.class.getSimpleName(), response.toString());
////
////                String value = response.body().getValue();
////                String message = response.body().getMassage();
////
////                if (value.equals("1")){
////                    finish();
////                } else {
////                    Toast.makeText(NewProjectActivity.this, message, Toast.LENGTH_SHORT).show();
////                }
////
////            }
////
////            @Override
////            public void onFailure(Call<User> call, Throwable t) {
////                progressDialog.dismiss();
////                Toast.makeText(NewProjectActivity.this, t.getMessage().toString(), Toast.LENGTH_SHORT).show();
////            }
////        });
////
////    }
//
//    void readMode(){
//
//        p.setFocusableInTouchMode(false);
//        pro.setFocusableInTouchMode(false);
//        part.setFocusableInTouchMode(false);
//       a.setFocusableInTouchMode(false);
//        sd.setFocusableInTouchMode(false);
//        mbod.setFocusableInTouchMode(false);
////        sd.setFocusableInTouchMode(false);
//        c.setFocusableInTouchMode(false);
//        p.setFocusable(false);
//        pro.setFocusable(false);
//        part.setFocusable(false);
//        a.setEnabled(false);
////        e5.setEnabled(false);
//        sd.setFocusable(false);
//        mbod.setFocusable(false);
//        c.setEnabled(false);
////        e9.setEnabled(false);
//
//
//
//    }
//
//    private void editMode(){
//        p.setFocusableInTouchMode(false);
//        pro.setFocusableInTouchMode(false);
//        part.setFocusableInTouchMode(false);
//        a.setFocusableInTouchMode(false);
//        sd.setFocusableInTouchMode(false);
//        mbod.setFocusableInTouchMode(false);
////        sd.setFocusableInTouchMode(false);
//        c.setFocusableInTouchMode(false);
//        p.setFocusable(false);
//        pro.setFocusable(false);
//        part.setFocusable(false);
//        a.setEnabled(false);
////        e5.setEnabled(false);
//        sd.setFocusable(false);
//        mbod.setFocusable(false);
//        c.setEnabled(false);
////        e9.setEnabled(false);
//
//    }