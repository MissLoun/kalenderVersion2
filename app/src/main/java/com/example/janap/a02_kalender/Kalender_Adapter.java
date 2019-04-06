package com.example.janap.a02_kalender;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Calendar;

public class Kalender_Adapter extends BaseAdapter {

    private Context context;
    private Monat monat = new Monat();
    private Calendar kalender = Calendar.getInstance();
    private int[] tage;
    private int datumAktuellerMonat = 1;
    private int datumFruehererMonat = kalender.getActualMaximum(Calendar.DAY_OF_MONTH)-kalender.get(Calendar.DAY_OF_WEEK)-1;
    private int datumNaechsterMonat = 1;





    public Kalender_Adapter(Context pContext,  int[] pTage){
        this.context = pContext;
        this.tage = pTage;

    }

    @Override
    public int getCount() {
        return tage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.zelle_aktueller_monat, null);
        }

        TextView textViewTag = convertView.findViewById(R.id.textview_tag);
        textViewTag.setText(""+datumAktuellerMonat);
        datumAktuellerMonat++;

        /*if (position >= kalender.get(Calendar.DAY_OF_WEEK)-1){

            if (position >= kalender.getActualMaximum(Calendar.DAY_OF_MONTH)+kalender.get(Calendar.DAY_OF_WEEK)-1){
                textViewTag.setText(""+datumNaechsterMonat);
                datumNaechsterMonat++;
                convertView.setBackgroundColor(ContextCompat.getColor(context, R.color.hellgelb));
            }else{
                textViewTag.setText(""+datumAktuellerMonat);
                datumAktuellerMonat++;
            }
        }else {
            textViewTag.setText(""+datumFruehererMonat);
            datumFruehererMonat++;
            convertView.setBackgroundColor(ContextCompat.getColor(context, R.color.hellgelb));
        }*/

        return convertView;
    }
}
