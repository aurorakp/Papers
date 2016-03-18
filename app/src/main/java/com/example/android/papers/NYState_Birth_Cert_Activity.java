package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class NYState_Birth_Cert_Activity extends AppCompatActivity {

    private boolean nys_dl = false;
    private boolean nys_nondl = false;
    private boolean nys_pass = false;
    private boolean nys_usmil = false;
    private boolean nys_bill = false;
    private boolean nys_govlett = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nystate__birth__cert_);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox cBox = (CheckBox) view;
        switch (cBox.getId()) {
            case R.id.nys_dl:
                nys_dl = checked;
                break;
            case R.id.nys_nondl:
                nys_nondl = checked;
                break;
            case R.id.nys_pass:
                nys_pass = checked;
                break;
            case R.id.nys_usmil:
                nys_usmil = checked;
                break;
            case R.id.nys_bill:
                nys_bill = checked;
                break;
            case R.id.nys_govlett:
                nys_govlett = checked;
                break;
        }

    }

    public void emailList(View view) {

        String header = "Documents Needed For NY State Birth Certificate Request: \n";
        String doclist = "Document List: " + "\n";
        if (nys_dl) doclist = doclist + this.getString(R.string.dl) + "\n";
        if (nys_nondl) doclist = doclist + this.getString(R.string.nondlid) + "\n";
        if (nys_pass) doclist = doclist + this.getString(R.string.pp) + "\n";
        if (nys_usmil) doclist = doclist + this.getString(R.string.usmil) + "\n";
        if (nys_bill) doclist = doclist + this.getString(R.string.bill) + "\n";
        if (nys_govlett) doclist = doclist + this.getString(R.string.govtletter) + "\n";


        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, header);
        intent.putExtra(Intent.EXTRA_TEXT, doclist);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}



