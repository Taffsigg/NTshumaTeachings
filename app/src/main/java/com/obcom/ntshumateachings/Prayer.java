package com.obcom.ntshumateachings;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Prayer extends AppCompatActivity {


    String gaya="Email From App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

    }
    private String createOrderSummary(String name,String alamat,String telp, String  type){
        String priceMessage="Name : "+name;
        priceMessage +="\nAddress : "+alamat;
        priceMessage +="\nPhone Number: "+telp;
        priceMessage +="\nMessage :"+type;
        priceMessage +="\nThanks you";
        return priceMessage;
    }
    public void pesan(View view){

        EditText text = (EditText)findViewById(R.id.nama);
        String name = text.getText().toString();

        EditText text2 = (EditText)findViewById(R.id.alamat);
        String alamat = text2.getText().toString();

        EditText text3 = (EditText)findViewById(R.id.telp);
        String telp = text3.getText().toString();

        EditText text4 = (EditText)findViewById(R.id.typeofroder);
        String type = text4.getText().toString();

        if(text.length()==0||text2.length()==0||text3.length()==0||text4.length()==0){
            Toast.makeText(this, "Please Input !!!", Toast.LENGTH_SHORT).show();
        }else{
            String priceMessage=createOrderSummary(name,alamat,telp,type);

            Intent intent=new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:diftkzim@gmail.com")); //hanya email app yang bisa menangani ini
            intent.putExtra(Intent.EXTRA_SUBJECT,gaya+" from "+name);
            intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
            if(intent.resolveActivity(getPackageManager())!=null){
                startActivity(intent);
            }
        }
//====================

    }
}
