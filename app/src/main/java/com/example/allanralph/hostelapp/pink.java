package com.example.allanralph.hostelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class pink extends Fragment {

    View v1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v1=inflater.inflate(R.layout.fragment_pink,container,false);

        v1.findViewById(R.id.subpink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Submitted",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });
        return v1;
    }
}
