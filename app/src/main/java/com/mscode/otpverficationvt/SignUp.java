package com.mscode.otpverficationvt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class SignUp<TextInputLayout> extends AppCompatActivity {




    //Variables
    TextInputLayout input_mobile_number, input_mobile_number1, input_mobile_number2, input_mobile_number3, input_mobile_number4;
    Button button;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    private Object UserHelperClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
//Hooks to all xml elements in activity_sign_up.xml
       final   EditText input_mobile_number = findViewById(R.id.input_mobile_number);
       final   EditText input_mobile_number1 = findViewById(R.id.input_mobile_number1);
       final EditText input_mobile_number2 = findViewById(R.id.input_mobile_number2);
       final EditText input_mobile_number3 = findViewById(R.id.input_mobile_number3);
       final EditText input_mobile_number4 = findViewById(R.id.input_mobile_number4);
       
       final helper dao = new helper();
       
         button = findViewById(R.id.button);

//Save data in FireBase on button click
        button.setOnClickListener(v-> {

            UserHelperClass emp  = new UserHelperClass(input_mobile_number.getText().toString(),
                    input_mobile_number1.getText().toString(),
                    input_mobile_number2.getText().toString(),
                    input_mobile_number3.getText().toString(),
                    input_mobile_number4.getText().toString());


            dao.add(emp).addOnSuccessListener( suc->
                    {
                        Toast.makeText(this,"Submited", Toast.LENGTH_SHORT).show();

                    }).addOnFailureListener(er->
            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();

            });


        });//Register Button method end
    }//onCreate Method End

    public void verifyenterotptwo(View view){
        Intent intent= new Intent(this,verifyenterotptwo.class);
        startActivity(intent);

    }
    private void startAction(Intent intent){

    }
}
