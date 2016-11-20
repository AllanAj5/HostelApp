package com.example.allanralph.hostelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class time extends AppCompatActivity {
    int day;
    Button showbtn;
    dbHandler dbh;
    static int dbcount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Calendar calendar= Calendar.getInstance();

        dbh = new dbHandler(
                getApplicationContext(),
                "northNVg",
                null,
                1
        );


                int a[]=new int[]{1,2,3,4,5,6,7};
             String b[]=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
             String c[]=new String[]{"noodles","bread + vada","bread+egg","noodles","pav","poori","Bread"};
             String d[]=new String[]{"rice + chapathi","rice + chapathi","rice + chapathi","rice + chapathi","rice + chapathi","rice + chapathi","rice + chapathi"};
             String e[]=new String[]{"Biriyani","veg rice","chapathi + chicken","egg","parota chicken","chapathi","Rice + Chapathi"};

            for(int i=0;i<7;i++) {
                dbh.addData(a[i],b[i],c[i],d[i],e[i]);
            }


         day = calendar.get(Calendar.DAY_OF_WEEK);
        //day=3;
        showbtn=(Button)findViewById(R.id.show);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String display=dbh.getData(day);
                Toast.makeText(getApplicationContext(),display,Toast.LENGTH_SHORT).show();
            }
        });
//        switch (day)
//        {
//            case Calendar.SUNDAY:
//                Toast.makeText(getApplicationContext(),"Sunday",Toast.LENGTH_SHORT).show();
//                break;
//
//            case Calendar.MONDAY:
//                Toast.makeText(getApplicationContext(),"Monday",Toast.LENGTH_SHORT).show();
//                // Current day is Monday
//                break;
//            case Calendar.TUESDAY:
//                Toast.makeText(getApplicationContext(),"Tuesday",Toast.LENGTH_SHORT).show();
//                // etc.
//                break;
//            case Calendar.WEDNESDAY:
//                Toast.makeText(getApplicationContext(),"Wednessday",Toast.LENGTH_SHORT).show();
//                break;
//            case Calendar.THURSDAY:
//                Toast.makeText(getApplicationContext(),"Thursday",Toast.LENGTH_SHORT).show();
//                break;
//            case Calendar.FRIDAY:
//                Toast.makeText(getApplicationContext(),"Friday",Toast.LENGTH_SHORT).show();
//                break;
//            case Calendar.SATURDAY:
//                Toast.makeText(getApplicationContext(),"Saturday",Toast.LENGTH_SHORT).show();
//                break;
//
//        }
    }
}
