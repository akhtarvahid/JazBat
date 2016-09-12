package com.example.vaheed.tablayout;

/**
 * Created by vaheed on 19/4/16.
 */
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Belal on 2/3/2016.
 */

//Our class extending fragment
public class Tab2 extends Fragment {
    private ListView MyListView;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout theLayout = (LinearLayout) inflater.inflate(R.layout.tab3, container, false);
        MyListView = (ListView)theLayout.findViewById(R.id.quotes);

        //import string from string resource


        Resources re=getResources();
        String sms1=re.getString(R.string.sms1);

        // created product class array

        final Product[] items = {
                new Product(1, " " + sms1),
        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(getContext(),
                android.R.layout.simple_list_item_1, items);

        MyListView.setAdapter(adapter);

        MyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();

                // Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
                // Launching new Activity on selecting single List Item

                Intent i = new Intent(getContext(), Display.class);
                // sending data to new activity
                i.putExtra("product",item);
                startActivity(i);

            }
        });
        return theLayout;
    }
}