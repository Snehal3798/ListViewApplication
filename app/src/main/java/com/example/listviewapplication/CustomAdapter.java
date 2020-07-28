package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<OneComponentBindingItem> {


    public CustomAdapter(@NonNull Context context, @NonNull List<OneComponentBindingItem> objects) {
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.my_item,parent,false);
               OneComponentBindingItem item = getItem(position);
        TextView texttitle=convertView.findViewById(R.id.texttitle);
        texttitle.setText(item.getTextViewtitle());

        TextView textdesc=convertView.findViewById(R.id.textdesc);
        textdesc.setText(item.getTextViewtitle());

        ImageView imageView=convertView.findViewById(R.id.imageView);
        imageView.setImageResource(item.getImage_res());

        Animation animation= AnimationUtils.loadAnimation(getContext(),R.anim.my_anim);
        


        return  convertView;





    }

}
