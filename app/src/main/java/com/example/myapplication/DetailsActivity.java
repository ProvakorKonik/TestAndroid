package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    private Button mSaveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mSaveBtn = (Button)findViewById(R.id.savebtn);

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_LONG).show();
                System.out.println("512nd Commit");
            }
        });


        //mb.listItem.add(new Model("https://firebasestorage.googleapis.com/v0/b/hather-kache.appspot.com/o/HatherKacheApp%2FSylhet%2FFoodDelivery%2F1624882827761.JPEG?alt=media&token=c94f8841-4c20-46e1-b3c7-a4127271755a", "RECALL","Video Text RECALL"));

        /*LayoutInflater li = LayoutInflater.from(DetailsActivity.this);
        View promptsView = li.inflate(R.layout.popup, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                DetailsActivity.this);

        // set alert_dialog.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);



        // set dialog message
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();*/
    }
}