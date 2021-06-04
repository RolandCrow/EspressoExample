package com.example.espressoexample

import android.support.test.runner.AndroidJUnit4
import androidx.test.espresso.intent.rule.IntentsTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PickContactActivityTest {

    @Rule
    @JvmField
    val intentRule = IntentsTestRule<PickContactActivity>(PickContactActivity::class.java) //
// тоже самое можно делать и для интентов

}