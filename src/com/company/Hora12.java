package com.company;
/**
 * Created by 46995932D on 12/05/2017.
 */
public class Hora12 extends Hora{

    public enum Mitad{Am, Pm}
    protected Mitad mitad;

    public Hora12(int hora, int minutos, Mitad am) {
        super(hora, minutos);
        setHora(hora);
        this.mitad=mitad;
    }

    @Override
    public void setHora(int hora){
        if (1<= hora && hora<=12){
            this.hora = hora;
        }
    }

    public void inc() {
        super.inc();
        if (hora > 12){
            hora = 1;
            mitad = mitad == mitad.Am ? Mitad.Pm : Mitad.Am;
        }
    }

    @Override
    public String toString() {
        String result;
        result = super.toString();
        result +=" "+mitad;
        return result;
    }
}