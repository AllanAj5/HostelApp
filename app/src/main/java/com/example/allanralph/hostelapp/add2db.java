//package com.example.allanralph.hostelapp;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class add2db extends AppCompatActivity {
//
//    EditText e1,e2,e3,e4,e5;
//    Button b1;
//    dbHandler dbh;


//        int e11;
//        String e22,e33,e44,e55;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add2db);
//
//        dbh=new dbHandler(
//                getApplicationContext(),
//                "northNVg",
//                null,
//                1
//        );
//
//        e1=(EditText)findViewById(R.id.dayid);
//        e2=(EditText)findViewById(R.id.day);
//        e3=(EditText)findViewById(R.id.breakfast);
//        e4=(EditText)findViewById(R.id.lunch);
//        e5=(EditText)findViewById(R.id.dinner);
//        b1=(Button)findViewById(R.id.add);
//
//
//         int e11=Integer.parseInt(e1.getText().toString());
//         String e22=e2.getText().toString();
//         String e33=e3.getText().toString();
//         String e44=e4.getText().toString();
//         String e55=e5.getText().toString();
//
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dbh.addData(e11,e22,e33,e44,e55);
//
//            }
//        });
//
//
//    }
//}
