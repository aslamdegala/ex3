package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class linear extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

EditText edi1,edi2,edi3,edi4;
Button subb;
RadioButton rdb;//1,rdb2;
Spinner spinner;
TextView nam,pas,ad,gen,age,dob,sta;
RadioGroup radioGroup;
DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        edi1=findViewById(R.id.ed1);
        edi2=findViewById(R.id.ed2);
        edi3=findViewById(R.id.ed3);
        edi4=findViewById(R.id.ed4);
      //  rdb1=findViewById(R.id.rd1);
      //  rdb2=findViewById(R.id.rd2);
        subb=findViewById(R.id.sub);
         nam=findViewById(R.id.username);
        pas=findViewById(R.id.pa);
        ad=findViewById(R.id.address);
        gen=findViewById(R.id.gender);
        age=findViewById(R.id.age);
        dob=findViewById(R.id.dob);
        sta=findViewById(R.id.state);
       spinner=findViewById(R.id.spinner);
       radioGroup=findViewById(R.id.radioGroup1);
       datePicker=findViewById(R.id.dp1);
      // spinner.setOnItemSelectedListener(this);
       ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.state,android.R.layout.simple_spinner_item);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(adapter);
       spinner.setOnItemSelectedListener(this);


}

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    String s=adapterView.getItemAtPosition(i).toString();

      //  Toast.makeText(adapterView.getContext(), s, Toast.LENGTH_SHORT).show();
        sta.setText("State :"+s);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void submit(View view) {
        int i=radioGroup.getCheckedRadioButtonId();
       rdb=(RadioButton)findViewById(i);
       if(i==-1){
           Toast.makeText(this, "nothing is selected", Toast.LENGTH_SHORT).show();
       }
       else{
           String n=rdb.getText().toString();
           gen.setText("gender :"+n);
       }

       StringBuilder builder=new StringBuilder();
       builder.append(datePicker.getMonth());
       builder.append(datePicker.getDayOfMonth());
       builder.append(datePicker.getYear());
       String date=builder.toString();
       dob.setText("Date of Birth :"+date);
       String a,b,c,d;
       a= edi1.getText().toString();
       b= edi2.getText().toString();
       c= edi3.getText().toString();
       d= edi4.getText().toString();
       nam.setText("Name :"+a);
        pas.setText("Password :"+b);
        ad.setText("Address :"+c);
        age.setText("Age :"+d);





    }
}