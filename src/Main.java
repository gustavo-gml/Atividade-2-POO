import entities.Aluno;
import entities.Animal;
import entities.Gato;
import entities.Cachorro;
import entities.Produto;

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

        try{
            System.out.println("\n\n------Calculadora--------------\n");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Somar três inteiros");
            System.out.println("3 - Subtrair dois números");
            System.out.println("4 - Multiplicar dois números");
            System.out.println("5 - Dividir dois números");
            int resp = sc.nextInt();

            switch (resp){
                case 1:
                    System.out.println("Digite o némero 1");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException){
            System.out.println("Digite NUMEROS !");
        }

    }
}