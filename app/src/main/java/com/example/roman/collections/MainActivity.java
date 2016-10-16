package com.example.roman.collections;

import android.graphics.Bitmap;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rv;
    RecyclerView.LayoutManager layoutManager;//Менеджер компоновки для управления позиционированием своих элементов
    AdapterRecyclerView adapter;//Адаптер для доступа к данным RecyclerView /

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
    }

    private void Initialize()
    {
        rv = (RecyclerView)findViewById(R.id.rv_activitymain);
        Config cg = new Config();// Наши данные
        rv.setHasFixedSize(true);//Для улучшения производительности (если уверенны что размер не будет изменяться) /
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);//Создаем наш менеджер компоновки /
        rv.setLayoutManager(layoutManager);
        adapter=new AdapterRecyclerView(cg.getPersonData(), this);//Создаем список из модели адаптер
        rv.setAdapter(adapter);
    }
}
