package com.example.android16dz36.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android16dz36.R
import com.example.android16dz36.databinding.ActivitySecondBinding
import com.example.android16dz36.databinding.ItemBinding
import com.example.android16dz36.ui.adapter.AdapterD
import com.example.android16dz36.ui.model.Data

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val carsListAdapter = AdapterD()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillCarsList()
        initRecycler()
    }

    private fun fillCarsList() {
        val carsList = listOf(
            Data("Bugatti Divo", R.drawable.bugatti),
            Data("Bmw", R.drawable.ferarri),
            Data("bmw f90", R.drawable.bmwf90),
            Data("Lamborghini Aventador", R.drawable.lambotghini),
            Data("Ford Mustang", R.drawable.mustang),
            Data("Lamborghini", R.drawable.lamborghini),
        )
        carsListAdapter.setList(carsList)
    }

    private fun initRecycler() {
        binding.RV.adapter =carsListAdapter
    }
}
