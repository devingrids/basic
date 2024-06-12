package br.com.sinng.currrencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.sinng.currrencyconverter.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            val euros = binding.editCurrency.text.toString().toDouble()
//            val dolares = String.format("%.2f", euros * 0.8)
            val dolares = (euros * 0.8 * 100).roundToInt().toDouble()
            binding.textCurrentConverter.text = "$ ${dolares}"
        }
    }
}