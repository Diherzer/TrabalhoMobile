package com.example.diegoherzer.trabalhomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Boolean logIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //Iniciando código de Login (Button)

        Button btlogin = (Button) findViewById(R.id.btLogin);

        //Criar o OnClick do button

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override

            //Método on click que fará que o reconhecimento do login
            public void onClick(View view) {
                TextView tlogin = (TextView) findViewById(R.id.tLogin);
                TextView tsenha = (TextView) findViewById(R.id.tsenha);
                String login = tlogin.getText().toString();
                String senha = tsenha.getText().toString();


                //Modificar para que o atendente receba este acesso

                if(login.equals("admin")&&senha.equals("admin")){
                    alert("LOGIN REALIZADO COM SUCESSO");

                    //Caso consiga logar a atctivity MenuHome ira abrir(controladora)
                    logIn = true;

                }else{
                    alert("LOGIN OU SENHA INCORRETO");
                }

            }
        });
    }


    //Método que retornará se o atendente conectou com sucesso no sistema
    private void alert(String s){
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();


    }
}
