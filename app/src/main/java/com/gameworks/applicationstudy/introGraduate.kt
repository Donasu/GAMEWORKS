package com.gameworks.applicationstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_intro_graduate.*

class introGraduate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_graduate)
        btnToast.setOnClickListener {
            Toast.makeText(this,"토스트 메세지 기능!",Toast.LENGTH_LONG)
        }
    }
}
