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
    private String operador;
    private String resultado = "";
    private Double resul = 0.0;
    private Double num1, num2, num3;

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

        printarVariaveis();
    }


    //Método para açõa do botão igual.
    public void clickIgual(View view){
        calcular();
    }


    //Método para ação dos botões de operaçõo. 66-81
    public void clickSoma(View view){
        botaoDeOperacao(" + ");
    }

    public void clickSubtracao(View view){
        botaoDeOperacao(" - ");
    }

    public void clickMultiplicacao(View view){
        botaoDeOperacao(" * ");
    }

    public void clickDivisao(View view){
        botaoDeOperacao(" / ");
    }


    //Método para ação dos botões de números. 84-123
    public void clickZero(View view){
        clickNumero("0");
    }

    public void clickUm(View view){
        clickNumero("1");
    }

    public void clickDois(View view){
        clickNumero("2");
    }

    public void clickTres(View view){
        clickNumero("3");
    }

    public void clickQuatro(View view){
        clickNumero("4");
    }

    public void clickCinco(View view){
        clickNumero("5");
    }

    public void clickSeis(View view){
        clickNumero("6");
    }

    public void clickSete(View view){
        clickNumero("7");
    }

    public void clickOito(View view){
        clickNumero("8");
    }

    public void clickNove(View view){
        clickNumero("9");
    }


    //Método para ação do botão C.
    public void clickC(View view){
        textVisor.setText("");
        textResposta.setText("");
        limparVariáveis();

        printarVariaveis();
    }


    //Método que volta as variáveis para estado inicial.
    public void limparVariáveis(){
        number1 = "";
        number2 = "";
        number3 = "";
        num1 = null;
        num2 = null;
        num3 = null;
        operador = null;
        resultado = "";
        resul = 0.0;

        printarVariaveis();
    }


    //Método que printa as variáveis no console (Serve como Debug).
    public void printarVariaveis(){
        System.out.println("number1: "+number1);
        System.out.println("number2: "+number2);
        System.out.println("number3: "+number3);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("num3: "+num3);
        System.out.println("operador: "+operador);
        System.out.println("resultado: "+resultado);
        System.out.println("resul: "+resul);
        System.out.println("-------------------------------------");
    }


    //Método para realizar operações.
    public void calcular(){
        //Inicialização de variáveis para não ocorrer bug da variável não inicializada.
        num1 = 0.0;
        num2 = 0.0;
        num3 = 0.0;
        resul = 0.0;

        //Condicional que define se o calculo deve ser feito com o num3 ou não.
        if (resultado == ""){
            num1 = Double.valueOf(number1);
            num2 = Double.valueOf(number2);
            calculo = new Calculo(num1, num2, operador);
            calculo.calcular();
            resultado = calculo.getResultadoString();
            textResposta.setText(resultado);
            num3 = 0.0;
            number3= "";
        } else {
            resul = Double.valueOf(resultado);
            num3 = Double.valueOf(number3);
            calculo = new Calculo(resul, num3, operador);
            calculo.calcular();
            resultado = calculo.getResultadoString();
            resul = Double.valueOf(resultado);
            textResposta.setText(resultado);
            num3 = 0.0;
            number3= "";
        }
        printarVariaveis();
    }


    //Método que adiciona os operadores no calculo.
    public void botaoDeOperacao(String operacaoD){
        operador = operacaoD;
        String visor = textVisor.getText().toString();

        if (number1 != "" && number2 != "" && number3.equals("")){

            if (resultado.equals("")){
                num1 = Double.valueOf(number1);
                num2 = Double.valueOf(number2);
                calculo = new Calculo(num1, num2, operador);
                calculo.calcular();
                resultado = calculo.getResultado().toString();
                resul = Double.valueOf(resultado);
                textResposta.setText(resultado);
                textVisor.setText(resultado + operacaoD);
                number3 = "0";
            }else if (resultado != ""){
                textVisor.setText(resultado+operacaoD);
                textResposta.setText("");
                resul = Double.valueOf(resultado);
            }else{
                textVisor.setText(visor+ operacaoD);
            }
        }
        textVisor.setText(visor+ operacaoD);
        printarVariaveis();
    }


    //Método que adiciona os números no calculo.
    public void clickNumero(String numeroString){

        //Condicional que define em qual variável o número deve ser armazenado.
        if (operador == null && resultado == ""){
            number1 += numeroString;
        }else if (operador != null && resultado == ""){
            number2 += numeroString;
        }else if (operador != null && resultado != ""){
            number3 += numeroString;
        }

        //Método de validação de números antes do terceiro argumento
//        if (operador != null){
//            number2 += "0";
//        }else{
//            number1 += "0";
//        }

        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ numeroString);

        printarVariaveis();
    }
}