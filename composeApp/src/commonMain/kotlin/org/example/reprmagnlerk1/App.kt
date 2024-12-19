package org.example.reprmagnlerk1

import androidx.compose.runtime.*


@Composable
fun App() {
    takeComposable {

    }
}

fun takeComposable(content: @Composable () -> Unit) {
    println(content)
}