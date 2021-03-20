import com.github.funczz.gradle.plugin.example.example

/**
 * plugins
 */
plugins {
    id("com.github.funczz.example-gradle-plugin")
}

example {
    value = "Hello Gradle."
}
