package com.gutosoethe.calculakilo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gutosoethe.calculakilo.databinding.ActivityMainBinding
import com.gutosoethe.calculakilo.databinding.ActivitySettingBinding


class SettingActivity : AppCompatActivity(){

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()


        binding.btnSavaSetting.setOnClickListener(){

            val ValorGrama = binding.edtPricePerGrama.toString().toDouble()


        }





    }
}