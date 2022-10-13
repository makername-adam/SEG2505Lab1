package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminSignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_up);

        Intent gobackWelcomePage = new Intent(getApplicationContext(), MainActivity.class);
        //Intent adminSignIntent = new Intent(getApplicationContext(), SignUpActivity.class);



        Button gobackbutton = (Button) findViewById(R.id.goBackButton);
        gobackbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(gobackWelcomePage);
            }

        });


    }
}