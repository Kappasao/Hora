package com.company;

/**
 * Created by 46995932D on 12/05/2017.
 */
public class Hora {

    protected int hora;
    protected int minutos;

    public Hora(int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;
        setHora(hora);
        setMinutos(minutos);
    }


public void inc() {
        minutos++;

        if (minutos == 60){
            minutos = 0;
            hora++;
        }

        if (hora == 24){
            hora = 0;
        }
}

public void setMinutos(int minutos){

        if (0<= minutos && minutos<60){
            this.minutos=minutos;
        }


}
public void setHora(int hora){

    if (0<= hora && hora<24){
        this.hora=hora;
    }
}

    @Override
    public String toString() {
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}
