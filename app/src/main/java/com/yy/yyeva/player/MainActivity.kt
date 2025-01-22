package com.yy.yyeva.player

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yy.yyeva.player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, EvaDemoActivity::class.java))
        }

        binding.btn2.setOnClickListener {
            startActivity(Intent(this, EvaKeyDemoActivity::class.java))
        }

        binding.btn3.setOnClickListener {
            startActivity(Intent(this, EvaDownloadDemoActivity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this, EvaKeyListDemoActivity::class.java))
        }
    }
}