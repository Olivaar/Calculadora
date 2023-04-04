package com.twt.cursoandroid.calculadora.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.twt.cursoandroid.calculadora.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonZero, buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco,
            buttonSeis, buttonSete, buttonOito, buttonNove, buttonIgual, buttonSoma, buttonSubtracao,
            buttonMultiplicacao, buttonDiv, buttonVirgula, buttonMaisMenos, buttonParenteses, buttonC;
    private TextView textVisor, textResposta;
    private String number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textVisor = findViewById(R.id.textVisor);
        textResposta = findViewById(R.id.textResposta);
        buttonZero =  findViewById(R.id.buttonZero);
        buttonUm = findViewById(R.id.buttonUm);
        buttonDois = findViewById(R.id.buttonDois);
        buttonTres = findViewById(R.id.buttonTres);
        buttonQuatro = findViewById(R.id.buttonQuatro);
        buttonCinco = findViewById(R.id.buttonCinco);
        buttonSeis = findViewById(R.id.buttonSeis);
        buttonSete = findViewById(R.id.buttonSete);
        buttonOito = findViewById(R.id.buttonOito);
        buttonNove = findViewById(R.id.buttonNove);
        buttonMaisMenos = findViewById(R.id.buttonMaisMenos);
        buttonVirgula = findViewById(R.id.buttonVirgula);
        buttonIgual = findViewById(R.id.buttonIgual);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonParenteses = findViewById(R.id.buttonParenteses);
        buttonC = findViewById(R.id.buttonC);
    }


    //Método para testes de onClick
//    public void clickZero(View view){
//        number1 += "0";
//        String teste = textVisor.getText().toString();
//        textVisor.setText(teste+ "0");
//    }
}