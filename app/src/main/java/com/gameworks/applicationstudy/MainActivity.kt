package com.gameworks.applicationstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvIntroduce.text = "2000년도 미디어학부와 같이 설립된 게임웍스는 미디어학술소모임입니다." +
                "Android Studio나 Unity 등의 엔진들을 이용한 스터디 및 멘토링을 통해 개발 능력을 함양하는 곳입니다." +
                "또한 학술적으로 해커톤, 졸업한 선배들과의 홈커밍 행사를 통해 뜻깊은 행사들이 이루어집니다."
        nextBtn.setOnClickListener{
            Timer().schedule(3000){
                //do something
                val nextIntent = Intent(this@MainActivity, introGraduate::class.java)
                startActivity(nextIntent)
            }
        }
    }
}
