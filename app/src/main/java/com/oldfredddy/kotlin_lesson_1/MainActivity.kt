package com.oldfredddy.kotlin_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number1: Int = 6
    private var number2: Int = 6

    //private var text: String = "В магазине осталось $number1 яблок"
    private var text: String = "В <магазине> осталось 123 яблока, а может и <больше, кто знает>..."


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var subString: String = text.substringAfter('<')
//        var subString2: String = subString.substringBefore('>')
//        tvText.text = subString2
        var index: Int

        var substring: String = text.substringAfter('<')
        var substring2: String = substring.substringBefore('>')
        var substring3 = text.substringAfter('>')
        var substring4 = substring3.substringAfter('<')
        var substring5 = substring4.substringBefore('>')
        tvText.text = substring2
        tvText2.text = substring5


    }


}