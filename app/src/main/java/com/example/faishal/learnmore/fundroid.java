package com.example.faishal.learnmore;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class fundroid extends AppCompatActivity {

    private ImageView gambar;
    private TextView tulisan;
    private ImageButton pencetan;
    private LinearLayout bekgron;
    private TextView subjudul;
    private Spinner pilihan;

    private Funlist nendroids;
    private ArrayList<Fun> list;
    private int [] banyak;
    private ListApdet mantab;
    private ArrayList<String> listkeren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundroid);

        gambar = (ImageView) findViewById(R.id.pinguin);
        tulisan = (TextView) findViewById(R.id.judul);
        pencetan = (ImageButton) findViewById(R.id.tombol);
        bekgron = (LinearLayout) findViewById(R.id.activity_fundroid);
        subjudul = (TextView) findViewById(R.id.bukan);
        pilihan = (Spinner) findViewById(R.id.spinner);

        nendroids = new Funlist();
        list = nendroids.tambahFundroid();

        mantab = new ListApdet();
        listkeren = mantab.tambahAndro();


//        Random randomgenerator= new Random();
//        int randomNumber = randomgenerator.nextInt(4);
//        Toast.makeText(this,"randomnumber :"+ randomNumber, Toast.LENGTH_LONG).show();


        pencetan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String item = (String) pilihan.getSelectedItem();
//                if (item.equals("goal")) {
//                    gambar.setImageResource(list.get(1).getAngka());
//                    bekgron.setBackgroundColor(Color.parseColor("#3F51B5"));
//                    subjudul.setText(list.get(1).getKata());
//                } else if (item.equals("checklist")) {
//                    gambar.setImageResource(list.get(2).getAngka());
//                    subjudul.setText(list.get(2).getKata());
//                    bekgron.setBackgroundColor(Color.parseColor("#E1F5FE"));
//                } else if (item.equals("contract")) {
//                    subjudul.setText(list.get(3).getKata());
//                    gambar.setImageResource(list.get(3).getAngka());
//                    bekgron.setBackgroundColor(Color.parseColor("#2196F3"));
//                } else if (item.equals(("chess"))) {
//                    gambar.setImageResource(list.get(0).getAngka());
//                    subjudul.setText(list.get(0).getKata());
//                    bekgron.setBackgroundColor(Color.parseColor("#E1F5FE"));
//                } else {
//                    gambar.setImageResource(list.get(4).getAngka());
//                    subjudul.setText(list.get(4).getKata());
//                    bekgron.setBackgroundColor(Color.parseColor("#E1F5FE"));
//                }
                final int[] bgColorId={Color.RED,Color.BLUE,Color.GRAY,Color.CYAN,Color.GREEN};
                int [] banyak= {R.drawable.checklist,R.drawable.competition, R.drawable.chess,R.drawable.bmw, R.drawable.goal};
                String [] subtitle ={"Ini Checklist","ini Ikan", "ini Catur","ini Mobil","ini gunung"};

                Random randomgenerator = new Random();
                int randomNumber = randomgenerator.nextInt(5);
                bekgron.setBackgroundColor(bgColorId[randomNumber]);

                Random randomGen= new Random();
                int randomAja = randomGen.nextInt(5);
                gambar.setImageResource(banyak[randomAja]);
                subjudul.setText(subtitle[randomAja]);

                tulisan.setText(listkeren.get(randomAja));
            }

        });

    }
}