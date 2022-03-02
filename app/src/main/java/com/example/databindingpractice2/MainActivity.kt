package com.example.databindingpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingpractice2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var manager:RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var data= listOf(Model( 1,"Navneet"),
            Model( 2,"Naman"), Model( 3,"Abhineet"),Model( 3,"AbhineetSingh"),Model( 3,"AbhineetChauhaN"),Model( 3,"AbhineetsHI"))

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        manager=LinearLayoutManager(this)
        binding.recycler.apply {
            adapter=RecyclerViewAdapter(data)
            layoutManager=manager
        }





    }
}