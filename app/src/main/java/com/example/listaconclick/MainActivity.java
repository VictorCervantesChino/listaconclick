package com.example.listaconclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import android.content.Intent;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String titulos[]={"Titulo 1","Titulo 2","Titulo 3","Titulo 4","Titulo 5","Titulo 6","Titulo 7","Titulo 8" };
    String descripciones[]={"texto texto texto 1","texto texto texto 2","texto texto texto 3","texto texto texto 4",
            "texto texto texto 5","texto texto texto 6","texto texto texto 7","texto texto texto 8"};
    int avatar[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciar vista
        listView = findViewById(R.id.lista);

        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new Datos(this,titulos,descripciones,avatar));
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                ImageView avatarG;
                Object o = listView.getItemAtPosition(position);

                if (position == 0){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.a);

                }else if(position == 1){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.b);

                }else if(position == 2){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.c);

                }else if(position == 3){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.d);

                }else if(position == 4){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.e);

                }else if(position == 5){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.f);

                }else if(position == 6){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.g);

                }else if(position == 7){

                    setContentView(R.layout.imagen_g);

                    avatarG = findViewById(R.id.avatarG);
                    avatarG.setImageResource(R.drawable.h);

                }


                Log.i("Click", "click en el elemento " + position + " de mi ListView");

            }
        });
    }

    public void volver1(View view){ //metodo para ir a la pagina principal
        Intent button1 = new Intent(this, MainActivity.class);
        startActivity(button1);
    }


}