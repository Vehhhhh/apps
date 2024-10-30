package com.example.my_application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.my_application.databinding.ActivityIntro2Binding
import com.example.mymads2.IntroActivity

class IntroActivity1 : BaseActivity(){
    private lateinit var binding: ActivityIntro2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntro2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            startBtn.setOnClickListener {
                startActivity(Intent(this@IntroActivity1, IntroActivity::class.java))
            }
        }
    }

}
