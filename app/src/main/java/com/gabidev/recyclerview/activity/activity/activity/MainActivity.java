package com.gabidev.recyclerview.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gabidev.recyclerview.R;
import com.gabidev.recyclerview.activity.activity.adapter.Adapter;
import com.gabidev.recyclerview.activity.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        // TO-DO: listagem de filmes
        this.criarFilmes();

        // TO-DO: configurar adapter
        Adapter adapter = new Adapter(listaFilmes);


        // TO-DO: configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter( adapter);
    }
    public void criarFilmes() {
    Filme filme = new Filme( "Titanic", "Drama", "1997");
    this.listaFilmes.add(filme);
         filme = new Filme( "Era uma vez em hollywood", "Ação", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme( "Kill Bill 1", "Ação", "2003");
        this.listaFilmes.add(filme);
        filme = new Filme( "Wall Street", "Suspense", "1987");
        this.listaFilmes.add(filme);
         filme = new Filme( "The Breakfast Club", "Comédia", "1985");
        this.listaFilmes.add(filme);
    }
}
