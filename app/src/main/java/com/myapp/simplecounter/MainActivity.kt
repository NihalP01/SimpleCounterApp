package com.myapp.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var id = 0
        countValue.setText("$id")

        btnTominus.setOnClickListener {
            countValue.setText("${--id}")
            val animation = AnimationUtils.loadAnimation(this,R.anim.slidedown)
            countValue.startAnimation(animation)
        }
        btnToPlus.setOnClickListener {
            countValue.setText("${++id}")
            val animation = AnimationUtils.loadAnimation(this, R.anim.slideup)
            countValue.startAnimation(animation)
        }
        btnToReset.setOnClickListener {
            id = 0
            countValue.setText("$id")
            val animation = AnimationUtils.loadAnimation(this,R.anim.rotate)
            countValue.startAnimation(animation)
            Toast.makeText(this, "Count has been Reset!" , Toast.LENGTH_SHORT).show()

        }
        btnToDouble.setOnClickListener {
            id = 2*id
            countValue.setText("$id")
            val animation = AnimationUtils.loadAnimation(this,R.anim.zoom)
            countValue.startAnimation(animation)
            Toast.makeText(this,"Count has increased by 2 times",Toast.LENGTH_LONG).show()
        }
    }
}