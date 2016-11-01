package com.example.faishal.learnmore;

import java.util.ArrayList;

/**
 * Created by Faishal on 1/11/16.
 */

public class Funlist {
    private ArrayList <Fun> fundroids;

    public ArrayList <Fun> tambahFundroid(){
        fundroids = new ArrayList<Fun>();
        fundroids.add(new Fun(R.drawable.chess,"please make some strategy"));
        fundroids.add(new Fun(R.drawable.goal," ur mission of ur life"));
        fundroids.add(new Fun(R.drawable.checklist,"some checklist to do"));
        fundroids.add(new Fun(R.drawable.contract," ur contraact will be here"));
        fundroids.add(new Fun(R.drawable.competition," this is competition"));
     return fundroids;
    }
}
