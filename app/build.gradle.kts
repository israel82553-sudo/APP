plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.israel.screenshot"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.israel.screenshot"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
