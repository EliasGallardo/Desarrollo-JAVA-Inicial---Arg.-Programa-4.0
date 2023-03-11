

package com.mycompany.tp_pronosticos_deportivos;

import java.io.BufferedReader;
import java.io.FileReader;


public class TP_Pronosticos_Deportivos {

    public static void main(String[] args) {
      
        FileReader partidos;
        FileReader pronosticos; 
        BufferedReader lector1;
        BufferedReader lector2;
        
        //estructura para verificar errores
        try {
            
            //inicializo el archivo y le paso el txt a leer
            partidos=new FileReader("E:\\PROGRAMACION\\Desarrollo de JAVA Inicial Arg Programa\\TP - Pronosticos Deportivos\\partidos.txt");
           
            
            // if para corroborar si existe
            if(partidos.ready()){
                lector1 = new BufferedReader(partidos); //le paso al BufferedReader el archivo txt
                String cadena1; //almacena los datos del txt
                
               
               
                System.out.println("TXT  " + "PARTIDOS");
                //ciclo q se ejecuta si hay info en el txt
                while ((cadena1 = lector1.readLine()) != null) {
                    System.out.println(cadena1);
                    
                    
                }
                partidos.close();    
                
            }else{
                System.out.println("El archivo 'partidos.txt' no esta listo para ser leido" );
            }

        } catch (Exception e) {
            
            System.out.println("Error:  " + "NO EXISTE EL ARCHIVO partidos.txt");
        
        }
        
        //salto de linea
       System.out.println();
       System.out.println();
       System.out.println();
        
       
       
        /*SEGUNDO ARCHIVO*/
        
        //estructura para verificar errores
        try {
            
            
            //inicializo archivo y le paso el txt a leer
            
            pronosticos=new FileReader("E:\\PROGRAMACION\\Desarrollo de JAVA Inicial Arg Programa\\TP - Pronosticos Deportivos\\pronosticos.txt");

            if( pronosticos.ready()){
                
                lector2 = new BufferedReader(pronosticos);
                
                String cadena2;
                
                System.out.println("TXT  " + "PRONOSTICOS");
                while ((cadena2 = lector2.readLine()) != null) {

                    System.out.println(cadena2);
                }
            }else{
                System.out.println("El archivo 'pronosticos.txt' no esta listo para ser leido" );
            }

        } catch (Exception e) {
            
            System.out.println("Error:  " + "NO EXISTE EL ARCHIVO Pronosticos");
        
        } 
        
    }
}
