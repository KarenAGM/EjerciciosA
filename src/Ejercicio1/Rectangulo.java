package Ejercicio1;

public class Rectangulo {

    private int ladoA;
    private int ladoB;

    public Rectangulo(){

    }
    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int calculaPerimetro(){
        return (ladoA*2) + (ladoB*2);

    }

    public int calculaArea() {
        return ladoA*ladoB;
    }

}
