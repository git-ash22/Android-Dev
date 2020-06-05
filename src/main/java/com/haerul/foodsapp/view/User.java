/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 14/5/20 2:38 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2020. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view;

public class User {
    //variables
    int id;
    String name;
    String password;
    // Constructor with two parameters name and password
    public User(String name,String password)
    {
        this.name=name;
        this.password=password;
    }
    //Parameter constructor containing all three parameters
    public User(int id,String name,String psd)
    {
        this.id=id;
        this.name=name;
        this.password=psd;
    }
    //getting id
    public int getId() {
        return id;
    }
    //setting id
    public void setId(int id) {
        this.id = id;
    }
    //getting name
    public String getName() {
        return name;
    }
    //setting name
    public void setName(String name) {
        this.name = name;
    }
    //getting password
    public String getPassword() {
        return password;
    }
    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
}