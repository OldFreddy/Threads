package com.oldfredddy.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var start: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {
            start = true
            while (start) {
                Thread.sleep(1000)
                runOnUiThread {
                    if (counter == 5) {
                        cLayout.setBackgroundColor(Color.BLUE)
                    }
                    tvText.text = counter.toString()
                    counter++
                    
                }
            }


        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }
}