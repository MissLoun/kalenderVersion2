package com.example.janap.a02_kalender;

import android.widget.GridView;

import java.util.Calendar;

public class Kalender_Steuerung {

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Attribute
    private Monat monat = new Monat();
    private Calendar kalender = Calendar.getInstance();
    private int[] tage = new int[42];

    private GridView tabelle;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Bidirektionale Assoziation
    private Kalender_GUI dieGui;
    public Kalender_Steuerung(Kalender_GUI pGui){
        dieGui = pGui;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void aktualisiere(){
        /*monat.setMonat(kalender);
        Kalender_Adapter adapter = new Kalender_Adapter(dieGui.getContext(), monat);

        */
        //Kalender_Adapter adapter = new Kalender_Adapter(dieGui.getContext(),  tage);

        //erstelllt 42 Felder der Tabelle (42 = maximale Größe des Kalenders)
        /*for (int i = 1; i < monat.getMonatslaenge(); i++) {
            tage[i] = i;
        }*/

        //tabelle = dieGui.getTabelle();
        //tabelle.setAdapter(adapter);



    }
}
