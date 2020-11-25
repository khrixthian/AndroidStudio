package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void paginaWeb(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elorrieta.hezkuntza.net/es/inicio"));
        startActivity(intent);
    }

    public void llamadaTelefono(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:944028000"));
        startActivity(intent);
    }

    public void googleMaps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:43.2840966,-2.9653554"));
        startActivity(intent);
    }

    public void hacerFoto(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
    public void mandarCorreo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "asunto_Android");
        intent.putExtra(Intent.EXTRA_TEXT, "Mensaje para Cristian");
        intent.putExtra(Intent.EXTRA_EMAIL, new
                String[]{"cristian.fernandezro@elorrieta-errekamari.com "});
        startActivity(intent);
    }

    public void streetView(View view) {//muestra lo mismo que google maps aunke le cambie las coordenadas
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("google.streetview:" +
                        "cbll=43.2840966,-2.9653554&" +
                        "cbp=1,yaw,pitch,zoom" +
                        "& mz=mapZoom"));
        startActivity(intent);
    }

    public void dial(View view) { //peta
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:944028000" +
                        "voicemail:"));
        startActivity(intent);
    }

    public  void webSearch(View view){//
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH, Uri.parse("https://publico.es"));
        startActivity(intent);
    }
}