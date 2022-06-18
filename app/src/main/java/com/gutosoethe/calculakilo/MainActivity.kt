package com.gutosoethe.calculakilo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gutosoethe.calculakilo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

    }

    override fun onStart() {
        super.onStart()

        binding.btnSetting.setOnClickListener() {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        binding.btnCalcular.setOnClickListener(){
            val pesoUnidade = binding.edtQtdKilo.text.toString().toDouble();
            val precoUnidade = 3.5

            val precoPorKilo = (precoUnidade*pesoUnidade)/100

            binding.tvPrice.text = "Total a Pagar = R$ ${precoPorKilo}"

        }
    }
}