package KatasCode.kataUno;

/*Escribir una funcion que acepte un arreglo de 10 enteros entre 0 y 9
que devuelva una cadena de estos numeros en forma de numero de telefono
*
* */

import java.util.Arrays;

public class Kata1 {

    //Necesitamos un objeto de tipo Array numerico
    private int numeros[] = new int[10];

    //Constructores

    public Kata1() {

    }

    public Kata1(int[] numeros) {
        this.numeros = numeros;
    }

    //Metodos get and set

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    /* Metodo
     * */

    public String convertir(int[] numeros) {
        String nuevo = "";
        if(numeros.length==10){
            String nueva =Arrays.toString(numeros);
            nuevo =nueva.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ","");


        }else{
            return ("Ingresa 10 numeros");
        }
        return ("("+nuevo.substring(0,3)+")"+" "+nuevo.substring(3,6)+"-"+nuevo.substring(6));
        }
}
