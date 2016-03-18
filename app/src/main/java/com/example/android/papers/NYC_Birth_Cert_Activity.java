package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class NYC_Birth_Cert_Activity extends AppCompatActivity {
    private boolean nyc_dl = false;
    private boolean nyc_idnyc = false;
    private boolean nyc_pubben = false;
    private boolean nyc_pass = false;
    private boolean nyc_nat = false;
    private boolean nyc_emp = false;
    private boolean nyc_usmil = false;
    private boolean nyc_mta = false;
    private boolean nyc_student = false;
    private boolean nyc_inmate = false;
    private boolean nyc_bill = false;
    private boolean nyc_govlett = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyc__birth__cert_);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox cBox = (CheckBox) view;
        switch (cBox.getId()) {
            case R.id.nyc_dl:
                nyc_dl = checked;
                break;
            case R.id.nyc_idnyc:
                nyc_idnyc = checked;
                break;
            case R.id.nyc_pubben:
                nyc_pubben = checked;
                break;
            case R.id.nyc_nat:
                nyc_nat = checked;
                break;
            case R.id.nyc_emp:
                nyc_emp = checked;
                break;
            case R.id.nyc_usmil:
                nyc_usmil = checked;
                break;
            case R.id.nyc_pass:
                nyc_pass = checked;
                break;
            case R.id.nyc_student:
                nyc_student = checked;
                break;
            case R.id.nyc_inmate:
                nyc_inmate = checked;
                break;
            case R.id.nyc_mta:
                nyc_mta = checked;
                break;
            case R.id.nyc_bill:
                nyc_bill = checked;
                break;
            case R.id.nyc_govlett:
                nyc_govlett = checked;
                break;
        }

    }

    public void emailList(View view) {

        String header = "Documents Needed For New York City Birth Certificate Request: \n";
        String doclist = "Document List: " + "\n";
        if (nyc_dl) doclist = doclist + this.getString(R.string.dl) + "\n";
        if (nyc_idnyc) doclist = doclist + this.getString(R.string.idnyc) + "\n";
        if (nyc_pubben) doclist = doclist + this.getString(R.string.pubben) + "\n";
        if (nyc_pass) doclist = doclist + this.getString(R.string.nyc_pp) + "\n";
        if (nyc_nat) doclist = doclist + this.getString(R.string.nyc_nat) + "\n";
        if (nyc_usmil) doclist = doclist + this.getString(R.string.usmil) + "\n";
        if (nyc_mta) doclist = doclist + this.getString(R.string.nyc_mta) + "\n";
        if (nyc_student) doclist = doclist + this.getString(R.string.nyc_student) + "\n";
        if (nyc_inmate) doclist = doclist + this.getString(R.string.nyc_inmate) + "\n";
        if (nyc_emp) doclist = doclist + this.getString(R.string.nyc_emp) + "\n";
        if (nyc_bill) doclist = doclist + this.getString(R.string.nyc_bill) + "\n";
        if (nyc_govlett) doclist = doclist + this.getString(R.string.nyc_govlett);

        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, header);
        intent.putExtra(Intent.EXTRA_TEXT, doclist);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}
