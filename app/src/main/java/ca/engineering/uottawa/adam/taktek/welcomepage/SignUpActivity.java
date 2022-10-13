package ca.engineering.uottawa.adam.taktek.welcomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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
                if (! courrielText.getText().toString().isEmpty() && ! passwordText.getText().toString().isEmpty()
                        && !prenomText.getText().toString().isEmpty() && !nomText.getText().toString().isEmpty()
                        && !addresseText.getText().toString().isEmpty()) {
                    /*UserSignUp.courriel = courrielText.getText().toString();
                    UserSignUp.password = passwordText.getText().toString();
                    UserSignUp.prenom = prenomText.getText().toString();
                    UserSignUp.nom = nomText.getText().toString();
                    UserSignUp.addresse = addresseText.getText().toString();*/
                    //save user info and launch homepage
                }else{ // one or more fields is missing:
                    //Toast.makeText(SignUpActivity.this, "Please enter all fields ", Toast.LENGTH_LONG).show();
                    Toast logIntoast = Toast.makeText(SignUpActivity.this, "Please enter all fields ", Toast.LENGTH_LONG); //.show();
                    View v = logIntoast.getView();
                    TextView text = (TextView) v.findViewById(android.R.id.message);
                    text.setTextAppearance(R.style.toastTextStyle);
                    logIntoast.show();
                }
            }
        });

    }
}