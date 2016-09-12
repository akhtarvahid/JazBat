package com.example.vaheed.tablayout;

/**
 * Created by vaheed on 19/4/16.
 */
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//Our class extending fragment

public class Tab1 extends Fragment {
    private ListView MyListView;

    public ListView GetListView()
    {
        return MyListView;
    }
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        //return inflater.inflate(R.layout.tab1, container, false);
        LinearLayout theLayout = (LinearLayout) inflater.inflate(R.layout.tab1, container, false);
        MyListView = (ListView)theLayout.findViewById(R.id.listview);

        //import string from string resource


        Resources re=getResources();
        String sms1=re.getString(R.string.sms1);
        String sms2=re.getString(R.string.sms2);
        String sms3=re.getString(R.string.sms3);
        String sms4=re.getString(R.string.sms4);
        String sms5=re.getString(R.string.sms5);
        String sms6=re.getString(R.string.sms6);
        String sms7=re.getString(R.string.sms7);
        String sms8=re.getString(R.string.sms8);
        String sms9=re.getString(R.string.sms9);
        String sms10=re.getString(R.string.sms10);
        String sms11=re.getString(R.string.sms11);
        String sms12=re.getString(R.string.sms12);
        String sms13=re.getString(R.string.sms13);
        String sms14=re.getString(R.string.sms14);
        String sms15=re.getString(R.string.sms15);
        String sms16=re.getString(R.string.sms16);
        String sms17=re.getString(R.string.sms17);
        String sms18=re.getString(R.string.sms18);
        String sms19=re.getString(R.string.sms19);
        String sms20=re.getString(R.string.sms20);
        String sms21=re.getString(R.string.sms21);
        String sms22=re.getString(R.string.sms22);
        String sms23=re.getString(R.string.sms23);
        String sms24=re.getString(R.string.sms24);
        String sms25=re.getString(R.string.sms25);
        String sms26=re.getString(R.string.sms26);
        String sms27=re.getString(R.string.sms27);
        String sms28=re.getString(R.string.sms28);
        String sms29=re.getString(R.string.sms29);
        String sms30=re.getString(R.string.sms30);
        String sms31=re.getString(R.string.sms31);
        String sms32=re.getString(R.string.sms32);
        String sms33=re.getString(R.string.sms33);
        String sms34=re.getString(R.string.sms34);
        String sms35=re.getString(R.string.sms35);
        String sms36=re.getString(R.string.sms36);
        String sms37=re.getString(R.string.sms37);
        String sms38=re.getString(R.string.sms38);
        String sms39=re.getString(R.string.sms39);
        String sms40=re.getString(R.string.sms40);
        String sms41=re.getString(R.string.sms41);
        String sms42=re.getString(R.string.sms42);
        String sms43=re.getString(R.string.sms43);
        String sms44=re.getString(R.string.sms44);
        String sms45=re.getString(R.string.sms45);

        String sms46=re.getString(R.string.sms46);
        String sms47=re.getString(R.string.sms47);
        String sms48=re.getString(R.string.sms48);
        String sms49=re.getString(R.string.sms49);
        String sms50=re.getString(R.string.sms50);
        String sms51=re.getString(R.string.sms51);
        String sms52=re.getString(R.string.sms52);
        String sms53=re.getString(R.string.sms53);
        String sms54=re.getString(R.string.sms54);
        String sms55=re.getString(R.string.sms55);
        String sms56=re.getString(R.string.sms56);
        String sms57=re.getString(R.string.sms57);
        String sms58=re.getString(R.string.sms58);
        String sms59=re.getString(R.string.sms59);
        String sms60=re.getString(R.string.sms60);


      //  String[] testArray = getResources().getStringArray(R.array.dawa);
      //  String str3[]=re.getStringArray(R.array.dawa);

        final Product[] items = {
                new Product(1," "+sms1),
                new Product(2," "+sms2),
                new Product(3," "+sms3),
                new Product(4, sms4),
                new Product(5, sms5),
                new Product(6, sms6),
                new Product(7, sms7),
                new Product(8, sms8),
                new Product(9, sms9),
                new Product(10, sms10),
                new Product(11, sms11),
                new Product(12, sms12),
                new Product(13, sms13),
                new Product(14, sms14),
                new Product(15, sms15),

                new Product(16," "+sms16),
                new Product(17," "+sms17),
                new Product(18," "+sms18),
                new Product(19, sms19),
                new Product(20, sms20),
                new Product(21, sms21),
                new Product(22, sms22),
                new Product(23, sms23),
                new Product(24, sms24),
                new Product(25, sms25),
                new Product(26, sms26),
                new Product(27, sms27),
                new Product(28, sms28),
                new Product(29, sms29),
                new Product(30, sms30),
                new Product(31," "+sms31),
                new Product(32," "+sms32),
                new Product(33," "+sms33),
                new Product(34, sms34),
                new Product(35, sms35),
                new Product(36, sms36),
                new Product(37, sms37),
                new Product(38, sms38),
                new Product(39, sms39),
                new Product(40, sms40),
                new Product(41, sms41),
                new Product(42, sms42),
                new Product(43, sms43),
                new Product(44, sms44),
                new Product(45, sms45),

                new Product(46," "+sms46),
                new Product(47," "+sms47),
                new Product(48," "+sms48),
                new Product(49, sms49),
                new Product(50, sms50),
                new Product(51, sms51),
                new Product(52, sms52),
                new Product(53, sms53),
                new Product(54, sms54),
                new Product(55, sms55),
                new Product(56, sms56),
                new Product(57, sms57),
                new Product(58, sms58),
                new Product(59, sms59),
                new Product(60, sms60),

        };

        //     final int[] itemss={R.string.medical1,R.string.medical2};

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




