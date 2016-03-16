package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Passport_Activity extends AppCompatActivity {

    private ListView passport_list;
    private String[] passport_lvnames;
    private String[] passport_lvlinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport_);
        passport_lvnames = getResources().getStringArray(R.array.passport_names_array);
        passport_lvlinks = getResources().getStringArray(R.array.passport_links);
        ListView ssn_list = (ListView) findViewById(R.id.ssn_list);
        ArrayAdapter ssnAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, passport_lvnames);
        ssn_list.setAdapter(ssnAdapter);
        ssn_list.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < passport_lvlinks.length) {
            Uri uri = Uri.parse(passport_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }


}
