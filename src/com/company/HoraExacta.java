package com.company;

/**
 * Created by 46995932D on 25/05/2017.
 */
public class HoraExacta extends Hora{

    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos){
        super(hora, minutos);
        setSegundos(segundos);
    }

    public void setSegundos(int segundos){
        if (0<= segundos && segundos < 60){
            this.segundos= segundos;
        }
    }

    @Override
    public void inc(){
        segundos++;
        if (segundos > 60) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString(){
        String result = super.toString();
        result +=":" + segundos;
        return result;
    }

    @Override
    public boolean equals(Object o){
        HoraExacta segReloj = (HoraExacta) o;
        boolean iguales;

        if (this.hora == segReloj.hora && this.minutos == segReloj.minutos && this.segundos == segReloj.segundos){
            iguales = true;
        }
        else {
            iguales = false;
        }

        return iguales;
    }
}
