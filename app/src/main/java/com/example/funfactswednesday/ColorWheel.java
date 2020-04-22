package com.example.funfactswednesday;

import android.graphics.Color;

import java.util.Random;


public class ColorWheel {

    private String[] colors = {
            "#1E5BE1",
            "#1EE138",
            "#E11E1E",
            "#B51EE1"

    };

    public int getColor(){
        Random random = new Random();
        return Color.parseColor(colors[random.nextInt(colors.length)]);

    }
}
