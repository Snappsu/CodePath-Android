package com.example.finaltestapp

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textStrinBtn = findViewById<Button>(R.id.textStrinBtn)
        val textColorBtn = findViewById<Button>(R.id.textColorBtn)
        val viewColorBtn = findViewById<Button>(R.id.viewColorBtn)
        val textLabel = findViewById<TextView>(R.id.textLabel)

        textStrinBtn.setOnClickListener() {
            val rng = (0..2).random()
            when (rng) {
                0 -> textLabel.setText("Hello World!")
                1 -> textLabel.setText("Hello from Aaron!")
                2 -> textLabel.setText("How is your day?")
            }


        }

        textColorBtn.setOnClickListener() {
            val rng = (0..6).random()
            when (rng) {
                0 -> textLabel.setTextColor(getResources().getColor(R.color.black))
                1 -> textLabel.setTextColor(getResources().getColor(R.color.red))
                2 -> textLabel.setTextColor(getResources().getColor(R.color.green))
                3 -> textLabel.setTextColor(getResources().getColor(R.color.blue))
                4 -> textLabel.setTextColor(getResources().getColor(R.color.cyan))
                5 -> textLabel.setTextColor(getResources().getColor(R.color.magenta))
                6 -> textLabel.setTextColor(getResources().getColor(R.color.yellow))
            }


        }

        viewColorBtn.setOnClickListener() {
            val rng = (0..6).random()
            when (rng) {
                0 -> view.setBackgroundColor(getResources().getColor(R.color.black))
                1 -> view.setBackgroundColor(getResources().getColor(R.color.red))
                2 -> view.setBackgroundColor(getResources().getColor(R.color.green))
                3 -> view.setBackgroundColor(getResources().getColor(R.color.blue))
                4 -> view.setBackgroundColor(getResources().getColor(R.color.cyan))
                5 -> view.setBackgroundColor(getResources().getColor(R.color.magenta))
                6 -> view.setBackgroundColor(getResources().getColor(R.color.yellow))
            }
        }

    }
}
