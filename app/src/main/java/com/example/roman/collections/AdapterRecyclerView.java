package com.example.roman.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class AdapterRecyclerView extends RecyclerView.Adapter<Item_View_Holder>
{

    private Context mContext;
    private ArrayList listperson;

    // Вызывается в том случае, если для данного ViewType необходимо создать новое View
    @Override
    public Item_View_Holder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Создаем из содержимого layout-файла  View-элемент.
        //1 параметр-ID layout-файла, который будет использован для создания View
        //родительский ViewGroup-элемент для создаваемого View
        //присоединять ли создаваемый View к root
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Item_View_Holder(view);
    }

    public AdapterRecyclerView(ArrayList listperson, Context mContext)
    {
        this.listperson = listperson;
        this.mContext = mContext;
    }

    //Cохраняет информацию о выделенных элементах и оповещает слушателей об изменении выделения.
    @Override
    public void onBindViewHolder(Item_View_Holder holder, int position)
    {
        //Получаем песону по позиции
        Person person=(Person)listperson.get(position);

        //Получаем наш image
        ImageView imageview=holder.getPhoto();
        // предназначенная для асинхронной подгрузки изображений  из сети
        Picasso .with(mContext)
                .load(person.getImagelink())
                .into(imageview);

        //Задает текст нашим текствым полям
        holder.getfName() .setText(person.getFname());
        holder.getlName().setText(person.getLname());
     }

    //Возвращает количество эллеметов в списки(влияет на кол-во выводимых item)
    @Override
    public int getItemCount()
    {
        return listperson.size();
    }
}
