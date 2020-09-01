package com.leonestudios.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private Object FloatingActionButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFAB();


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascota);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListadeMascotas();
        inicializarAdaptador();

    }

    private void setSupportActionBar(Toolbar miActionBar) {
    }

    public void inicializarAdaptador(){
        MascotaAdaptador Adapatador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(Adapatador);
    }

    public void inicializarListadeMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Tobby", R.drawable.tobby));
        mascotas.add(new Mascota("brown", R.drawable.brown));
        mascotas.add(new Mascota("capitan", R.drawable.capitan));
        mascotas.add(new Mascota("george", R.drawable.capitan));
        mascotas.add(new Mascota("leon", R.drawable.leon));
        mascotas.add(new Mascota("olaf", R.drawable.olaf));
        mascotas.add(new Mascota("pluto", R.drawable.pluto));
        mascotas.add(new Mascota("Manchas", R.drawable.manchas));
    }

    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMiFab);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}