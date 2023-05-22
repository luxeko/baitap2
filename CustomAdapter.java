package com.example.productlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.productlistview.entity.Product;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Activity activity;
    private List<Product> listContact;

    public CustomAdapter(Activity activity, List<Product> listContact) {
        this.activity = activity;
        this.listContact = listContact;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return listContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.item, null);
        }

        // get current item to be displayed
        Product currentItem = (Product) getItem(position);

        // get the TextView for item name and item description
        ImageView ivAvatar = (ImageView)
                convertView.findViewById(R.id.ivAvatar);
        TextView tvTitle = (TextView)
                convertView.findViewById(R.id.tvTitle);
        TextView tvPrice = (TextView)
                convertView.findViewById(R.id.tvPrice);

        //sets the text for item name and item description from the current item object
        ivAvatar.setImageResource(currentItem.getImage());
        tvTitle.setText(currentItem.getTitle());
        tvPrice.setText(String.valueOf(currentItem.getPrice()));

        // returns the view for the current row
        return convertView;
    }
}
