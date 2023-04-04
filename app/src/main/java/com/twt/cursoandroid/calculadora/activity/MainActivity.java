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
    private String number1 = "";
    private String number2 = "";
    private String operador;
    private Double num1, num2, resultado;

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


    //Testar condição após criar métodos de calculo
    public void clickSoma(View view){
        if (resultado != null){
            operador = "+";
            String visor = textVisor.getText().toString();
            textVisor.setText(visor+ " + ");
        }else{
            operador = "+";
            String visor = textVisor.getText().toString();
            textVisor.setText(visor+ " + ");
        }
    }

    public void clickSubtracao(View view){
        operador = "-";
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ " - ");
    }

    public void clickMultiplicacao(View view){
        operador = "*";
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ " x ");
    }

    public void clickDivisao(View view){
        operador = "/";
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ " / ");
    }
    //Método para testes de onClick
    public void clickZero(View view){

        if (operador != null){
            number2 += "0";
        }else{
            number1 += "0";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "0");
        System.out.println(number1);
        System.out.println(number2);
    }

    public void clickUm(View view){
        if (operador != null){
            number2 += "1";
        }else{
            number1 += "1";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "1");
    }

    public void clickDois(View view){
        if (operador != null){
            number2 += "2";
        }else{
            number1 += "2";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "2");
    }

    public void clickTres(View view){
        if (operador != null){
            number2 += "3";
        }else{
            number1 += "3";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "3");
    }

    public void clickQuatro(View view){
        if (operador != null){
            number2 += "4";
        }else{
            number1 += "4";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "4");
    }

    public void clickCinco(View view){
        if (operador != null){
            number2 += "5";
        }else{
            number1 += "5";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "5");
    }

    public void clickSeis(View view){
        if (operador != null){
            number2 += "6";
        }else{
            number1 += "6";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "6");
    }

    public void clickSete(View view){
        if (operador != null){
            number2 += "7";
        }else{
            number1 += "7";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "7");
    }

    public void clickOito(View view){
        if (operador != null){
            number2 += "8";
        }else{
            number1 += "8";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "8");
    }

    public void clickNove(View view){
        if (operador != null){
            number2 += "9";
        }else{
            number1 += "9";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "9");
    }

    public void clickC(View view){
        textVisor.setText("");
        number1 = "";
        number2 = "";
    }
}