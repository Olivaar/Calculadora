package com.twt.cursoandroid.calculadora.model;

public class Calculo {

    protected Double num1, num2, resultado;
    private String operacao;

    public Calculo() {
    }

    public Calculo(Double num1, Double num2, String operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }


    public Double getResultado() {
        return resultado;
    }


    //TODO Validar método de soma
    public void calcular(){

        switch (operacao){
            case " + ":
                Soma soma = new Soma();
                soma.somar();
            break;
            case " - ":
                Subtracao subtracao = new Subtracao();
                subtracao.subtrair();
            break;
            case " * ":
                Multiplicacao multiplicacao = new Multiplicacao();
                multiplicacao.multiplicar();
            break;
            case " / ":
                Divisao divisao = new Divisao();
                divisao.dividir();
            break;
        }
    }
}
