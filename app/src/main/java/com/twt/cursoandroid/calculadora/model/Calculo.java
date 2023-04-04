package com.twt.cursoandroid.calculadora.model;

public class Calculo {

    private Double num1, num2;
    private String operacao;

    public Calculo() {
    }

    public Calculo(Double num1, Double num2, String operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }


    //TODO Validar método de soma
    public Double calcular(Double num1, Double num2, String operacao){
        Double resultado = null;
        if (operacao.equals("+")){
            resultado = num1+num2;
        }else if (operacao.equals("-")){
            resultado = num1-num2;
        }else if (operacao.equals("*")){
            resultado = num1*num2;
        }else if (operacao.equals("/")){
            resultado = num1/num2;
        }
        return resultado;
    }
}
