package com.example.android.papers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

//    public void scaleBitmaps(View view) {
//        Bitmap idNycBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.idnyclogo);
//
//        RoundedBitmapDrawable circleDrawable = RoundedBitmapDrawableFactory.create(getResources(), idNycBitmap);
//        circleDrawable.setCornerRadius(idNycBitmap.getWidth());
//        ImageView idButtonView = (ImageView) view.findViewById(R.id.idnycbutton);
//        idButtonView.setImageDrawable(circleDrawable);
//
//        System.out.println("Voila.. a circle");
//    }
}
