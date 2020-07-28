package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] items_list = {
            "Learn Android From Scratch",
            "Build very nice Web Apps",
            "Learn Android From Scratch",
            "Build Very Nice Web Apps",
            "Start New Job Path as a Web Hacker",
            "Build Very Nice Personality and Learn More",
            "Build Very Nice ios Apps",
            "Design Very Nice Web Apps",
            "Design Android Apps in PhotoShop",
            "use the most popular App Development Framework to build you apps",
            "How to market your website in the Internet",
            "Download any types of video's with one click",
            "how to write very clear code for android"

    };

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_views);
        listView.setBackground(getDrawable(android.R.drawable.alert_light_frame));
        ArrayList<OneComponentBindingItem>items=new ArrayList<>();
        items.add(new OneComponentBindingItem("Android Development","Learn Android From Scratch",R.drawable.child3));
        items.add(new OneComponentBindingItem("Web Development","Build very nice Web Apps",R.drawable.englisone));
        items.add(new OneComponentBindingItem("Android Development","Learn Android From Scrath",R.drawable.img4));
        items.add(new OneComponentBindingItem("Web Development","Build Very Nice Web Apps",R.drawable.img3));
        items.add(new OneComponentBindingItem("Web Hacking","Start New Job Path as a Web Hacker",R.drawable.englishtwo));
        items.add(new OneComponentBindingItem("Human Development","Build Very Nice Personality and Learn More ",R.drawable.englisone));
        items.add(new OneComponentBindingItem("ios Development","Build Very Nice ios Apps",R.drawable.img2));
        items.add(new OneComponentBindingItem("Web Design","Design Very Nice Web Apps",R.drawable.englisone));
        items.add(new OneComponentBindingItem("Android App Design","Design Android Apps in photoshop",R.drawable.englisone));
        items.add(new OneComponentBindingItem("Andriod Fraemwork","use the most puoplar App Development Fraemwork to build you apps",R.drawable.englisone));
        CustomAdapter customAdapter=new CustomAdapter(getBaseContext(),items);
        listView.setAdapter(customAdapter);
        listView.setDivider(null);

    }
}