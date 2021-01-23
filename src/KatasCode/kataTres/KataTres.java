package KatasCode.kataTres;

import java.util.Arrays;

public class KataTres {

    private String cadena = "";

    public KataTres(){

    }

    public KataTres(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String conversion(String cadena){
        String [] arreglo = cadena.split("");
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]=="-"){
                arreglo[i].toString().replace("-","");
                arreglo[i+1].toUpperCase();
            }else if(arreglo[i]=="_"){
                arreglo[i].toString().replace("_","");
                arreglo[i+1].toUpperCase();
            }
        }
        String cadenaNueva = Arrays.toString(arreglo);

        return cadenaNueva;
    }


}

