package com.github.funczz.gradle.plugin.example

/**
 * ExampleGradlePluginExtension
 */
open class ExampleGradlePluginExtension {
    var value: String = ""
}

/**
 * build.gradle.kts:
 *
 * example { value = "hello world." }
 *
 */
fun org.gradle.api.Project.example(configure: ExampleGradlePluginExtension.() -> Unit) {
    this.convention.configure(ExampleGradlePluginExtension::class.java, configure)
}