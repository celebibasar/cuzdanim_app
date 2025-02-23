package com.basarcelebi.cuzdanim_app.presentation.navigation

enum class Screen {
    HOME,
    LOGIN,
    REGISTER,
    PROFILE,
    SETTINGS
}
sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.HOME.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Register : NavigationItem(Screen.REGISTER.name)
    data object Profile : NavigationItem(Screen.PROFILE.name)
    data object Settings : NavigationItem(Screen.SETTINGS.name)

}
