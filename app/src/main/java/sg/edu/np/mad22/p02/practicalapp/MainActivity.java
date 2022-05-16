package sg.edu.np.mad22.p02.practicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent receivingEnd = getIntent();
        User placeUser = new User();
        placeUser.Name = String.format("Gareth %s", receivingEnd.getStringExtra("randomNumber"));
        placeUser.Description = "Absolute failure";
        placeUser.Followed = false;
        TextView username = findViewById(R.id.name);
        username.setText(placeUser.Name);
        TextView description = findViewById(R.id.description);
        description.setText(placeUser.Description);

        // Button shenanigans start here

        Button followButton = findViewById(R.id.followed);
        followButton.setOnClickListener(view1 -> {
            if (!placeUser.Followed){
                followButton.setText("Unfollow");
                Toast.makeText(this, "Followed", Toast.LENGTH_SHORT).show();
            }
            else{
                followButton.setText("Follow");
                Toast.makeText(this, "Unfollowed", Toast.LENGTH_SHORT).show();
            }
            placeUser.Followed = !placeUser.Followed;
        });
    }
}