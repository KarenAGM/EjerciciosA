import java.util.*;
import java.io.*;

public class SolucionUno {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la primer cadena");
        String A=sc.next();
        System.out.println("Ingrese la segunda cadena");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Sacar el tamaño de las cadenas
        int tam_A = A.length();
        int tam_B = B.length();

        //Sumamos los tamaños de las cadenas
        System.out.println(tam_A+tam_B);

        //Comparamos el primer caracter de cada cadena , cual es mayor lexicograficamente
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //Imprimimos las dos cadenas, cada una con la primera en mayusculas
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
