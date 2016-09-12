package com.example.vaheed.tablayout;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vaheed on 21/4/16.
 */
public class Display extends AppCompatActivity{
    private ClipboardManager myClipboard;
    private ClipData myClip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        final ImageView iv=(ImageView)findViewById(R.id.copy);
        final TextView txtProduct = (TextView) findViewById(R.id.display);
        final ImageView share=(ImageView)findViewById(R.id.share);
        final ImageView whatsapp=(ImageView)findViewById(R.id.whatsapp);
        myClipboard=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = txtProduct.getText().toString();
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();

            }
        });
        // code to share clicking share image
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                Intent i2=getIntent();
                String str=i2.getStringExtra("product");
                i.putExtra(Intent.EXTRA_TEXT,str);
                startActivity(Intent.createChooser(i, "Choose one..."));
            }
        });

        //code for direct whatsapp share
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                Intent i2=getIntent();
                String str=i2.getStringExtra("product");
                sendIntent.putExtra(Intent.EXTRA_TEXT, str);
                sendIntent.setType("text/plain");
                // Put this line here
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);
            }
        });



        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        // displaying selected product name
        txtProduct.setText(product);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.rate:
            {
                Toast.makeText(Display.this, "rate", Toast.LENGTH_SHORT).show();
                break;

            }
            case R.id.share:
            {
                Toast.makeText(Display.this, "share", Toast.LENGTH_SHORT).show();
            }

        }
        return super.onOptionsItemSelected(item);
    }
}
