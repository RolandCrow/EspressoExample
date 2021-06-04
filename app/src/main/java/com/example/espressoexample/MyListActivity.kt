package com.example.espressoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView // присоединяем ресайклер вью из рендом
    // адаптера

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)

        val adapter = RandomAdapter(generateData()) // подключаем адаптер и создаем случайные
    // значенич
        val layoutManager = LinearLayoutManager(applicationContext) // подключаем разметку для
    // ресайклера
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator() // подключаем анимации

        recyclerView.adapter = adapter // подключаем адаптер ресайклер вью
        adapter.notifyDataSetChanged()
    }


    private fun generateData(): ArrayList<Random> { // метож для генерации случайностей
        var result = java.util.ArrayList<Random>()

        for(i in 0..20) { // 20 случайных генераций
            var country = Random("Random $i")
            result.add(country)
        }

        return result
    }
}