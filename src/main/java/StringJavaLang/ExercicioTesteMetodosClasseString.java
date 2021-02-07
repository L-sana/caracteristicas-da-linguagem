package StringJavaLang;

import java.lang.*;
import java.util.*;

public class ExercicioTesteMetodosClasseString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String string;

        System.out.println("Exercicio Bootcamp Java Developer Inter na DIO\n");
        System.out.println("Digite uma string para testar alguns metodos da classe String: ");
        string = ent.nextLine();

        var charArray= string.toCharArray();

        System.out.println(charArray.length);

        System.out.println("Aula de Java".split(" "));
        System.out.println(string.concat(" Java "));
        System.out.println(string.replace("a", "4"));
        System.out.println(string.replaceAll("[0-9]", "#"));


    }

}
