package com.kingrabbit.cryptoapp.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography =
    Typography(
        // h1
        displayLarge =
            TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            ),
        // h2
        displayMedium =
            TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
            ),
        // h3
        displaySmall =
            TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
            ),
        // h4
        headlineSmall =
            TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
            ),
        // body1
        bodyLarge =
            TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp,
            ),
        // body2
        bodyMedium =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
            ),
    )
