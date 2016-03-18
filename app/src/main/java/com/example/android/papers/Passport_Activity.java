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

public class Passport_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView passport_list;
    private String[] passport_lvnames;
    private String[] passport_lvlinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport_);
        passport_lvnames = getResources().getStringArray(R.array.passport_names);
        passport_lvlinks = getResources().getStringArray(R.array.passport_links);
        ListView passport_list = (ListView) findViewById(R.id.passport_list);

        // Set up custom ArrayAdapter to handle the ListView and make the text
        // larger and easier to see

        final ArrayAdapter<String> passportAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, passport_lvnames) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                tv.setTypeface(Typeface.DEFAULT_BOLD);
                return view;
            }
        };
        passport_list.setAdapter(passportAdapter);
        passport_list.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < passport_lvlinks.length) {
            Uri uri = Uri.parse(passport_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }


}
