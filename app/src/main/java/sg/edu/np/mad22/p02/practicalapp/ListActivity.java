package sg.edu.np.mad22.p02.practicalapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random num = new Random();
            int name = num.nextInt();
            int des = num.nextInt();
            int follow = (Math.random() <= 0.5) ? 0 : 1;
            Boolean followed = (follow == 0) ? true : false;
            User newUser = new User("Name" + Integer.toString(name), "Description " + Integer.toString(des), i, followed);
            userList.add(newUser);
        }

        RecyclerView rv = findViewById(R.id.recyclerView);
        ListActivityAdapter adapter = new ListActivityAdapter(userList);
        LinearLayoutManager layout = new LinearLayoutManager(this);
        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);
    }
}