package com.twt.cursoandroid.calculadora.controller;

import com.twt.cursoandroid.calculadora.model.Calculo;

public class CalculadoraController {
    private String number1 = "";
    private String number2 = "";
    private String number3 = "";
    private String operador;
    private String resultado = "";
    private Double resul = 0.0;
    private Double num1, num2, num3;

    private Calculo calculo;

    public CalculadoraController(){
    }

    public String getResultado() {
        return resultado;
    }

    public String getNumber1() {
        return number1;
    }

    public String getNumber2() {
        return number2;
    }

    public String getNumber3() {
        return number3;
    }

    //Método que volta as variáveis para estado inicial.
    public void limparVariaveis(){
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
            resultado = calculo.getResultado().toString();
            num3 = 0.0;
            number3= "";
        } else {
            resul = Double.valueOf(resultado);
            num3 = Double.valueOf(number3);
            calculo = new Calculo(resul, num3, operador);
            calculo.calcular();
            resultado = calculo.getResultado().toString();
            resul = Double.valueOf(resultado);
            num3 = 0.0;
            number3= "";
        }
        printarVariaveis();
    }


    //Método que adiciona os operadores no calculo.
    public void botaoDeOperacao(String operacaoD){
        operador = operacaoD;

        if (number1 != "" && number2 != "" && number3.equals("")){

            if (resultado.equals("")){
                num1 = Double.valueOf(number1);
                num2 = Double.valueOf(number2);
                calculo = new Calculo(num1, num2, operador);
                calculo.calcular();
                resultado = calculo.getResultado().toString();
                resul = Double.valueOf(resultado);
                number3 = "0";
            }else if (resultado != ""){
                resul = Double.valueOf(resultado);
            }
        }

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

        printarVariaveis();
    }
}
