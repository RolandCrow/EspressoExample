package com.example.espressoexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Exception



@RunWith(AndroidJUnit4::class)
class MainActivityTest { // тест главной активности

    @Rule @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java) // цель тестирования

    @Test
    @Throws(Exception::class)
    fun clickLoginButton_opensLoginUI() { // проверка работы кнопки
        onView(withId(R.id.btn_login)).perform(click()) // находим ее по id и тестируем имитацию
    // ее нажатия


    }

}