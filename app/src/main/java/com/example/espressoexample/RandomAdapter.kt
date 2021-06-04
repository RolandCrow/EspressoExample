package com.example.espressoexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RandomAdapter(private var items: ArrayList<Random>): RecyclerView.Adapter<RandomAdapter
.ViewHolder>() { // подключаем ресайкл вью




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //
        // имплемицируемый метод ресайкл вью
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_country,
            parent, false) // то что будет вставать и отображаться в активити

        return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {    // имплемицируемый метод ресайкл вью
        var country = items[position] // переменная из рендома для установки во вью
        holder.txtName?.text   = country.name // устанавливаем во вью

    }

    override fun getItemCount(): Int {    // имплемицируемый метод ресайкл вью
        return items.size
    }


    class ViewHolder(row: View): RecyclerView.ViewHolder(row) {
        var txtName: TextView? = null // имя из текст вью изначально налл

        init {
            this.txtName = row.findViewById(R.id.tv_country) // устанавливаем его в id в текст
            // вью в макете
        }

    }


}