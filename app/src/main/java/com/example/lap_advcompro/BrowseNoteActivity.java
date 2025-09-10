package com.example.lap_advcompro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BrowseNoteActivity extends AppCompatActivity {


    Button buttonback;
    private EditText edittextSearch;
    private Button Search;
    private ProgressBar progressBarSearch;
    private TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_browse_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ปุ่มกลับ
        buttonback = findViewById(R.id.buttonBack);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back");
                Intent intent = new Intent(BrowseNoteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //Lap-06
        edittextSearch = findViewById(R.id.editTextSearch);
        Search = findViewById(R.id.buttonSearch);
        progressBarSearch = findViewById(R.id.progressBarSearch);
        textResult = findViewById(R.id.textViewSearch);
        // คลิกปุ่มค้นหา
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBarSearch.setVisibility(View.VISIBLE); // โชว์ ProgressBar
                Search.setEnabled(false);                      // ปิดปุ่มชั่วคราว
                textResult.setText("");                        // ล้างข้อความเก่า

                // สร้าง Thread จำลองโหลดข้อมูล
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000); // ดีเลย์ 2 วิ
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progressBarSearch.setVisibility(View.GONE); // ซ่อน ProgressBar
                                Search.setEnabled(true);                   // เปิดปุ่มอีกครั้ง

                                // แสดงผล (สมมติว่าไม่พบข้อมูล)
                                textResult.setText("ไม่พบข้อมูล");
                            }
                        });
                    }
                }).start();
            }
        });














        }
    }
