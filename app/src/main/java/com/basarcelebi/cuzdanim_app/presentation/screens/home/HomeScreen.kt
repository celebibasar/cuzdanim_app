package com.basarcelebi.cuzdanim_app.presentation.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.basarcelebi.cuzdanim_app.presentation.navigation.NavigationItem
import com.basarcelebi.cuzdanim_app.presentation.viewmodel.home.HomeViewModel

@Composable
fun HomeScreen(navController: NavController, homeViewModel: HomeViewModel = viewModel()) {
    val text = homeViewModel.text.observeAsState("Welcome to Home Screen")

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate(NavigationItem.Profile.route) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Go to Profile Screen")
        }
    }
}
