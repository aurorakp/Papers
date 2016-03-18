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


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long lo) {
        if (i < birth_cert_lvlinks.length) {
            Uri uri = Uri.parse(birth_cert_lvlinks[i]);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}
