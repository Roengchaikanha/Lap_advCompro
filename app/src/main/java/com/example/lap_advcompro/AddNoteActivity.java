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

public class AddNoteActivity extends AppCompatActivity {
public Button backtopage1;
public Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.addnoteactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        backtopage1 = findViewById(R.id.buttonback);
        backtopage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("backtopage1");
                Intent intent = new Intent(AddNoteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        }





        //Lap-05
    public void onclickAddNote(View view) {
        EditText EdtName = findViewById(R.id.editTextName);
        EditText EdtTitle = findViewById(R.id.edittitle);
        EditText EdtContent = findViewById(R.id.editcontent);

        TextView txtName = findViewById(R.id.textViewUser);
        TextView txtTitle = findViewById(R.id.textViewtitle);
        TextView txtContent = findViewById(R.id.textViewcontent);
        String name = EdtName.getText().toString();
        String title = EdtTitle.getText().toString();
        String content = EdtContent.getText().toString();

        txtName.setText("ชื่อผู้ใช้: " + name);
        txtTitle.setText("ชื่อเรื่อง: " + title);
        txtContent.setText("เนื้อหา: " + content);
    }
}
