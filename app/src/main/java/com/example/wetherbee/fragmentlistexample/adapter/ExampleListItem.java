package com.example.wetherbee.fragmentlistexample.adapter;

/**
 * Created by Wetherbee on 4/17/2015.
 */
public class ExampleListItem {

    private String itemTitle;

    public String getItemTitle(){
        return itemTitle;
    }

    public void setItemTitle(String itemTitle){
        this.itemTitle = itemTitle;
    }

    public ExampleListItem(String title){
        this.itemTitle = title;
    }
}
