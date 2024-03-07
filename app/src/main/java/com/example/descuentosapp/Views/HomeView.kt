package com.example.descuentosapp.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.descuentosapp.components.SpaceH

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "App Descuentos")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary//color verde creado
                )
            )
        }
    ) {
        ContentHomeView(it)
    }
}
@Composable
fun ContentHomeView(paddingValues: PaddingValues){
    Column(modifier = Modifier
        .padding(paddingValues)
        .padding(10.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola")
//        SpaceH()
//        Text(text = "Hola")
//        SpaceH(50.dp)
//        Text(text = "Hola")
    }
}