package com.company;

/**
 * Created by 46995932D on 12/05/2017.
 */
public class Main {

    static public void main(String args[]){

        Hora a = new Hora(23, 45);
        System.out.println(a);
        for (int i = 1; i <= 31; i++){
            a.inc();
        }
        System.out.println(a);
        a.setHora(12);
        System.out.println(a);
        a.setMinutos(59);
        System.out.println(a);

        Hora12 b = new Hora12(12, 10, Hora12.Mitad.Am);
        System.out.println(b);
        for (int i = 1; i <=61; i++){
            b.inc();
        }
        System.out.println(b);

        b.setHora(20);
        System.out.println(b);

        HoraExacta c = new HoraExacta(23,45,30);
        System.out.println(c);
        for (int i = 1; i <=61; i++){
            c.inc();
        }
        System.out.println(c);

        HoraExacta d = new HoraExacta(23,45,30);
        HoraExacta e = new HoraExacta(12,45,30);
        HoraExacta f = new HoraExacta(23,45,30);

        System.out.println(d.equals(e));
        System.out.println(d.equals(f));
    }

}
