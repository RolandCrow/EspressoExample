package com.example.espressoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText // создаеи переменные для связи со вью
    private lateinit var loginTitleTextView: TextView
    private lateinit var passwordEditText: EditText
    private lateinit var submitButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.et_username) // подключаем к вью
        passwordEditText = findViewById(R.id.et_username)
        submitButton = findViewById(R.id.btn_submit) // кнопка
        loginTitleTextView = findViewById(R.id.tv_login) // логин

        submitButton.setOnClickListener { // слушатель событий на кнопку
            if(usernameEditText.text.toString() == "chike" &&
                    passwordEditText.text.toString() == "password" // если логин и пароль такие
            // то разрешить доступ
                    ) {
                loginTitleTextView.text = "Success"
            } else {
                loginTitleTextView.text = "Failure" // или ошибка
            }

        }



    }
}