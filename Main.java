package Condicional;

import java.util.Scanner;

// obj de confirmar o nome com letra maiuscula 
public class Main {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva seu primeiro Nome:");
        String nome = sc.nextLine();

        char primeiraLetra = nome.charAt(0);

        String primeiraLetraNome = " " + primeiraLetra;

        if(primeiraLetraNome.equals(primeiraLetraNome.toUpperCase())){
            System.out.println("Nome Válido");
        }
        else{
            System.out.println("Nome inválido");
        }
        



        sc.close();

    }
    
}
