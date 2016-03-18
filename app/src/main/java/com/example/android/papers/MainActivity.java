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

    /**
     * Called when the user clicks the Birth Certificate
     *
     * @param view
     */
    public void goToBirthCert(View view) {
        Intent intent = new Intent(this, Birth_Cert_Activity.class);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the Driver's License
     *
     * @param view
     */

    public void goToDMV(View view) {
        Intent intent = new Intent(this, DMV_Activity.class);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the US Passport
     * @param view
     */


    public void goToPassport(View view) {
        Intent intent = new Intent(this, Passport_Activity.class);
        startActivity(intent);
    }
}
