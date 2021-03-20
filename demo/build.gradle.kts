import com.github.funczz.gradle.plugin.example.example

/**
 * plugins
 */
plugins {
    id("com.github.funczz.gradle.plugin.example-gradle-plugin")
}

example {
    value = "Hello Gradle."
}
