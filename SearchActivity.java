package com.example.android.skyfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button searchButton = (Button) findViewById(R.id.search_button);
        TextView TeamTextView = (TextView) findViewById(R.id.team_edit_text);
        TextView cityTextView = (TextView) findViewById(R.id.city_edit_text);
    }

    @Override
    public void onClick(View v) {

    }
}
