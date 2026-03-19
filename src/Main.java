import entities.*;

import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);


        Produto produto1 = new Produto("batata", 3.2);
        Produto produto2 = new Produto("batata doce", 5.55);

        System.out.println(produto1);
        System.out.println(produto2+"\n\n");

        Aluno aluno1 = new Aluno("Gabinho", 10.0);
        Aluno aluno2 = new Aluno("Taigos", 100.0);
        Aluno aluno3 = new Aluno("Zezinho", 9.5);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3 + "\n\n");


        Animal[] arrayDeAnimais = new Animal[2];

        arrayDeAnimais[0] = new Gato("Roberto");
        arrayDeAnimais[1] = new Cachorro("Thor");

        for(Animal a : arrayDeAnimais){
            a.emitirSom();
        }

        int resp = 0;
        int a,b,c;
        do {
            try {
                System.out.println("\n\n------Calculadora--------------\n");
                System.out.println("Selecione uma opção: ");
                System.out.println("1 - Somar dois números");
                System.out.println("2 - Somar três inteiros");
                System.out.println("3 - Subtrair dois números");
                System.out.println("4 - Multiplicar dois números");
                System.out.println("5 - Dividir dois números");
                System.out.println("6 - Somar dois números decimais");
                System.out.println("0 - Encerrar");

                resp = Integer.parseInt(sc.nextLine());

                if (resp == 0) break;

                Calculadora calc = new Calculadora();

                switch (resp) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        System.out.println("Resultado: " + calc.soma(a, b));
                        break;

                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o terceiro número: ");
                        c = Integer.parseInt(sc.nextLine());
                        System.out.println("Resultado: " + calc.soma(a, b, c));
                        break;

                    case 3:
                        System.out.print("Digite o primeiro número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        System.out.println("Resultado: " + calc.sub(a, b));
                        break;

                    case 4:
                        System.out.print("Digite o primeiro número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        System.out.println("Resultado: " + calc.mult(a, b));
                        break;

                    case 5:
                        System.out.print("Digite o primeiro número: ");
                        a = Integer.parseInt(sc.nextLine());
                        System.out.print("Digite o segundo número: ");
                        b = Integer.parseInt(sc.nextLine());
                        System.out.println("Resultado: " + calc.div(a, b));
                        break;

                    case 6:
                        System.out.print("Digite o primeiro número decimal (ex: 10.5): ");
                        double a2 = Double.parseDouble(sc.nextLine());
                        System.out.print("Digite o segundo número decimal: ");
                        double b2 = Double.parseDouble(sc.nextLine());
                        System.out.println("Resultado: " + calc.soma(a2, b2));
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas NÚMEROS válidos!");
            } catch (ArithmeticException e) {
                System.out.println("Erro matemático: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }

        } while (resp != 0);

    }
}