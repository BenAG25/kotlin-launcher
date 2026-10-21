package de.benag25.kotlinlauncher

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform