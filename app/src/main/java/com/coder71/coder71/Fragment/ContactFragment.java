package com.coder71.coder71.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.coder71.coder71ltd.R;

import org.json.JSONException;
import org.json.JSONObject;

import es.dmoral.toasty.Toasty;

public class ContactFragment extends Fragment {

    TextView PhnCall1, PhnCall2;

    EditText nameEdt, emailEdt, projectNameEdt, requirementEdt;
    Button requestBtn;
    private RequestQueue requestQueue;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        PhnCall1 = view.findViewById(R.id.Phone_Num1);
        PhnCall2 = view.findViewById(R.id.Phone_Num2);


        nameEdt = view.findViewById(R.id.NameId);
        emailEdt = view.findViewById(R.id.Email_Id);
        projectNameEdt = view.findViewById(R.id.project_Id);
        requirementEdt = view.findViewById(R.id.ProjectRequirementId);
        requestBtn = view.findViewById(R.id.RequestBtnId);


        requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEdt.getText().toString();
                String email = emailEdt.getText().toString();
                String projectName = projectNameEdt.getText().toString();
                String req = requirementEdt.getText().toString();

                if (name.trim().isEmpty() || email.trim().isEmpty() || projectName.trim().isEmpty() || req.trim().isEmpty()) {
                    Toasty.error(getContext(), "Please fill up all fill.", Toast.LENGTH_SHORT, true).show();
                } else {
                    JsonRequest();
                }
            }
        });


        PhnCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01911774866"));
                startActivity(callIntent);
            }
        });

        PhnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:01736212121"));
                startActivity(callIntent);
            }
        });


        return view;
    }

    private void JsonRequest() {

        requestQueue = Volley.newRequestQueue(getContext());
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
                Toasty.success(getContext(), "Success for Request", Toast.LENGTH_SHORT, true).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error + "", Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonObjectRequest);
        requestQueue.start();

    }
}
