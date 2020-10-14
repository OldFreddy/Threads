package com.oldfredddy.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number1: Int = 6
    private var number2: Int = 6

    //private var text: String = "В магазине осталось $number1 яблок"
    private var text: String = "В магазине <осталось> 123 яблока, а может и больше, кто знает..."


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var subString: String = text.substringAfter('<')
        var subString2: String = subString.substringBefore('>')
        tvText.text = subString2


    }




}