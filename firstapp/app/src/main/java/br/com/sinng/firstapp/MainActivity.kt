package br.com.sinng.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.sinng.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonName.setOnClickListener {
            val name = binding.editName.text.toString()
//            binding.textResult.text = "Olá ${name}"
//            binding.textResult.text = "Olá " + name
            binding.textResult.setText("Olá ${name}")
        }
    }
}