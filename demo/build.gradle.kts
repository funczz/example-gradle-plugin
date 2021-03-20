import com.github.funczz.gradle.plugin.example.example

/**
 * plugins
 */
plugins {
    id("example-gradle-plugin")
}

example {
    value = "Hello Gradle."
}
