/*DESCRIPTION
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
* */

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
