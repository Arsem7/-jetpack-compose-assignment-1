package com.example.myapplicationindividual.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

public val color = lightColorScheme(
    primary = primary,
    secondary = secondary,
    tertiary = tertiary
)
@Composable
fun MyapplicationindividualTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography,
        content = content
        
    )
}
