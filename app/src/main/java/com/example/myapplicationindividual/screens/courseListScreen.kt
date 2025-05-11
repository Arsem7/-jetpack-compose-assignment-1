package com.example.myapplicationindividual.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplicationindividual.model.CourseCard
import com.example.myapplicationindividual.model.Course


@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(
        modifier = Modifier.padding(16.dp),

    verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
