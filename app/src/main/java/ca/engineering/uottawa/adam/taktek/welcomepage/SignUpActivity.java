package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Utilisateur UserSignUp
        if(getIntent().hasExtra("accountType")){
            String accountType = getIntent().getExtras().getString("accountType");
            if(accountType.equals("customer")){
                //UserSignUp = new Client();
            }else if (accountType.equals("cook")){
                //UserSignUp = new Cuisinier();
            }
        }

        EditText courrielText = (EditText) findViewById(R.id.courrielSignEditText);
        EditText passwordText = (EditText) findViewById(R.id.passwordSignEditText);
        EditText prenomText = (EditText) findViewById(R.id.prenomSignEditText);
        EditText nomText = (EditText) findViewById(R.id.nomSignEditText);
        EditText addresseText = (EditText) findViewById(R.id.addresseSignEditText);

        Button enterBtn = (Button) findViewById(R.id.enterSignBtn);
        enterBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                    /*UserSignUp.courriel = courrielText.getText().toString();
                    UserSignUp.password = passwordText.getText().toString();
                    UserSignUp.prenom = prenomText.getText().toString();
                    UserSignUp.nom = nomText.getText().toString();
                    UserSignUp.addresse = addresseText.getText().toString();*/
            }
        });

    }
}