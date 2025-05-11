package com.example.myapplicationindividual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.myapplicationindividual.data.sampleCourses
import com.example.myapplicationindividual.screens.CourseListScreen
import com.example.myapplicationindividual.screens.WelcomeScreen
import com.example.myapplicationindividual.ui.theme.MyapplicationindividualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyapplicationindividualTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    var showWelcome by rememberSaveable { mutableStateOf(true) }

                    if (showWelcome) {
                        WelcomeScreen(onContinue = { showWelcome = false })
                    } else {
                        CourseListScreen(courses = sampleCourses)
                    }
                }
            }
        }
    }
}
