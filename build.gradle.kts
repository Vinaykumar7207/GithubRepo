// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.6.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false // Use the correct plugin ID

    id("com.android.library") version "8.1.4" apply false
    id("com.google.devtools.ksp") version "1.9.21-1.0.15" apply false



}

// No repository declarations are needed here; all are in settings.gradle.kts
