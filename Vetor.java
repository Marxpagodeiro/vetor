/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vetor;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Vetor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[]lados = new double[3];
        int cont = 0;
        while(cont< lados.length){
            System.out.println("digite os lados " + (cont+1));
            lados[cont] =in.nextDouble();
            cont++;
        }
        if(lados[0] < (lados[1]+lados[2]) && lados[1] < (lados[0]+lados[2]) && lados[2] <(lados[1]+lados[0])){
            System.out.println("triangulo");
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println("Equilatero");
            }else if(lados[0]==lados[1] || lados[0]==lados[2] || lados[1]==lados[2]){
                System.out.println("isósceles");
            }else{
                System.out.println("escaleno");
            }
        }
    }
}
