package com.coder71.coder71.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import com.android.volley.toolbox.Volley;

import com.google.android.material.navigation.NavigationView;
import com.coder71.coder71.Fragment.ClientsFragment;
import com.coder71.coder71.Fragment.ContactFragment;
import com.coder71.coder71.Fragment.HomeFragment;
import com.coder71.coder71.Fragment.OurProductsFragment;
import com.coder71.coder71.Fragment.OurServicesFragment;
import com.coder71.coder71.Fragment.PortfolioFragment;

import com.coder71.coder71ltd.R;

import org.json.JSONException;
import org.json.JSONObject;

import es.dmoral.toasty.Toasty;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Dialog myDialog;
    ImageView toolbarImage;


    RequestQueue requestQueue;
    Button btn;
    EditText nameEdt, emailEdt, projectNameEdt, requirementEdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myDialog = new Dialog(this);


        drawerLayout = findViewById(R.id.drawerId);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.nevId);
        navigationView.bringToFront();

        toolbarImage = findViewById(R.id.toolbarLogo);
        navigationView.setNavigationItemSelectedListener(this);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.home);


            toolbarImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getApplication(), HomeActivity.class);
                    startActivity(intent);

                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.menu, menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        TextView textClose;
        myDialog.setContentView(R.layout.activity_custom_pop_up);
        textClose = (TextView) myDialog.findViewById(R.id.textClose);
        nameEdt = (EditText) myDialog.findViewById(R.id.NameId);
        emailEdt = (EditText) myDialog.findViewById(R.id.Email_Id);
        projectNameEdt = (EditText) myDialog.findViewById(R.id.project_Id);
        requirementEdt = (EditText) myDialog.findViewById(R.id.ProjectRequirementId);
        btn = (Button) myDialog.findViewById(R.id.PopUpRequestBtnId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEdt.getText().toString();
                String email = emailEdt.getText().toString();
                String projectName = projectNameEdt.getText().toString();
                String req = requirementEdt.getText().toString();

                if (name.trim().isEmpty() || email.trim().isEmpty() || projectName.trim().isEmpty() || req.trim().isEmpty()) {
                    Toasty.error(getApplicationContext(), "Please fill up all fill.", Toast.LENGTH_SHORT, true).show();
                } else {
                    JsonRequest();
                }

            }
        });


        textClose.setText("X");
        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                myDialog.dismiss();
            }
        });


        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
            case R.id.service:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OurServicesFragment()).commit();
                break;
            case R.id.products:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OurProductsFragment()).commit();
                break;
            case R.id.portfolio:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PortfolioFragment()).commit();
                break;
            case R.id.clients:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ClientsFragment()).commit();
                break;
            case R.id.Contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactFragment()).commit();
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void JsonRequest() {

        requestQueue = Volley.newRequestQueue(this);
        String URL = "http://coder71.com/site/sendContactMailFromApp";

        String name = nameEdt.getText().toString();
        String email = emailEdt.getText().toString();
        String projectName = projectNameEdt.getText().toString();
        String req = requirementEdt.getText().toString();

        nameEdt.setText("");
        emailEdt.setText("");
        projectNameEdt.setText("");
        requirementEdt.setText("");

        JSONObject params = new JSONObject();
        try {
            params.put("name", name);
            params.put("email", email);
            params.put("projectname", projectName);
            params.put("projectreq", req);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, URL, params, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Toasty.success(getApplicationContext(), "Success for Request", Toast.LENGTH_SHORT, true).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error + "", Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}
