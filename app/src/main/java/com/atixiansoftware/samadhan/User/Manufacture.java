package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.Toast;

import com.atixiansoftware.samadhan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class Manufacture extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    GridLayout mainGrid;
    Toolbar toolbar;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private FloatingActionButton fab_main, fab_prg, fab_vend,fab_proce,fab_inprg,fab_outprg;
    private Animation fab_open, fab_close, fab_clock, fab_anticlock;
    Boolean isOpen = false;
    CardView cardView,cardView1,cardView2,cardView3,cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_manufacture );

//
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        mainGrid = (GridLayout) findViewById(R.id.maingrid);
        cardView=findViewById( R.id.card );
        cardView1=findViewById( R.id.card1 );
        cardView2=findViewById(R.id.card2);
        cardView3=findViewById(R.id.card3);
        cardView4=findViewById(R.id.card4);
        cardView1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),VendorActivity.class);
                startActivity( i );
            }
        } );
        cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), ProjectActivity.class);
                startActivity( i );
            }
        } );
        cardView2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), ProcedureActivity.class);
                startActivity( i );
            }
        } );
        cardView3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), IndoorProject.class);
                startActivity( i );
            }
        } );
        cardView4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), OutdoorProject.class);
                startActivity( i );
            }
        } );

//        setSingleEvent(mainGrid);
//        setToggleEvent(mainGrid);

        fab_main = findViewById(R.id.fab);
        fab_prg = findViewById(R.id.fab1);
        fab_vend = findViewById(R.id.fab2);
        fab_proce=findViewById( R.id.fab3 );
        fab_inprg=findViewById( R.id.fab4 );
        fab_outprg=findViewById( R.id.fab5 );
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_clock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_clock);
        fab_anticlock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_rotate_anticlock);



        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isOpen) {

                    fab_prg.startAnimation(fab_close);
                    fab_vend.startAnimation(fab_close);
                    fab_proce.startAnimation(fab_close);
                    fab_inprg.startAnimation(fab_close);
                    fab_outprg.startAnimation(fab_close);
                    fab_main.startAnimation(fab_anticlock);
                    fab_prg.setClickable(false);
                    fab_vend.setClickable(false);
                    fab_proce.setClickable(false);
                    fab_inprg.setClickable(false);
                    fab_outprg.setClickable(false);
                    isOpen = false;
                } else {
                    fab_prg.startAnimation(fab_open);
                    fab_vend.startAnimation(fab_open);
                    fab_proce.startAnimation(fab_open);
                    fab_inprg.startAnimation(fab_open);
                    fab_outprg.startAnimation(fab_open);
                    fab_main.startAnimation(fab_clock);
                    fab_prg.setClickable(true);
                    fab_vend.setClickable(true);
                    fab_proce.setClickable(true);
                    fab_inprg.setClickable(true);
                    fab_outprg.setClickable(true);
                    isOpen = true;
                }

            }
        });


        fab_prg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), ProjectActivity.class);
                startActivity( intent );
                finish();
            }
        } );


        fab_vend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), VendorActivity.class);
                startActivity( intent );
                finish();
            }
        } );

        fab_proce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), ProcedureActivity.class);
                startActivity( intent );
                finish();
            }
        } );

        fab_inprg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), IndoorProject.class);
                startActivity( intent );
                finish();
            }
        } );

        fab_outprg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), OutdoorProject.class);
                startActivity( intent );
                finish();
            }
        } );

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//                        Toast.makeText(getApplicationContext(), "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor( Color.parseColor("#FFFFFF"));
//                        Toast.makeText(getApplicationContext(), "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

//    private void setSingleEvent(GridLayout mainGrid) {
//        //Loop all child item of Main Grid
//        for (int i = 0; i < mainGrid.getChildCount(); i++) {
//            //You can see , all child item is CardView , so we just cast object to CardView
//            CardView cardView = (CardView) mainGrid.getChildAt(i);
//            final int finalI = i;
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
////                    Intent intent = new Intent(getApplicationContext(),ActivityOne.class);
////                    intent.putExtra("info","This is activity from card item index  "+finalI);
////                    startActivity(intent);
//
//                }
//            });
//        }
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen( GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected( MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home) {
            Intent navHome = new Intent(getApplicationContext(), Manufacture.class);
            getApplication().startActivity(navHome);


        }
//        if (id == R.id.user) {
//            Intent navHome = new Intent(getApplicationContext(), UserActivity.class);
//            getApplication().startActivity(navHome);


        if (id == R.id.project) {
            Intent navLive = new Intent(getApplicationContext(), ProjectActivity.class);
            getApplication().startActivity(navLive);

        }
        else if (id == R.id.vendor) {
            Intent navSchedule = new Intent(getApplicationContext(), VendorActivity.class);
            getApplication().startActivity(navSchedule);}

        else if (id == R.id.procedure) {
            Intent navSchedule = new Intent(getApplicationContext(), ProcedureActivity.class);
            getApplication().startActivity(navSchedule);
        }
        else if (id == R.id.indoorprg) {
            Intent navSchedule = new Intent(getApplicationContext(), IndoorProject.class);
            getApplication().startActivity(navSchedule);
        }
        else if (id == R.id.outdoorprg) {
            Intent navSchedule = new Intent(getApplicationContext(), OutdoorProject.class);
            getApplication().startActivity(navSchedule);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer( GravityCompat.START);
        return true;
    }
}