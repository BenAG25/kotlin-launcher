package de.benag25.kotlinlauncher

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotlin Launcher",
    ) {
        App()
    }
}