package com.example.allanralph.hostelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class yelow extends Fragment {
    View v2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v2=inflater.inflate(R.layout.fragment_yelow,container,false);

        v2.findViewById(R.id.yelsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Requested",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getActivity(),MainActivity.class);
                startActivity(i);
            }
        });
        return v2;
    }
}
