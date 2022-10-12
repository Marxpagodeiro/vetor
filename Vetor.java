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
        // Variaveis
        String Da = "Com base nos lados dados pelo usuario:";
        String Tri = "A figura é um triagulo";
        String NTri = "A figura não é um triagulo";
        String Equi = "Do tipo triagulo Equilatero";
        String Iso = "Do tipo triagulo Isósceles";
        String Esca = "Do tipo triagulo Escaleno";
        String Ret= "E é um triangulo Retangulo";
        String NRet = "E não é um triagulo Retangulo";
        String lado = "Digite o valor do lado ";
        double[]lados = new double[3];
        int cont = 0;
        int pos=0;
        double total=0;
        double aux= 0;
        
        // Pergunta ao usuario.
        
        while(cont< lados.length){
            System.out.println(lado + (cont+1));
            lados[cont] =in.nextDouble();
            cont++;
        }
        
        // Calculo para descobrir qual é o valor maior.
        
        cont=1;
        while(cont<lados.length){
            if(lados[cont]>lados[pos]){
                pos=cont;
            }
            cont++;
        }
        
        // Calculo para descobrir a soma dos dois lados menores.
        
        cont=0;
        while(cont<lados.length){
            if(cont!=pos){
                total=total+lados[cont];
            }
            cont++;
        }
        
        // Variavel auxiliar.
        
        aux=lados[0];
        lados[0]=lados[pos];
        lados[pos]=aux;
        
        // Afirmações para ver se é triangulo; se for triangulo, para ver de qual tipo é, e se ele é retangulo.
        System.out.println(Da);
        if(total>lados[pos]){
            System.out.println(Tri);
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println(Equi);
            }else if(lados[0]==lados[1] || lados[0]==lados[2] || lados[1]==lados[2]){
                System.out.println(Iso);
            }else{
                System.out.println(Esca);
            }
            if((lados[0]*lados[0])== (lados[1]*lados[1])+(lados[2]*lados[2])){
               System.out.println(Ret); 
            }else{
                System.out.println(NRet); 
 
            }
        }else{
           System.out.println(NTri); 
        } 
    }
}
