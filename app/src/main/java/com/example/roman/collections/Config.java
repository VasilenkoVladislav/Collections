package com.example.roman.collections;

import java.util.ArrayList;


public class Config
{
    public final static String[] fNames = {"Vladislav", "Artem", "Yaroslav"};
    public final static String[] lNames = {"Vasilenko", "Gorobey", "Moiseev"};
    public final static String[] photos = {"https://c-a.d-cd.net/5d5e482s-960.jpg",
                                            "https://e-a.d-cd.net/d1cb8eu-960.jpg",
                                            "https://s-media-cache-ak0.pinimg.com/736x/9f/58/d7/9f58d7f6ebd01808f1ff8230008f086c.jpg"};

    //Заполняем  список обьектами типа Person,который сождержит в себе линку на фото,имя и фамилию
    //и возвращаем этот список
    public ArrayList getPersonData()
    {
        ArrayList listperson = new ArrayList();
        for(int i = 0; i < fNames.length; i++)
        {
            listperson.add(new Person(photos[i],fNames[i],lNames[i]));
        }
        return listperson;
    }
}
