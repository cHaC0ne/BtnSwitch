package com.example.botonswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.botonswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.switch1.setOnClickListener {
            if (b.switch1.isChecked) {
                b.imageView.setImageResource(R.drawable.bomencendida)
            } else {
                b.imageView.setImageResource(R.drawable.bombapagada)
            }

        }

    }
}


