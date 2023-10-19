package com.example.phonebookui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declare all used classes and Views
    private TextView appTitle;
    private ListView phoneListView;
    private ArrayList<Contact> myContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate the views and classes
        appTitle = (TextView) findViewById(R.id.phonebook_textView);
        phoneListView = (ListView) findViewById(R.id.listView);
        myContacts = new ArrayList<Contact>();

        //create objects for contact
        Contact contact1 = new Contact("Mike Tyson", "0720000000", R.drawable.miketyson);
        Contact contact2 = new Contact("Paddy", "0721111111", R.drawable.paddy);
        Contact contact3 = new Contact("Michelle", "0722222222", R.drawable.michelle);
        Contact contact4 = new Contact("Clement", "0723333333", R.drawable.clement);
        Contact contact5 = new Contact("John Cena", "0724444444", R.drawable.john_cena);
        Contact contact6 = new Contact("Big Sean", "0725555555", R.drawable.big_sean);
        Contact contact7 = new Contact("Mrs MM", "0726666666", R.drawable.no_profile_image);
        Contact contact8 = new Contact("Drake", "0727777777", R.drawable.drake);
        Contact contact9 = new Contact("Fred", "0728888888", R.drawable.fred);
        Contact contact10 = new Contact("No Name", "0729999999", R.drawable.no_profile_image);
        Contact contact11 = new Contact("Jon Doe", "0730000000", R.drawable.john_doe);
        Contact contact12 = new Contact("Thobekile", "0731111111", R.drawable.thoby);

        //initializing the arraylist with objects
        myContacts.add(contact1);
        myContacts.add(contact2);
        myContacts.add(contact3);
        myContacts.add(contact4);
        myContacts.add(contact5);
        myContacts.add(contact6);
        myContacts.add(contact7);
        myContacts.add(contact8);
        myContacts.add(contact9);
        myContacts.add(contact10);
        myContacts.add(contact11);
        myContacts.add(contact12);

        //passing values to customized adapter
        CustomAdapter arrayAdapter = new CustomAdapter(this, myContacts);
        phoneListView.setAdapter(arrayAdapter);

        phoneListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "buddy", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}