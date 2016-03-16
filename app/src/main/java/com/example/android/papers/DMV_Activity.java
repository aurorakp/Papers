package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DMV_Activity extends AppCompatActivity {

    private ListView dmv_list;
    private String[] dmv_lvnames;
    private String[] dmv_lvlinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmv_);
        dmv_lvnames = getResources().getStringArray(R.array.dmv_names);
        dmv_lvlinks = getResources().getStringArray(R.array.dmv_links);
        ListView idnyc_list = (ListView) findViewById(R.id.idnyc_list);
        ArrayAdapter ssnAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dmv_lvnames);
        idnyc_list.setAdapter(ssnAdapter);
        idnyc_list.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < dmv_lvlinks.length) {
            Uri uri = Uri.parse(dmv_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

}
