package com.example.android.skyfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FlightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);

        ListView listView = (ListView) findViewById(R.id.flight_list);

        final ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight(12,"Barcelona","Munich",132.50,"Ryanair"));
        flights.add(new Flight(16,"Paris","Manchester",156.80,"KatarAirways"));
        flights.add(new Flight(18,"London","Roma",110.0,"Iberia"));

        FlightAdapter flightAdapter = new FlightAdapter(this,R.layout.flight_item,flights);
        listView.setAdapter(flightAdapter);

    }
}
