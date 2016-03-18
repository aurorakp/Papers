package com.example.android.papers;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class idNYC_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView idnyc_list;
    private String[] idnyc_lvnames;
    private String[] idnyc_lvlinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_nyc_);
        idnyc_lvnames = getResources().getStringArray(R.array.idnyc_names);
        idnyc_lvlinks = getResources().getStringArray(R.array.idnyc_links);
        ListView idnyc_list = (ListView) findViewById(R.id.idnyc_list);
        final ArrayAdapter<String> idnycAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, idnyc_lvnames) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                tv.setTypeface(Typeface.DEFAULT_BOLD);
                return view;
            }
        };
        idnyc_list.setAdapter(idnycAdapter);
        idnyc_list.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < idnyc_lvlinks.length) {
            Uri uri = Uri.parse(idnyc_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}