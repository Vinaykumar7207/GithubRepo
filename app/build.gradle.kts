plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt") // Plugin for KAPT
    id("com.google.devtools.ksp") // Ensure KSP plugin is applied
    id("dagger.hilt.android.plugin") // Hilt plugin
}

android {
    namespace = "com.example.githubrepoexplorer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.githubrepoexplorer"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // AndroidX and Compose Libraries
    implementation(libs.androidx.core.ktx)

    // Jetpack Compose dependencies
    implementation("androidx.compose.material3:material3:1.3.0") // Ensure this version is correct
    implementation("androidx.compose.material3:material3-window-size-class:1.3.0") // For responsive layouts (optional
    implementation("androidx.compose.ui:ui:1.7.4")
    implementation("androidx.compose.material:material:1.7.4")
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.4")
    implementation("androidx.navigation:navigation-compose:2.8.3")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Retrofit for API calls
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Room for offline data storage
    implementation("androidx.room:room-runtime:2.6.1")
    implementation(libs.androidx.junit.ktx)
    androidTestImplementation(libs.junit)
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1") // Add Room KTX

    // Dagger Hilt for Dependency Injection
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-compiler:2.51") // Ensure this matches the implementation version

    // Remove possible duplicate or conflicting Hilt dependencies
    // implementation(libs.hilt.android)

    // Navigation
    implementation(libs.navigation)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation ("com.google.dagger:hilt-android:2.51")
    kapt ("com.google.dagger:hilt-compiler:2.51")

    // Paging for pagination
    implementation(libs.paging.runtime)

    // Coil for image loading
    implementation(libs.coil)

    // Testing dependencies if needed
    testImplementation ("junit:junit:4.13.2")

}
