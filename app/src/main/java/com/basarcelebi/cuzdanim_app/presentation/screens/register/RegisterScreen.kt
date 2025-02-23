package com.basarcelebi.cuzdanim_app.presentation.screens.register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.basarcelebi.cuzdanim_app.presentation.viewmodel.register.RegisterViewModel

@Composable
fun RegisterScreen(registerViewModel: RegisterViewModel = viewModel()) {
    val text = registerViewModel.text.observeAsState("Welcome to Register Screen")

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text.value)
    }
}