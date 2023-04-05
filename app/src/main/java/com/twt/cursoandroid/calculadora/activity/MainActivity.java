package com.twt.cursoandroid.calculadora.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.twt.cursoandroid.calculadora.R;
import com.twt.cursoandroid.calculadora.model.Calculo;

public class MainActivity extends AppCompatActivity {

    private Button buttonZero, buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco,
            buttonSeis, buttonSete, buttonOito, buttonNove, buttonIgual, buttonSoma, buttonSubtracao,
            buttonMultiplicacao, buttonDiv, buttonVirgula, buttonMaisMenos, buttonParenteses, buttonC;
    private TextView textVisor, textResposta;
    private String number1 = "";
    private String number2 = "";
    private String number3 = "";
    private String operador, resultado;
    private Double num1, num2, num3, resul;

    private Calculo calculo;

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


    public void clickIgual(View view){

        num1 = 0.0;
        num2 = 0.0;
        num3 = 0.0;
        resul = 0.0;

        if (resultado == null){
            num1 = Double.valueOf(number1);
            num2 = Double.valueOf(number2);
            calculo = new Calculo(num1, num2, operador);
            calculo.calcular();
            resultado = calculo.getResultado().toString();
            System.out.println(resultado);
        } else {
            resul = Double.valueOf(resultado);
            num3 = Double.valueOf(number3);
            calculo = new Calculo(resul, num3, operador);
            calculo.calcular();
            resultado = calculo.getResultado().toString();
            System.out.println(resultado);
        }

        System.out.println(resultado);
    }


    //TODO Testar condição após criar métodos de calculo
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

    public void clickZero(View view){

        if (operador == null && resultado == null){
            number1 = "0";
        }else if (operador != null && resultado == null){
            number2 = "0";
        }else if (operador != null && resultado != null){
            number3 = "0";
        }

        //Método de validação de números antes do terceiro argumento
//        if (operador != null){
//            number2 += "0";
//        }else{
//            number1 += "0";
//        }

        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "0");
    }


    public void clickUm(View view){
        if (operador == null && resultado == null){
            number1 = "1";
        }else if (operador != null && resultado == null){
            number2 = "1";
        }else if (operador != null && resultado != null){
            number3 = "1";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "1");
    }

    public void clickDois(View view){
        if (operador == null && resultado == null){
            number1 = "2";
        }else if (operador != null && resultado == null){
            number2 = "2";
        }else if (operador != null && resultado != null){
            number3 = "2";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "2");
    }

    public void clickTres(View view){
        if (operador == null && resultado == null){
            number1 = "3";
        }else if (operador != null && resultado == null){
            number2 = "3";
        }else if (operador != null && resultado != null){
            number3 = "3";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "3");
    }

    public void clickQuatro(View view){
        if (operador == null && resultado == null){
            number1 = "4";
        }else if (operador != null && resultado == null){
            number2 = "4";
        }else if (operador != null && resultado != null){
            number3 = "4";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "4");
    }

    public void clickCinco(View view){
        if (operador == null && resultado == null){
            number1 = "5";
        }else if (operador != null && resultado == null){
            number2 = "5";
        }else if (operador != null && resultado != null){
            number3 = "5";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "5");
    }

    public void clickSeis(View view){
        if (operador == null && resultado == null){
            number1 = "6";
        }else if (operador != null && resultado == null){
            number2 = "6";
        }else if (operador != null && resultado != null){
            number3 = "6";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "6");
    }

    public void clickSete(View view){
        if (operador == null && resultado == null){
            number1 = "7";
        }else if (operador != null && resultado == null){
            number2 = "7";
        }else if (operador != null && resultado != null){
            number3 = "7";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "7");
    }

    public void clickOito(View view){
        if (operador == null && resultado == null){
            number1 = "8";
        }else if (operador != null && resultado == null){
            number2 = "8";
        }else if (operador != null && resultado != null){
            number3 = "8";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "8");
    }

    public void clickNove(View view){
        if (operador == null && resultado == null){
            number1 = "9";
        }else if (operador != null && resultado == null){
            number2 = "9";
        }else if (operador != null && resultado != null){
            number3 = "9";
        }
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ "9");
    }

    public void clickC(View view){
        textVisor.setText("");
        number1 = "";
        number2 = "";
        number3 = "";
    }
}