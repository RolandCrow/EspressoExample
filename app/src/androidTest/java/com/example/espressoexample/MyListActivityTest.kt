package com.example.espressoexample

import android.support.test.runner.AndroidJUnit4
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyListActivityTest {



    @Test
    fun clickItem() {
        onView(withId(R.id.rv)).perform(RecyclerViewActions.actionOnItemAtPosition<RandomAdapter
            .ViewHolder>(0,ViewActions.click())) // проверка клика по одной из частей ресайклер вью


    }
}