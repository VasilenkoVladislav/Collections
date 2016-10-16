package com.example.roman.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Item_View_Holder extends RecyclerView.ViewHolder
//Суть шаблона ViewHolder — это избежать многократного поиска элементов в списке
// при его заполнении с помощью метода findViewById(), который потребляет как раз немало системных ресурсов
{
    private ImageView photo;
    private TextView fName;
    private TextView lName;

    public Item_View_Holder(View itemview)
    {
        super(itemview);//вызываем метод базового класса
        //находим наши элементы по id
        photo = (ImageView)itemview.findViewById(R.id.image_view);
        fName = (TextView) itemview.findViewById(R.id.txt_FirstName);
        lName = (TextView) itemview.findViewById(R.id.txt_LastName);
    }

    //геттеры наших элементов,чтобы задать им значение в адаптепер,при этом не нарушая инкапсуляцию
    public TextView getfName()
    {
        return fName;
    }

    public TextView getlName()
    {
        return lName;
    }

    public ImageView getPhoto()
    {
        return photo;
    }
}
