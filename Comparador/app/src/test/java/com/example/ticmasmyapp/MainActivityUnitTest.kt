package com.example.ticmasmyapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.ticmasmyapp.view.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)

class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }
    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }
    @Test
    fun mainViewModel_CheckInitialValue() = runTest {
        val value = viewModel.texto1.value?.text1
        assertEquals(null,value)
    }

    @Test
    fun mainViewModel_TestButton() = runTest {
        launch {
            viewModel.texto1
        }
        advanceUntilIdle()
        val value = viewModel.texto1.value?.text1
        assertEquals(toString(),value)
    }
    }
