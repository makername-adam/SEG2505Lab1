package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String accountType = "customer"; //default type of account

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent logIntent = new Intent(getApplicationContext(), LoginActivity.class);
        Intent signIntent = new Intent(getApplicationContext(), SignUpActivity.class);


        Button buttonCustomer = (Button) findViewById(R.id.btnCustomer);
        buttonCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIntent.putExtra("accountType", "customer");
                startActivity(signIntent);
            }
        });

        Button buttonCook = (Button) findViewById(R.id.btnCook);
        buttonCook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIntent.putExtra("accountType","cook");
                startActivity(signIntent);
            }
        });


        Button buttonLog = (Button) findViewById(R.id.btnLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(logIntent);
            }
        });


    }
}