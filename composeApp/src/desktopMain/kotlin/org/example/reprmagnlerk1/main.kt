package org.example.reprmagnlerk1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProjectManglerCheckerK1",
    ) {
        App()
    }
}