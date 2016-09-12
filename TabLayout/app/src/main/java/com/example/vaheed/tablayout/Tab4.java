package com.example.vaheed.tablayout;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by vaheed on 19/4/16.
 */
public class Tab4 extends Fragment {
    private ListView MyListView;

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
     //   return inflater.inflate(R.layout.tab4, container, false);
        LinearLayout theLayout = (LinearLayout) inflater.inflate(R.layout.tab4, container, false);
        MyListView = (ListView)theLayout.findViewById(R.id.shayri);
        //import string from string resource


        Resources re=getResources();
        String shayri5=re.getString(R.string.shayri5);
        String shayri1=re.getString(R.string.shayri1);
        String shayri2=re.getString(R.string.shayri2);
        String shayri3=re.getString(R.string.shayri3);
        String shayri4=re.getString(R.string.shayri4);
        String shayri6=re.getString(R.string.shayri6);

        String shayri7=re.getString(R.string.shayri7);
        String shayri8=re.getString(R.string.shayri8);
        String shayri9=re.getString(R.string.shayri9);
        String shayri10=re.getString(R.string.shayri10);
        String shayri11=re.getString(R.string.shayri11);
        String shayri12=re.getString(R.string.shayri12);
        String shayri13=re.getString(R.string.shayri13);
        String shayri14=re.getString(R.string.shayri14);
        String shayri15=re.getString(R.string.shayri15);
        String shayri16=re.getString(R.string.shayri16);
        String shayri17=re.getString(R.string.shayri17);
        String shayri18=re.getString(R.string.shayri18);

        String shayri19=re.getString(R.string.shayri19);
        String shayri20=re.getString(R.string.shayri20);
        String shayri21=re.getString(R.string.shayri21);
        String shayri22=re.getString(R.string.shayri22);
        String shayri23=re.getString(R.string.shayri23);
        String shayri24=re.getString(R.string.shayri24);

        String shayri25=re.getString(R.string.shayri25);
        String shayri26=re.getString(R.string.shayri26);
        String shayri27=re.getString(R.string.shayri27);
        String shayri28=re.getString(R.string.shayri28);
        String shayri29=re.getString(R.string.shayri29);
        String shayri30=re.getString(R.string.shayri30);

        String shayri31=re.getString(R.string.shayri31);
        String shayri32=re.getString(R.string.shayri32);
        String shayri33=re.getString(R.string.shayri33);
        String shayri34=re.getString(R.string.shayri34);
        String shayri35=re.getString(R.string.shayri35);
        String shayri36=re.getString(R.string.shayri36);

        String shayri37=re.getString(R.string.shayri37);
        String shayri38=re.getString(R.string.shayri38);
        String shayri39=re.getString(R.string.shayri39);
        String shayri40=re.getString(R.string.shayri40);
        String shayri41=re.getString(R.string.shayri41);
        String shayri42=re.getString(R.string.shayri42);

        String shayri43=re.getString(R.string.shayri43);
        String shayri44=re.getString(R.string.shayri44);
        String shayri45=re.getString(R.string.shayri45);
        String shayri46=re.getString(R.string.shayri46);
        String shayri47=re.getString(R.string.shayri47);
        String shayri48=re.getString(R.string.shayri48);

        String shayri49=re.getString(R.string.shayri49);
        String shayri50=re.getString(R.string.shayri50);




        final Product[] items = {
                new Product(1, " " + shayri5),
                new Product(2, " " + shayri1),
                new Product(3, " " + shayri2),
                new Product(4, " " + shayri3),
                new Product(5, " " + shayri4),
                new Product(6, " " + shayri6),
                new Product(7, " " + shayri7),
                new Product(8, " " + shayri8),
                new Product(9, " " + shayri9),
                new Product(10, " " + shayri10),
                new Product(11, " " + shayri11),
                new Product(12, " " + shayri12),
                new Product(13, " " + shayri13),
                new Product(14, " " + shayri14),
                new Product(15, " " + shayri15),
                new Product(16, " " + shayri16),
                new Product(17, " " + shayri17),
                new Product(18, " " + shayri18),
                new Product(19, " " + shayri19),
                new Product(20, " " + shayri20),
                new Product(21, " " + shayri21),
                new Product(22, " " + shayri22),
                new Product(23, " " + shayri23),
                new Product(24, " " + shayri24),
                new Product(25, " " + shayri25),
                new Product(26, " " + shayri26),
                new Product(27, " " + shayri27),
                new Product(28, " " + shayri28),
                new Product(29, " " + shayri29),
                new Product(30, " " + shayri30),
                new Product(31, " " + shayri31),
                new Product(32, " " + shayri32),
                new Product(33, " " + shayri33),
                new Product(34, " " + shayri34),
                new Product(35, " " + shayri35),
                new Product(36, " " + shayri36),
                new Product(37, " " + shayri37),
                new Product(38, " " + shayri38),
                new Product(39, " " + shayri39),
                new Product(40, " " + shayri40),
                new Product(41, " " + shayri41),
                new Product(42, " " + shayri42),
                new Product(43, " " + shayri43),
                new Product(44, " " + shayri44),
                new Product(45, " " + shayri45),
                new Product(46, " " + shayri46),
                new Product(47, " " + shayri47),
                new Product(48, " " + shayri48),
                new Product(49, " " + shayri49),
                new Product(50, " " + shayri50),

        };

        // final int[] itemss={R.string.medical1,R.string.medical2};

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