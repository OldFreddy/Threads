package com.oldfredddy.kotlin_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number1: Int = 6
    private var number2: Int = 6
    private var text: String =
        "В <магазине> осталось 123 яблока, а может и <больше, кто знает> всем привет <как> у вас дела <надеюсь>  все <хорошо>"


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
        var counter: Int = 0
//        var startNumber = Array(3){}
//        var startNumber: Array<Int> = arrayOf(2,6,7,8)
//        var startNumber: Array<Int>
//        var startNumber= IntArray(3)
        for (n in text.indices) {
            if (text.get(n) == '<') counter++
            tvText.text = counter.toString()
        }
        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPcounter: Int = 0
        var endPcounter: Int = 0

        for (n in text.indices) {
            if (text[n] == '<') {
                startPosition[startPcounter] = n
                startPcounter++
            }
        }
        for (n in text.indices) {
            if (text[n] == '>') {
                endPosition[endPcounter] = n
                endPcounter++
            }
        }

        var textFoundArray = Array(counter) { "" }

        for (n in startPosition.indices) {
            textFoundArray[n] = text.substring(startPosition[n] + 1 , endPosition[n])
            Log.d("MyLog", "Text from n : " + textFoundArray[n])
        }


    }


}