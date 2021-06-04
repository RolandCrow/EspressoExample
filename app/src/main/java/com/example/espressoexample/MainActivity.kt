package com.example.espressoexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var loginButton: Button // кнопка для логина

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.btn_login) // присоединяем к вью переменную

        loginButton.setOnClickListener { // устанавливаем слушатель событий
            val intent = Intent(this, LoginActivity::class.java) // явный интент в  логин активити
            startActivity(intent)

        }



    }
}