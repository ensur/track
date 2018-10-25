package com.example.user.hw1

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var baseNumbers = mutableMapOf<Int, String>()
    val timer = object : CountDownTimer(1000000, 1000){
        override fun onTick(p0: Long) {

            timerInfo.setText(makeWord(1000.minus(p0.div(1000)).toInt()))

        }

        override fun onFinish() {
            timerButton.setText("Start")
            cancel()
        }

    }
    lateinit var timerInfo : TextView
    lateinit var timerButton: Button
    var isTimerOn: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        timerInfo = findViewById(R.id.textView)
        timerButton = findViewById(R.id.button2)

        makeNumbers()
        timerButton.setOnClickListener{
            if(isTimerOn==true){
                timer.onFinish()
                isTimerOn=false
            }else {
                timerButton.setText("Stop")
                timer.start()
                isTimerOn=true
            }
        }




    }

    fun makeNumbers(){
        baseNumbers.put(0, "ноль")
        baseNumbers.put(1, "один")
        baseNumbers.put(2, "два")
        baseNumbers.put(3, "три")
        baseNumbers.put(4, "четыре")
        baseNumbers.put(5, "пять")
        baseNumbers.put(6, "шесть")
        baseNumbers.put(7, "семь")
        baseNumbers.put(8, "восемь")
        baseNumbers.put(9, "девять")
        baseNumbers.put(10, "десять")
        baseNumbers.put(11, "одиннадцать")
        baseNumbers.put(12, "двенадцать")
        baseNumbers.put(13, "тринадцать")
        baseNumbers.put(14, "четырнадцать")
        baseNumbers.put(15, "пятнадцать")
        baseNumbers.put(16, "шестнадцать")
        baseNumbers.put(17, "семнадцать")
        baseNumbers.put(18, "восемнадцать")
        baseNumbers.put(19, "девятнадцать")
        baseNumbers.put(20, "двадцать")
        baseNumbers.put(30, "тридцать")
        baseNumbers.put(40, "сорок")
        baseNumbers.put(50, "пятьдесят")
        baseNumbers.put(60, "шестьдесят")
        baseNumbers.put(70, "семьдесят")
        baseNumbers.put(80, "восемьдесят")
        baseNumbers.put(90, "девяносто")
        baseNumbers.put(100, "сто")
        baseNumbers.put(200, "двести")
        baseNumbers.put(300, "триста")
        baseNumbers.put(400, "четыреста")
        baseNumbers.put(500, "пятьсот")
        baseNumbers.put(600, "шестьсот")
        baseNumbers.put(700, "семьсот")
        baseNumbers.put(800, "восемьсот")
        baseNumbers.put(900, "девятьсот")
    }
    fun makeWord(intTime: Int): String{
        var ind = intTime
        var stringWord: String = ""
        var i =0
        while(i<ind.toString().length){

            if(ind.div(100)!=0){

                stringWord = stringWord.plus(baseNumbers.get(ind.div(100)*100)).plus(" ")
                ind %= 100
            }
                if(ind==0) break;
                if((ind<20)){
                    stringWord = stringWord.plus(baseNumbers.get(ind)).plus(" ")
                    break;
                }else{
                    stringWord = stringWord.plus(baseNumbers.get(ind.div(10)*10)).plus(" ")
                    if(ind.rem(10)!=0) {
                        stringWord = stringWord.plus(baseNumbers.get(ind.rem(10)))
                    }
                    break;
                }
            //i++
        }
        return stringWord
    }



}

