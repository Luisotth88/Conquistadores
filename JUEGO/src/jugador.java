/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class jugador {
    String nombre;
    long puntaje;
    int pilotos;
    boolean c1;
    boolean c2;
    boolean c3;
    boolean c4;
    boolean c5;
    boolean c6;
    boolean c7;
    boolean c8;
    boolean c9;

    public jugador(String nombre,int pilotos, long puntaje, boolean c1, boolean c2, boolean c3, boolean c4, boolean c5, boolean c6, boolean c7, boolean c8, boolean c9) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
        this.c9 = c9;
        this.pilotos=pilotos;
    }

    public jugador(String nombre, long puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.pilotos= 5;
        this.c1 = false;
        this.c2 = true;
        this.c3 = true;
        this.c4 = false;
        this.c5 = false;
        this.c6 = false;
        this.c7 = false;
        this.c8 = false;
        this.c9 = true;
    }

    public int getPilotos() {
        return pilotos;
    }

    public void setPilotos(int pilotos) {
        this.pilotos = pilotos;
    }

    

    public String getNombre() {
        return nombre;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public boolean isC1() {
        return c1;
    }

    public boolean isC2() {
        return c2;
    }

    public boolean isC3() {
        return c3;
    }

    public boolean isC4() {
        return c4;
    }

    public boolean isC5() {
        return c5;
    }

    public boolean isC6() {
        return c6;
    }

    public boolean isC7() {
        return c7;
    }

    public boolean isC8() {
        return c8;
    }

    public boolean isC9() {
        return c9;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public void setC1(boolean c1) {
        this.c1 = c1;
    }

    public void setC2(boolean c2) {
        this.c2 = c2;
    }

    public void setC3(boolean c3) {
        this.c3 = c3;
    }

    public void setC4(boolean c4) {
        this.c4 = c4;
    }

    public void setC5(boolean c5) {
        this.c5 = c5;
    }

    public void setC6(boolean c6) {
        this.c6 = c6;
    }

    public void setC7(boolean c7) {
        this.c7 = c7;
    }

    public void setC8(boolean c8) {
        this.c8 = c8;
    }

    public void setC9(boolean c9) {
        this.c9 = c9;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
