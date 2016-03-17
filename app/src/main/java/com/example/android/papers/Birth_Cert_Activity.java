package com.example.android.papers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        ArrayAdapter birth_cert_Adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, birth_cert_lvnames);
        birth_cert_list.setAdapter(birth_cert_Adapter);
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
