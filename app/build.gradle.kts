plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.threadrunnable"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.threadrunnable"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // Dipakai pada variasi WorkManager (lihat folder variants/)
    implementation(libs.androidx.work.runtime)
    implementation(libs.androidx.work.runtime.ktx)
}
