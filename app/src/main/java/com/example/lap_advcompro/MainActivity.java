package com.example.lap_advcompro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {

    private Button topage2;
    private View view;
    private Button Button3;
    private String name;
    private String email;


//    Private AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    topage2 = findViewById(R.id.button);
    topage2.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            System.out.println("Topage2");
            Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
            startActivity(intent);
        }
    });
//        view = findViewById(R.id.view);

//        builder = new AlertDialog.Builder(this);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("touched");
//                Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
//                startActivity(intent);


//                builder.setTitle("Alert");
//                builder.setMessage("Are you sure you want to exit?");
//                builder.setCancelable(false);
//                builder.show();
//                return false;
////
//            }
//        });

//        void onclickSave(View view) {
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etuserEmail = findViewById(R.id.etuserEmail);
        EditText editTextText2 = findViewById(R.id.editTextText2);

        Button Button3 = findViewById(R.id.button3);

        TextView textViewUser = findViewById(R.id.textViewUser);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewContent = findViewById(R.id.textViewContent);

            String username = etUsername.getText().toString();
            String userEmail = etuserEmail.getText().toString();
            String content = editTextText2.getText().toString();

            //สร้าง user
            User user = new User();
            User.setID(1);
            User.setName(name);
            User.setEmail(email);

            //สร้าง Note
            Note note = new Note();
            Note.setTitle(1);
            Note.setContent(content);
            Note.setUser(user);

            //แสดงผล
            textViewUser.setText(user.getName());
            textViewEmail.setText(user.getEmail());
            textViewContent.setText(note.getContent());
        }


    }
}