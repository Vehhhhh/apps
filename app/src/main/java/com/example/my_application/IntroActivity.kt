package com.example.mymads2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.my_application.databinding.ActivityIntro2Binding
import com.example.my_application.databinding.MainBinding


class IntroActivity : AppCompatActivity() {
    private lateinit var binding: MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set a click listener for the button using the binding
//        binding.apply {
//            startBtn.setOnClickListener {
//                // Navigate to MainActivity on button click
//                startActivity(Intent(this@IntroActivity2, MainActivity::class.java))
//            }
//        }
    }
}