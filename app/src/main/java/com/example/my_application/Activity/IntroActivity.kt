package com.example.mymads2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.my_application.Adapter.CategoryAdapter
import com.example.my_application.ViewModel.MainViewModel
import com.example.my_application.databinding.MainBinding


class IntroActivity : AppCompatActivity() {
    private lateinit var binding: MainBinding
    private val viewModel= MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       initCategory()
    }

    private fun initCategory() {
        binding.progressBarCategory.visibility = View.VISIBLE
        viewModel.category.observe(this, Observer{
            binding.viewCategory.layoutManager= LinearLayoutManager(this@IntroActivity, LinearLayoutManager.HORIZONTAL,false)
            binding.viewCategory.adapter=CategoryAdapter(it,)
            binding.progressBarCategory.visibility=View.GONE
        })
        viewModel.loadCategory()
    }

}