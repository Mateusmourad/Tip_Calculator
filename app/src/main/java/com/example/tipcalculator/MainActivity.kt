package com.example.tipcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipcalculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var percentage: Int= 0
        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus1 Option one" + isChecked)
            if(isChecked) {
                percentage = 10
            }

        }

        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus option two"+ isChecked)
            if(isChecked) {
                percentage = 15
            }
        }

        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            println("Mateus option three" + isChecked)
            if(isChecked) {
                percentage = 20
            }
        }

        binding.btnClean.setOnClickListener {
            println("Mateus1"+ binding.tieTotal.text)
            println("Mateus1"+ binding.tieNumPeople.text)
        }

        binding.btnDone.setOnClickListener {
            val totalTable: Float = binding.tieTotal.text.toString().toFloat()
            val nPeople: Int = binding.tieNumPeople.text.toString().toInt()

            val totalTemp = totalTable / nPeople
            val tips = totalTemp * percentage / 100
            val totalWithTips = totalTemp + tips
            println("Mateus1 "+ totalWithTips)
        }
    }

}





