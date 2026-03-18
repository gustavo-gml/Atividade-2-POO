package entities;

public class Calculadora {

    public int soma(int a, int b){
        return a + b;
    }
    public int soma(int a, int b, int c){
        return a + b + c;
    }

    public double soma(double a, double b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public int mult(int a, int b){
        return a * b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public int div(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Não é possivel dividir por 0");
        }
        return a / b;

    }

    public double div(double a, double b){
        if(b == 0.0){
            throw new IllegalArgumentException("Não é possivel dividir por 0");
        }
        return a / b;
    }

}
