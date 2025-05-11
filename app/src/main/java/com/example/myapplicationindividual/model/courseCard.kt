package com.example.myapplicationindividual.model


import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplicationindividual.model.CourseCard

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { isExpanded = !isExpanded },
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)

                .animateContentSize()
        ) {
            Text(
                text = "${course.title} (${course.code})",
                style = MaterialTheme.typography.titleMedium
            )


            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Description:",
                    style = MaterialTheme.typography.labelLarge
                )
                Text(
                    text = "Credit Hours: ${course.creditHours}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = course.description,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Prerequisites:",
                    style = MaterialTheme.typography.labelLarge
                )
                Text(
                    text = course.prerequisites,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
