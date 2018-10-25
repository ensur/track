package com.example.user.hw1

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    val timer = object : CountDownTimer(TimeUnit.SECONDS.toMillis(2), TimeUnit.SECONDS.toMillis(1)){
        override fun onTick(p0: Long) {
        }

        override fun onFinish() {

            val intent =Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
            this@MainActivity.finish()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer.start()

    }




}
