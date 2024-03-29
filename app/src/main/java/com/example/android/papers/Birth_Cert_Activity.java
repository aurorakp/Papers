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

public class Birth_Cert_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView birth_cert_list;
    private String[] birth_cert_lvnames;
    private String[] birth_cert_lvlinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_cert_);
        birth_cert_lvnames = getResources().getStringArray(R.array.birth_cert_names);
        birth_cert_lvlinks = getResources().getStringArray(R.array.birth_cert_links);
        ListView birth_cert_list = (ListView) findViewById(R.id.birth_cert_list);

        // Set up custom ArrayAdapter to handle the ListView and make the text
        // larger and easier to see

        final ArrayAdapter<String> birthcertAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, birth_cert_lvnames) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                tv.setTypeface(Typeface.DEFAULT_BOLD);
                return view;
            }
        };
        birth_cert_list.setAdapter(birthcertAdapter);
        birth_cert_list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long lo) {
        /**
         * Set up custom click behavior for the ListView to determine what happens for each position
         * when the user clicks there
         */
        switch (position) {
            case 0:
                Uri uri0 = Uri.parse(birth_cert_lvlinks[0]);
                Intent intent0 = new Intent(Intent.ACTION_VIEW, uri0);
                startActivity(intent0);
                break;
            case 1:
                Intent startApp0 = new Intent(this, NYC_Birth_Cert_Activity.class);
                startActivity(startApp0);
                break;
            case 2:
                Uri uri2 = Uri.parse(birth_cert_lvlinks[1]);
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            case 3:
                Intent startApp2 = new Intent(this, NYState_Birth_Cert_Activity.class);
                startActivity(startApp2);
                break;
        }
    }
}
