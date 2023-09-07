package com.example.compare

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            val string1 = editText1.text.toString()
            val string2 = editText2.text.toString()
            if (string1 == string2){
                textView.text = resources.getString(R.string.iguales)
            } else {
                textView.text = resources.getString(R.string.diferentes)
            }
        }
    }
}
