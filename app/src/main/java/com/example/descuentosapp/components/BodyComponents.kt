package com.example.descuentosapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpaceH(size: Dp = 10.dp){
    Spacer(modifier = Modifier.height(size))
}

@Composable
fun SpaceW(size: Dp = 10.dp){
    Spacer(modifier = Modifier.width(size))
}
