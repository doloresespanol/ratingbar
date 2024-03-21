package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        Button button_prev = findViewById(R.id.button);
        Button button_next = findViewById(R.id.button2);

        ImageView imageView = findViewById(R.id.imageView2);

        RatingBar ratingBar = findViewById(R.id.ratingBar);

        Gwiazdki obraz1 = new Gwiazdki("Sunset1",R.drawable.sunset1,1);
        Gwiazdki obraz2 = new Gwiazdki("Sunset2",R.drawable.sunset2,2);
        Gwiazdki obraz3 = new Gwiazdki("Sunset3",R.drawable.sunset3,3);
        Gwiazdki obraz4 = new Gwiazdki("Sunset4",R.drawable.sunset4,4);

        ArrayList<Gwiazdki> listaObrazkow = new ArrayList<Gwiazdki>();

        listaObrazkow.add(obraz1);
        listaObrazkow.add(obraz2);
        listaObrazkow.add(obraz3);
        listaObrazkow.add(obraz4);

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index < listaObrazkow.size()-1){
                    listaObrazkow.get(index).ileGwiazdek = ratingBar.getRating();
                    index++;
                    imageView.setImageResource(listaObrazkow.get(index).getPath());
                    ratingBar.setRating(listaObrazkow.get(index).getIleGwiazdek());
                    textView.setText(ratingBar.getRating()+"/5");
                }else{

                    listaObrazkow.get(index).ileGwiazdek = ratingBar.getRating();
                    index=0;
                    imageView.setImageResource(listaObrazkow.get(index).getPath());
                    ratingBar.setRating(listaObrazkow.get(index).getIleGwiazdek());
                    textView.setText(ratingBar.getRating()+"/5");

                }
            }
        });

        button_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index > 0){

                    listaObrazkow.get(index).ileGwiazdek = ratingBar.getRating();
                    index--;
                    imageView.setImageResource(listaObrazkow.get(index).getPath());
                    ratingBar.setRating(listaObrazkow.get(index).getIleGwiazdek());
                    textView.setText(ratingBar.getRating()+"/5");

                }else{

                    listaObrazkow.get(index).ileGwiazdek = ratingBar.getRating();
                    index=listaObrazkow.size()-1;
                    imageView.setImageResource(listaObrazkow.get(index).getPath());
                    ratingBar.setRating(listaObrazkow.get(index).getIleGwiazdek());
                    textView.setText(ratingBar.getRating()+"/5");

                }
            }
        });


    }
}