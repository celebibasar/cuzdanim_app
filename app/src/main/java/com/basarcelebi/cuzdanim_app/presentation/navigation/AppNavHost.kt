package com.basarcelebi.cuzdanim_app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.basarcelebi.cuzdanim_app.presentation.screens.home.HomeScreen
import com.basarcelebi.cuzdanim_app.presentation.screens.login.LoginScreen
import com.basarcelebi.cuzdanim_app.presentation.screens.profile.ProfileScreen
import com.basarcelebi.cuzdanim_app.presentation.screens.register.RegisterScreen
import com.basarcelebi.cuzdanim_app.presentation.screens.settings.SettingsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Home.route) {
            HomeScreen(navController)
        }
        composable(NavigationItem.Login.route) {
            LoginScreen()
        }
        composable(NavigationItem.Register.route) {
            RegisterScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
        composable(NavigationItem.Settings.route) {
            SettingsScreen()
        }
    }
}