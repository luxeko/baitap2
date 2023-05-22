package com.example.productlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.widget.ListView;

import com.example.productlistview.entity.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //B1: TAO DATA SOURCE
        initProduct();

        //B2: TAO ADAPTER GAN VOI DATASOURCE
        CustomAdapter arrayAdapter = new CustomAdapter(this, listProduct);

        //B3: TAO LISTVIEW GAN VOI ADAPTER
        ListView listView = findViewById(R.id.listContact);
        listView.setAdapter(arrayAdapter);

    }
    private void initProduct(){
        listProduct.add(new Product("Nguyen Van A", "0987654321", 33F, R.drawable.user1));
        listProduct.add(new Product("Nguyen Van B", "0987654321", 33F, R.drawable.user2));
        listProduct.add(new Product("Nguyen Van C", "0987654321", 33F, R.drawable.user3));
        listProduct.add(new Product("Nguyen Van C", "0987654321", 33F, R.drawable.user4));
    }
}