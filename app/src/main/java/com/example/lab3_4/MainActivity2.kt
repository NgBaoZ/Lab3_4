package com.example.lab3_4
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Liên kết các thành phần giao diện
        val textViewContainer: LinearLayout = findViewById(R.id.textViewContainer)
        val addFromXmlButton: Button = findViewById(R.id.addFromXmlButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        // LayoutInflater để nạp giao diện từ XML
        val inflater = LayoutInflater.from(this)
        // Xử lý sự kiện nhấn nút "Thêm thành phần"
        addFromXmlButton.setOnClickListener {
            val textView = inflater.inflate(R.layout.text_layout, textViewContainer, false)
            textViewContainer.addView(textView) // Thêm TextView từ XML vào LinearLayout
        }
        // Xử lý sự kiện nhấn nút "Xóa tất cả"
        clearButton.setOnClickListener {
            textViewContainer.removeAllViews() // Xóa tất cả các TextView đã thêm
        }
    }
}
