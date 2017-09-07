package com.chao.canh.k_demo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Toast.makeText(this@MainActivity,"hello",Toast.LENGTH_SHORT).show()
            textView.text="hello"
            //textView.setText("hello")

        }
    }
}
