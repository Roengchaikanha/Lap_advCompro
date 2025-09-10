package com.example.lap_advcompro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {

    private Button topage2;
    private Button Bttobrowse; //ปุ่ม
    private ProgressBar progressBar1; // Progressbar


    @SuppressLint("MissingSuperCall")
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
//Lap_04
        class Main {
            public void main(String[] args) {

                // ======= TextNote Example =======
                TextNote tNote = new TextNote(); // สร้าง object TextNote
                tNote.setTitle("Meeting");        // กำหนด title
                tNote.setContent("Discuss project"); // กำหนด content
                tNote.displayNote();              // เรียก method override ของ TextNote

                System.out.println("-----");

                // ======= CheckListNote Example =======
                ChecklistNote cNote = new ChecklistNote();
                cNote.setTitle("Shopping List");
                cNote.setContent("ของที่ต้องซื้อ");
                cNote.setcreatedDate("2025-09-09"); // กำหนดวันที่สร้าง
                cNote.setTask1("Milk");             // กำหนด Task 1
                cNote.setTask2("Bread");            // กำหนด Task 2
                cNote.displayNote();                // เรียก method override ของ CheckListNote

                System.out.println("===== User Example =====");

                // ======= NormalUser Example =======
                User u1 = new NormalUser();
                u1.setName("Kim");                  // กำหนดชื่อ
                u1.setEmail("kim@gmail.com");       // กำหนด email
                u1.setPassword(1234);               // กำหนด password
                u1.displayUser();                      // เรียก method override ของ NormalUser

                System.out.println("-----");

                // ======= Polymorphism Example =======
                Note n = new TextNote();            // Reference เป็น Note
                n.setTitle("Polymorphism Test");
                n.setContent("This is a test");
                n.displayNote();                    // เรียก override method ของ TextNote

                User u = new NormalUser();          // Reference เป็น User
                u.setName("Poly User");
                u.setEmail("poly@gmail.com");
                u.setPassword(9999);
                u.displayUser();                       // เรียก override method ของ NormalUser
            }
        }


        //ไปหน้าMain
        topage2 = findViewById(R.id.button);
        topage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                System.out.println("Topage2");
                Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
                startActivity(intent);
            }
        });

        progressBar1 = findViewById(R.id.progressBar1);
        Bttobrowse = findViewById(R.id.Bttobrowse);

        progressBar1.setVisibility(View.GONE); // ซ่อนก่อน

        Bttobrowse.setOnClickListener(v -> {
            progressBar1.setVisibility(View.VISIBLE); // แสดง
            Bttobrowse.setEnabled(false); // ปิดปุ่มชั่วคราว

            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
                runOnUiThread(() -> {
                    progressBar1.setVisibility(View.GONE); // ซ่อนอีกครั้ง
                    Bttobrowse.setEnabled(true); // เปิดปุ่มกลับ
                    startActivity(new Intent(getApplicationContext(), BrowseNoteActivity.class));
                });
            }).start();
        });
    }
}

