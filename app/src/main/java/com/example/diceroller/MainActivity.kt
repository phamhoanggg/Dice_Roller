package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val resultImageView: ImageView = findViewById(R.id.imageView)
            val rollResult: Int = (1..6).random()

            when (rollResult) {
                1 -> resultImageView.setImageResource(R.drawable.dice_1)
                2 -> resultImageView.setImageResource(R.drawable.dice_2)
                3 -> resultImageView.setImageResource(R.drawable.dice_3)
                4 -> resultImageView.setImageResource(R.drawable.dice_4)
                5 -> resultImageView.setImageResource(R.drawable.dice_5)
                6 -> resultImageView.setImageResource(R.drawable.dice_6)
            }
        }
    }
}