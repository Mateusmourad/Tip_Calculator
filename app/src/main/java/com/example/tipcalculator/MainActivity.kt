package com.example.tipcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipcalculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus1 Option one" + isChecked)
        }

        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus option two"+ isChecked)
        }

        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus option three" + isChecked)
        }


        binding.btnClean.setOnClickListener {
            println("Mateus1"+ binding.tieTotal.text)
            println("Mateus1"+ binding.tieNumPeople.text)
        }
    }

}





