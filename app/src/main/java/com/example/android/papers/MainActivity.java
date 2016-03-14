package com.example.android.papers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user clicks the SSN button
     */
    public void goToSSN(View view) {
        Intent intent = new Intent(this, SSN_Activity.class);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the idNYC button
     */
    public void goToIdNyc(View view) {
        Intent intent = new Intent(this, idNYC_Activity.class);
        startActivity(intent);
    }

    public void goToBirthCert(View view) {
        Intent intent = new Intent(this, BirthCert_Activity.class);
        startActivity(intent);
    }

    public void goToDMV(View view) {
        Intent intent = new Intent(this, DMV_Activity.class);
        startActivity(intent);
    }

    public void goToPassport(View view) {
        Intent intent = new Intent(this, Passport_Activity.class);
        startActivity(intent);
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
