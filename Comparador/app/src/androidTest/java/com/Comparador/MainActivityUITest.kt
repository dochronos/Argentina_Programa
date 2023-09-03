package com.Comparador

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.proyectofinal.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityUITest {

    @get:Rule
    var rule:  ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testUIElementsAndClearButton() {
        onView(withId(R.id.editText)).check(matches(isDisplayed()))
        onView(withId(R.id.editText1)).check(matches(isDisplayed()))
        onView(withId(R.id.compareBtn)).check(matches(isDisplayed()))
        onView(withId(R.id.clearBtn)).check(matches(isDisplayed()))

        onView(withId(R.id.editText)).perform(typeText("hola"))
        onView(withId(R.id.editText1)).perform(typeText("mundo"))

        onView(withId(R.id.compareBtn)).perform(click())

        onView(withId(R.id.resultText))
            .check(matches(withText("Las palabras 'hola' y 'mundo' no son iguales.")))

        onView(withId(R.id.clearBtn)).perform(click())

        onView(withId(R.id.editText)).check(matches(withText("")))
        onView(withId(R.id.editText1)).check(matches(withText("")))
        onView(withId(R.id.resultText)).check(matches(withText("")))
    }
}
