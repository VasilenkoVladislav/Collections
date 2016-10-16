package com.example.roman.collections;


public class Person
{
    private String imagelink;
    private String fname;
    private String lname;

    public Person(String imagelink, String fname, String lname)
    {
        this.imagelink = imagelink;
        this.fname = fname;
        this.lname = lname;
    }
    //Геттер,сеттеры наших полей,чтобы не нарушать инкапсуляцию
    public String getImagelink()
    {
        return imagelink;
    }

    public void setImagelink(String imagelink)
    {
        this.imagelink = imagelink;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }
}
