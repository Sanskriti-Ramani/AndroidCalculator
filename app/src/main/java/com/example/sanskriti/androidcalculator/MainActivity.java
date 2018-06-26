package com.example.sanskriti.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tv1 = findViewById(R.id.first);
       tv2 = findViewById(R.id.second);
       tv3 = findViewById(R.id.third);

        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button del = findViewById(R.id.del);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button dot = findViewById(R.id.dot);
        Button equal = findViewById(R.id.equal);

        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tv1.setText("");
                tv2.setText("");
                tv3.setText("0");
                return false;
            }
        });



        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = tv1.getText().toString();
                String s2 = tv2.getText().toString();
                String s3 = tv3.getText().toString();





            }
        });

        equal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                find(view);
            }
        });

        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               set2(view);
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set2(view);
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set2(view);
            }
        });
        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set2(view);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
              set(view);
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                set(view);
            }
        });











    }

    private void find(View view) {
        String s1 = tv1.getText().toString();
        String s2 = tv2.getText().toString();

        float a1 = Float.parseFloat(s1);
        char temp = s2.charAt(0);
        String rem = "";

        for(int i = 1; i<s2.length(); i++){
            rem = rem + s2.charAt(i);
        }

        if(rem.isEmpty()){
            tv3.setText("=" + s1);
            return;
        }
        float a2 = Float.parseFloat(rem);
        float ans = 0;
        if(temp == '+'){
            ans = a1 + a2;
            tv3.setText("=" + ans);
        }
        else  if(temp == '-'){
            ans = a1 - a2;
            tv3.setText("=" + ans);
        }
        else  if(temp == '*'){
            ans = a1 * a2;
            tv3.setText("=" + ans);
        }
        else  if(temp == '/'){
            ans = a1 / a2;
            tv3.setText("=" + ans);
        }



    }
//gitg
    private void set2(View view) {
        int id = view.getId();

        String s2 = tv2.getText().toString();
        String s3 = tv3.getText().toString();


        if(s3.charAt(0) == '0'){
            if(id == R.id.add){
                s2 = "+";
                tv2.setText(s2);
            }
            else  if(id == R.id.sub){
                s2 = "-";
                tv2.setText(s2);
            }
            else  if(id == R.id.mul){
                s2 = "*";
                tv2.setText(s2);
            }
            else  if(id == R.id.div){
                s2 = "/";
                tv2.setText(s2);
            }

        }
        else{
            String a = "";
            for(int i = 1; i<s3.length(); i++){
                a = a + s3.charAt(i);
            }
            float temp = Float.parseFloat(a);

            tv1.setText(a);

            if(id == R.id.add){
                s2 = "+";
                tv2.setText(s2);
            }
            else  if(id == R.id.sub){
                s2 = "-";
                tv2.setText(s2);
            }
            else  if(id == R.id.mul){
                s2 = "*";
                tv2.setText(s2);
            }
            else  if(id == R.id.div){
                s2 = "/";
                tv2.setText(s2);
            }


        }





    }

    private void set(View view) {
        int id = view.getId();
        String s1 = tv1.getText().toString();
        String s2 = tv2.getText().toString();
        String s3 = tv3.getText().toString();
        String temp = "";
        for(int i = 1; i<s3.length(); i++){
            temp = temp + s3.charAt(i);
        }
        if(!temp.isEmpty()){
            tv1.setText("");
            tv2.setText("");
            tv3.setText("0");
            s1 = tv1.getText().toString();
            s2 = tv2.getText().toString();
        }





        if(s1.isEmpty()) {
                if (id == R.id.b0) {
                    s1 = "0";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b1) {
                    s1 = "1";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b2) {
                    s1 = "2";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b3) {
                    s1 = "3";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b4) {
                    s1 = "4";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b5) {
                    s1 = "5";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b6) {
                    s1 = "6";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b7) {
                    s1 = "7";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b8) {
                    s1 = "8";
                    tv1.setText(s1);
                }
                else  if (id == R.id.b9) {
                    s1 = "9";
                    tv1.setText(s1);
                }
                else if(id == R.id.dot){
                    s1 = "0.";
                    tv1.setText(s1);
                }
            }
            else if(!s1.isEmpty() && s2.isEmpty()){
            if (id == R.id.b0) {
                s1 =  s1 + "0";
                tv1.setText(s1);
            }
            else  if (id == R.id.b1) {
                s1 =  s1 + "1";
                tv1.setText(s1);
            }
            else  if (id == R.id.b2) {
                s1 = s1 + "2";
                tv1.setText(s1);
            }
            else  if (id == R.id.b3) {
                s1 = s1 + "3";
                tv1.setText(s1);
            }
            else  if (id == R.id.b4) {
                s1 = s1 + "4";
                tv1.setText(s1);
            }
            else  if (id == R.id.b5) {
                s1 = s1 + "5";
                tv1.setText(s1);
            }
            else  if (id == R.id.b6) {
                s1 = s1 + "6";
                tv1.setText(s1);
            }
            else  if (id == R.id.b7) {
                s1 = s1 + "7";
                tv1.setText(s1);
            }
            else  if (id == R.id.b8) {
                s1 = s1 + "8";
                tv1.setText(s1);
            }
            else  if (id == R.id.b9) {
                s1 = s1 + "9";
                tv1.setText(s1);
            }
            else if(id == R.id.dot){
                s1 = s1 + ".";
                tv1.setText(s1);
            }


        }
        else if(s2.charAt(0) == '+' || s2.charAt(0) == '-' || s2.charAt(0) == '*' || s2.charAt(0) == '/'){

            if (id == R.id.b0) {
                s2 =  s2 + "0";
                tv2.setText(s2);
            }
            else  if (id == R.id.b1) {
                s2 =  s2 + "1";
                tv2.setText(s2);
            }
            else  if (id == R.id.b2) {
                s2 = s2 + "2";
                tv2.setText(s2);
            }
            else  if (id == R.id.b3) {
                s2 = s2 + "3";
                tv2.setText(s2);
            }
            else  if (id == R.id.b4) {
                s2 = s2 + "4";
                tv2.setText(s2);
            }
            else  if (id == R.id.b5) {
                s2 = s2 + "5";
                tv2.setText(s2);
            }
            else  if (id == R.id.b6) {
                s2 = s2 + "6";
                tv2.setText(s2);
            }
            else  if (id == R.id.b7) {
                s2 = s2 + "7";
                tv2.setText(s2);
            }
            else  if (id == R.id.b8) {
                s2 = s2 + "8";
                tv2.setText(s2);
            }
            else  if (id == R.id.b9) {
                s2 = s2 + "9";
                tv2.setText(s2);
            }
            else  if (id == R.id.dot) {
                if(s2.length() == 1){
                    s2 = s2 + "0.";
                    tv2.setText(s2);
                }
                else {
                    s2 = s2 + ".";
                    tv2.setText(s2);
                }
            }
        }





    }


}
