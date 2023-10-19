package com.example.phonebookui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contact> {
    //declare arraylist to store multiple object as it shrinks and grows dynamically
    private ArrayList<Contact> contactArrayList;
    private Context context;

    public CustomAdapter(Context context, ArrayList<Contact> arrayList)
    {
        //offering the data to the parent class ArrayAdapter
        super(context, R.layout.simple_item_list, arrayList);
        this.contactArrayList = arrayList;
        this.context = context;
    }

    //override the getView method to return a view item with our data: username, phone and image
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MyViewHolder viewHolder; //object storing reference

        if(convertView == null) { //check: if convertView is null, assign it the simple_list_item with its data
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_item_list,
                    parent,
                    false
            );
        }else {  //assuming convertView is not null
            //viewHolder = (MyViewHolder) convertView.getTag(); //offering existing object to the holder
        }
        viewHolder = new MyViewHolder();
        //initialize the views used in simple_list_item
        viewHolder.userImage = (ImageView) convertView.findViewById(R.id.person_imageView);
        viewHolder.userName = (TextView) convertView.findViewById(R.id.personName_textView);
        viewHolder.contactNumber = (TextView) convertView.findViewById(R.id.contactNum_textView);
        viewHolder.goto_imageButton = (ImageButton) convertView.findViewById(R.id.goto_imageButton);

        convertView.setTag(viewHolder); //store reference to the view on the listView

        //adding data to the viewHolder
        Contact contactObject = getItem(position); //get contact object at this position

        viewHolder.userName.setText(contactObject.getUserName());
        viewHolder.contactNumber.setText(contactObject.getContactNumber());
        viewHolder.userImage.setImageResource(contactObject.getImageID());

        //todo set an onclick event to intent to another activity passing username, image, and contact data
        return convertView;
    }

    //define a reference class ViewHolder for views used in the simple_item_list
    private class MyViewHolder{
        TextView userName, contactNumber;
        ImageView userImage;
        ImageButton goto_imageButton;
    }

}
