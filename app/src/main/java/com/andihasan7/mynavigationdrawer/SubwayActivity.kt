package com.andihasan7.mynavigationdrawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andihasan7.mynavigationdrawer.databinding.ActivitySubwayBinding

class SubwayActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubwayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubwayBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}