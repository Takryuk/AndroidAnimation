package com.app1.androidanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class views_animation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_animation)

        val scaleBTN = findViewById<Button>(R.id.start_scale)
        val fadeBTN = findViewById<Button>(R.id.fade_btn)
        val imageView = findViewById<ImageView>(R.id.scale_image)


        scaleBTN.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            imageView.startAnimation(animation)
        }

        fadeBTN.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade)
            imageView.startAnimation(animation)
        }
    }
}
