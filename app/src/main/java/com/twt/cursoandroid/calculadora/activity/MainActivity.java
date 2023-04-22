package com.twt.cursoandroid.calculadora.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.twt.cursoandroid.calculadora.R;
import com.twt.cursoandroid.calculadora.controller.CalculadoraController;


public class MainActivity extends AppCompatActivity {

    private Button buttonZero, buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco,
            buttonSeis, buttonSete, buttonOito, buttonNove, buttonIgual, buttonSoma, buttonSubtracao,
            buttonMultiplicacao, buttonDiv, buttonVirgula, buttonMaisMenos, buttonParenteses, buttonC;
    private TextView textVisor, textResposta;
    private CalculadoraController calculadoraController;
    

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

        calculadoraController = new CalculadoraController();

        calculadoraController.printarVariaveis();
    }


    //Método para açõa do botão igual.
    public void clickIgual(View view){
        calculadoraController.calcular();
        textResposta.setText(calculadoraController.getResultado());
    }

    //Método para ação do botão C.
    public void clickC(View view){
        textVisor.setText("");
        textResposta.setText("");
        calculadoraController.limparVariaveis();

        calculadoraController.printarVariaveis();
    }


    //Método para ação dos botões de operaçõo. 66-81
    public void clickSoma(View view){
        calculadoraController.botaoDeOperacao(" + ");
        operadorVisor(" + ");
    }

    public void clickSubtracao(View view){
        calculadoraController.botaoDeOperacao(" - ");
        operadorVisor(" - ");
    }

    public void clickMultiplicacao(View view){
        calculadoraController.botaoDeOperacao(" * ");
        operadorVisor(" * ");
    }

    public void clickDivisao(View view){
        calculadoraController.botaoDeOperacao(" / ");
        operadorVisor(" / ");
    }


    //Método para ação dos botões de números. 84-123
    public void clickZero(View view){
        calculadoraController.clickNumero("0");
        numeroVisor("0");
    }

    public void clickUm(View view){
        calculadoraController.clickNumero("1");
        numeroVisor("1");
    }

    public void clickDois(View view){
        calculadoraController.clickNumero("2");
        numeroVisor("2");
    }

    public void clickTres(View view){
        calculadoraController.clickNumero("3");
        numeroVisor("3");
    }

    public void clickQuatro(View view){
        calculadoraController.clickNumero("4");
        numeroVisor("4");
    }

    public void clickCinco(View view){
        calculadoraController.clickNumero("5");
        numeroVisor("5");
    }

    public void clickSeis(View view){
        calculadoraController.clickNumero("6");
        numeroVisor("6");
    }

    public void clickSete(View view){
        calculadoraController.clickNumero("7");
        numeroVisor("7");
    }

    public void clickOito(View view){
        calculadoraController.clickNumero("8");
        numeroVisor("8");
    }

    public void clickNove(View view){
        calculadoraController.clickNumero("9");
        numeroVisor("9");
    }


    public void numeroVisor(String numeroString){
        String visor = textVisor.getText().toString();
        textVisor.setText(visor+ numeroString);
    }

    public void operadorVisor(String operacaoVisor){
        String visor = textVisor.getText().toString();

        if (calculadoraController.getNumber1() != "" && calculadoraController.getNumber2() != "" &&
        calculadoraController.getNumber3().equals("")){
            if (calculadoraController.getResultado().equals("")){
                textResposta.setText(calculadoraController.getResultado());
                textVisor.setText(calculadoraController.getResultado() + operacaoVisor);
            }else if (calculadoraController.getResultado() != ""){
                textVisor.setText(calculadoraController.getResultado()+operacaoVisor);
                textResposta.setText("");
            }else {
                textVisor.setText(visor+ operacaoVisor);
            }
        }
    }
}