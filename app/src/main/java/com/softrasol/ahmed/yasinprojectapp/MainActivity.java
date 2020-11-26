package com.softrasol.ahmed.yasinprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.tenclouds.fluidbottomnavigation.FluidBottomNavigation;

public class MainActivity extends AppCompatActivity {

    FluidBottomNavigation fluidBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fluidBottomNavigation = findViewById(R.id.fluidBottomNavigation);
    }
}