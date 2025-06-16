package org.desviante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        scanner.close();

        if (validarSenha(senha)){
            System.out.println("senha valida");
        }
        else {
            System.out.println("senha invalida");
        }
    }

    public static boolean validarSenha(String senha) {
        if (senha.length()<8){
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i=0; i<senha.length(); i++){
            char caractereAtual = senha.charAt(i);
            if(Character.isUpperCase(caractereAtual)){
                temMaiuscula = true;
            } else if (Character.isLowerCase(caractereAtual)) {
                temMinuscula = true;
            } else if (Character.isDigit(caractereAtual)){
                temNumero = true;
            }

            if (temMaiuscula && temMinuscula && temNumero) {
                return true;
            }
        }
        return false;
    }
}