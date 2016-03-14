package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SSN_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView ssn_list;
    private String[] ssn_lvnames;
    private String[] ssn_lvlinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssn_);
        ssn_lvnames = getResources().getStringArray(R.array.ssn_resource_name_array);
        ssn_lvlinks = getResources().getStringArray(R.array.ssn_resource_link_array);
        ListView ssn_list = (ListView) findViewById(R.id.ssn_list);
        ArrayAdapter ssnAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ssn_lvnames);
        ssn_list.setAdapter(ssnAdapter);
        ssn_list.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < ssn_lvlinks.length) {
            Uri uri = Uri.parse(ssn_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}




