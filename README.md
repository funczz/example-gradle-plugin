example-gradle-plugin
=====================

Using Gradle
------------
In your build.gradle.kts.

```kotlin
buildscript {
    repositories {
        maven {
            setUrl("https://funczz.github.io/example-gradle-plugin")
        }
    }
    dependencies {
        classpath("com.github.funczz:example-gradle-plugin:<VERSION>")
    }
}
apply(plugin = "example-gradle-plugin")
```

How to use
----------
see "./demo" project.

Demo
----
```shell script
cd demo
./gradlew example
#=> Hello Gradle.
```