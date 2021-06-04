package com.example.espressoexample

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest { // тест логин активности

    @Rule
    @JvmField
    var activityRule = ActivityTestRule<LoginActivity>(LoginActivity::class.java) // цель
// тестирования

    private val username = "chike"
    private val password = "password"

    @Test
    fun clickLoginButton_opensLoginUi() { // тестируем кнопку
        onView(withId(R.id.et_username)).perform(ViewActions.typeText(username)) // тестирование
    // ввода текста
        onView(withId(R.id.et_password)).perform(ViewActions.typeText(password)) // тоже самое
    // только с паролем

        onView(withId(R.id.btn_submit)).perform(ViewActions.scrollTo(), ViewActions.click()) //
    // тест на прокрутку и нажатие

        Espresso.onView(withId(R.id.tv_login)).check(matches(withText("Success"))) // проверяем
    // успешность выполение и отправления логина и пароля




    }




}