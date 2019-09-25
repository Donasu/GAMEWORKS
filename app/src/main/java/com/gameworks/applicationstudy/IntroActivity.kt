package com.gameworks.applicationstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import java.util.Timer
import kotlin.concurrent.schedule

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        Timer().schedule(3000){
            //do something
            val nextIntent = Intent(this@IntroActivity, MainActivity::class.java)
            startActivity(nextIntent)
        }

    }
}
