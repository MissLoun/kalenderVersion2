package com.example.janap.a02_kalender;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Calendar;

public class Kalender_GUI extends AppCompatActivity {

    private Kalender_Steuerung dieStrg;     //bidirektionale Assoziation

    private TextView txtMonatAnzeige;
    private TextView txtJahrAnzeige;
    private GridView tabelle;

    private Monat monat = new Monat();
    private Calendar kalender = Calendar.getInstance();

    //private int[] tage = new int[42];
    private int[] tageLetzterMonat = new int[kalender.get(Calendar.DAY_OF_WEEK)-1];
    private int[] tageMomentanerMonat = new int[kalender.getActualMaximum(Calendar.DAY_OF_MONTH)];
    private int[] tageNeuerMonat = new int[42 - kalender.getFirstDayOfWeek()- kalender.getActualMaximum(Calendar.DAY_OF_MONTH)];



    public void setTxtMonatAnzeige(String pNeuerMonat){
        txtMonatAnzeige.setText(pNeuerMonat);
    }
    public void setTxtJahrAnzeige(int pJahrAnzeige) {
        txtJahrAnzeige.setText(""+pJahrAnzeige);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalender__gui);

        tabelle = findViewById(R.id.gridView_Kalender_Tabelle);
        txtMonatAnzeige = findViewById(R.id.textView_Monat);
        txtJahrAnzeige = findViewById(R.id.textView_Jahr);

        Kalender_Steuerung dieStrg = new Kalender_Steuerung(this);      //bidirektionale Assoziation

        monat.setMonat(kalender);

        //Kalender_Adapter adapter = new Kalender_Adapter(this,  tage);
        Kalender_Adapter adapterFrueherMonat = new Kalender_Adapter(this,  tageLetzterMonat);
        Kalender_Adapter adapterAktuellerMonat = new Kalender_Adapter(this,  tageMomentanerMonat);
        Kalender_Adapter adapterNaechsterMonat = new Kalender_Adapter(this,  tageNeuerMonat);

        setTxtJahrAnzeige(kalender.get(Calendar.YEAR));
        setTxtMonatAnzeige("" + monat.getMonatsBezeichnung());

        tabelle.setAdapter(adapterFrueherMonat);
        tabelle.setAdapter(adapterAktuellerMonat);
        tabelle.setAdapter(adapterNaechsterMonat);

    }
}
