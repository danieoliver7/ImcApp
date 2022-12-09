package com.example.imc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.imc2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonCalc.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calc){
            calculate()
        }
    }



    fun calculate(){

        val peso = binding.editPeso.text.toString().toFloat()
        val altura = binding.editAltura.text.toString().toFloat()

        val soma = peso / (altura * altura)

        Toast.makeText(this, "seu imc é de: ${"%2f".format(soma)}", Toast.LENGTH_SHORT).show()
    }


}