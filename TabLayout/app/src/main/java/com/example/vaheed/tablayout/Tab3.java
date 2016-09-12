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
public class Tab3 extends Fragment {

    private ListView MyListView;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        //return inflater.inflate(R.layout.tab3, container, false);

        LinearLayout theLayout = (LinearLayout) inflater.inflate(R.layout.tab3, container, false);
        MyListView = (ListView)theLayout.findViewById(R.id.quotes);

        //import string from string resource


        Resources re=getResources();
        String quotes1=re.getString(R.string.quotes1);
        String quotes2=re.getString(R.string.quotes2);
        String quotes3=re.getString(R.string.quotes3);
        String quotes4=re.getString(R.string.quotes4);
        String quotes5=re.getString(R.string.quotes5);
        String quotes6=re.getString(R.string.quotes6);
        String quotes7=re.getString(R.string.quotes7);
        String quotes8=re.getString(R.string.quotes8);
        String quotes9=re.getString(R.string.quotes9);

        String quotes10=re.getString(R.string.quotes10);
        String quotes11=re.getString(R.string.quotes11);
        String quotes12=re.getString(R.string.quotes12);
        String quotes13=re.getString(R.string.quotes13);
        String quotes14=re.getString(R.string.quotes14);
        String quotes15=re.getString(R.string.quotes15);
        String quotes16=re.getString(R.string.quotes16);
        String quotes17=re.getString(R.string.quotes17);
        String quotes18=re.getString(R.string.quotes18);
        String quotes19=re.getString(R.string.quotes19);

        String quotes20=re.getString(R.string.quotes20);
        String quotes21=re.getString(R.string.quotes21);
        String quotes22=re.getString(R.string.quotes22);
        String quotes23=re.getString(R.string.quotes23);
        String quotes24=re.getString(R.string.quotes24);
        String quotes25=re.getString(R.string.quotes25);
        String quotes26=re.getString(R.string.quotes26);
        String quotes27=re.getString(R.string.quotes27);
        String quotes28=re.getString(R.string.quotes28);

        String quotes29=re.getString(R.string.quotes29);
        String quotes30=re.getString(R.string.quotes30);
        String quotes31=re.getString(R.string.quotes31);
        String quotes32=re.getString(R.string.quotes32);
        String quotes33=re.getString(R.string.quotes33);
        String quotes34=re.getString(R.string.quotes34);
        String quotes35=re.getString(R.string.quotes35);
        String quotes36=re.getString(R.string.quotes36);
        String quotes37=re.getString(R.string.quotes37);

        String quotes38=re.getString(R.string.quotes38);
        String quotes39=re.getString(R.string.quotes39);
        String quotes40=re.getString(R.string.quotes40);
        String quotes41=re.getString(R.string.quotes41);
        String quotes42=re.getString(R.string.quotes42);
        String quotes43=re.getString(R.string.quotes43);
        String quotes44=re.getString(R.string.quotes44);
        String quotes45=re.getString(R.string.quotes45);
        String quotes46=re.getString(R.string.quotes46);

        String quotes47=re.getString(R.string.quotes47);
        String quotes48=re.getString(R.string.quotes48);
        String quotes49=re.getString(R.string.quotes49);
        String quotes50=re.getString(R.string.quotes50);
        String quotes51=re.getString(R.string.quotes51);
        String quotes52=re.getString(R.string.quotes52);
        String quotes53=re.getString(R.string.quotes53);
        String quotes54=re.getString(R.string.quotes54);
        String quotes55=re.getString(R.string.quotes55);
        String quotes56=re.getString(R.string.quotes56);

        String quotes57=re.getString(R.string.quotes57);
        String quotes58=re.getString(R.string.quotes58);
        String quotes59=re.getString(R.string.quotes59);
        String quotes60=re.getString(R.string.quotes60);
        String quotes61=re.getString(R.string.quotes61);
        String quotes62=re.getString(R.string.quotes62);
        String quotes63=re.getString(R.string.quotes63);
        String quotes64=re.getString(R.string.quotes64);
        String quotes65=re.getString(R.string.quotes65);



        // created product class array

        final Product[] items = {
                new Product(1, " " + quotes1),
                new Product(2, " " + quotes2),
                new Product(3, " " + quotes3),
                new Product(4, " " + quotes4),
                new Product(5, " " + quotes5),
                new Product(6, " " + quotes6),
                new Product(7, " " + quotes7),
                new Product(8, " " + quotes8),
                new Product(9, " " + quotes9),

                new Product(10, " " + quotes10),
                new Product(11, " " + quotes11),
                new Product(12, " " + quotes12),
                new Product(13, " " + quotes13),
                new Product(14, " " + quotes14),
                new Product(15, " " + quotes15),
                new Product(16, " " + quotes16),
                new Product(17, " " + quotes17),
                new Product(18, " " + quotes18),

                new Product(19, " " + quotes19),
                new Product(20, " " + quotes20),
                new Product(21, " " + quotes21),
                new Product(22, " " + quotes22),
                new Product(23, " " + quotes23),
                new Product(24, " " + quotes24),
                new Product(25, " " + quotes25),
                new Product(26, " " + quotes26),
                new Product(27, " " + quotes27),

                new Product(28, " " + quotes28),
                new Product(29, " " + quotes29),
                new Product(30, " " + quotes30),
                new Product(31, " " + quotes31),
                new Product(32, " " + quotes32),
                new Product(33, " " + quotes33),
                new Product(34, " " + quotes34),
                new Product(35, " " + quotes35),
                new Product(36, " " + quotes36),

                new Product(37, " " + quotes37),
                new Product(38, " " + quotes38),
                new Product(39, " " + quotes39),
                new Product(40, " " + quotes40),
                new Product(41, " " + quotes41),
                new Product(42, " " + quotes42),
                new Product(43, " " + quotes43),
                new Product(44, " " + quotes44),
                new Product(45, " " + quotes45),

                new Product(46, " " + quotes46),
                new Product(47, " " + quotes47),
                new Product(48, " " + quotes48),
                new Product(49, " " + quotes49),
                new Product(50, " " + quotes50),
                new Product(51, " " + quotes51),
                new Product(52, " " + quotes52),
                new Product(53, " " + quotes53),
                new Product(54, " " + quotes54),

                new Product(55, " " + quotes55),
                new Product(56, " " + quotes56),
                new Product(57, " " + quotes57),
                new Product(58, " " + quotes58),
                new Product(59, " " + quotes59),
                new Product(60, " " + quotes60),
                new Product(61, " " + quotes61),
                new Product(62, " " + quotes62),
                new Product(63, " " + quotes63),
                new Product(64, " " + quotes64),
                new Product(65, " " + quotes65),

        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(getContext(),
                android.R.layout.simple_spinner_item, items);

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