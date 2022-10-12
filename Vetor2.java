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
public class Vetor2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[]lados = new double[3];
        int cont = 0;
        while(cont< lados.length){
            System.out.println("digite os lados " + (cont+1));
            lados[cont] =in.nextDouble();
            cont++;
        }
        int pos=0;
        cont=1;
        while(cont<lados.length){
            if(lados[cont]>lados[pos]){
                pos=cont;
            }
            cont++;
        }
        cont=0;
        double total=0;
        while(cont<lados.length){
            if(cont!=pos){
                total=total+lados[cont];
            }
            cont++;
        }
        if(total>lados[pos]){
            System.out.println("triangulos");
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println("Equilatero");
            }else if(lados[0]==lados[1] || lados[0]==lados[2] || lados[1]==lados[2]){
                System.out.println("isósceles");
            }else{
                System.out.println("escaleno");
            }
        }else{
           System.out.println("Não é triangulos"); 
        } 
    }
}
