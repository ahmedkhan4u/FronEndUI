package com.softrasol.ahmed.yasinprojectapp.Fragments;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.softrasol.ahmed.yasinprojectapp.R;


public class ScanFragment extends Fragment {

    
    View mView;
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_scan, container, false);

        imageView = mView.findViewById(R.id.image);
        // Initializing the QR Encoder with your value to be encoded, type you required and Dimension
        try {
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap("content", BarcodeFormat.QR_CODE, 300, 300);
            imageView.setImageBitmap(bitmap);
        } catch(Exception e) {

        }

        return mView;
    }
}