package mayusculas_4_02;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Mayusculas_4_02 {

    public static void main(String[] args)
    {
        String nombre = "";
        String nombreMayusculas = "";
        
        System.out.println("Escriba su nombre y apellidos");
        try {
                BufferedReader entrada =
                new BufferedReader(new InputStreamReader(System.in)); nombre = entrada.readLine();
            }
            catch (IOException e) {}
        
        String[] palabras = new String [20];
        for (int i = 0; i< 20; i++)
        {
            palabras[i] = "";
        }
                
        int i = 0;
        int j = 0;
        while(i < nombre.length() )
        {
            if(nombre.charAt(i) == ' ' || nombre.charAt(i) == '\t' )
            {
                i++;
            }
            else
            {
                while( i < nombre.length() && nombre.charAt(i) != ' ' && nombre.charAt(i) != '\t' )
                {
                    palabras[j] += nombre.substring(i, i+1);
                    i++;
                }
                j++; 
            }                 
        }
        
        String temp ="";
        for(int k = 0; k < j; k++)
        {
            temp += palabras[k].substring(0, 1);
            temp = temp.toUpperCase();
            temp += palabras[k].substring(1);
            nombreMayusculas += temp + " ";
            temp = "";
        }
       
        
        System.out.println(nombreMayusculas);
        
    }
}
