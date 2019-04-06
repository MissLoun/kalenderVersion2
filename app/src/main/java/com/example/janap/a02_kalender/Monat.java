package com.example.janap.a02_kalender;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import java.util.Calendar;

public class Monat{

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Attribute
    private int laenge;
    private String bezeichnung;
    private int anfang;


    ////////////////////////////////////////////////////////////////////////////////////////////////
    //SetMethoden
    public void setMonat(Calendar derKalender) {
        anfang = derKalender.get(Calendar.DAY_OF_WEEK);
        laenge = derKalender.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        setMonatsBezeichnung(derKalender.get(Calendar.MONTH));
    }

    private void setMonatsBezeichnung(int pMonat) {
        switch (pMonat +1){
            case 1:
                bezeichnung = "Januar";
                break;
            case 2:
                bezeichnung = "Februar";
                break;
            case 3:
                bezeichnung = "März";
                break;
            case 4:
                bezeichnung = "April";
                break;
            case 5:
                bezeichnung = "Mai";
                break;
            case 6:
                bezeichnung = "Juni";
                break;
            case 7:
                bezeichnung = "Juli";
                break;
            case 8:
                bezeichnung = "August";
                break;
            case 9:
                bezeichnung = "September";
                break;
            case 10:
                bezeichnung = "Oktober";
                break;
            case 11:
                bezeichnung = "November";
                break;
            case 12:
                bezeichnung = "Dezember";
                break;
        }
    }

    //GetMethoden
    public int getMonatslaenge() {
        return laenge;
    }
    public String getMonatsBezeichnung(){
        return bezeichnung;
    }
    public int getAnfang() {
        return anfang;
    }

}
