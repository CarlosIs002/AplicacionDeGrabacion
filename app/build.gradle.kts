<<<<<<< HEAD
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
=======

// Define el alias para el plugin KSP
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
>>>>>>> d7f23ad0bc9aa7968c4d4aafc62959c295d16f9e
    alias(libs.plugins.kotlin.ksp)
}

android {
<<<<<<< HEAD
    namespace = "mx.edu.utez.gps"
    compileSdk = 36

    defaultConfig {
        applicationId = "mx.edu.utez.gps"
        minSdk = 26
        targetSdk = 36
=======
    namespace = "com.example.camara" // Asegúrate que sea tu namespace
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.camara" // Asegúrate que sea tu namespace
        minSdk = 26
        targetSdk = 34
>>>>>>> d7f23ad0bc9aa7968c4d4aafc62959c295d16f9e
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
<<<<<<< HEAD
=======
        vectorDrawables {
            useSupportLibrary = true
        }
>>>>>>> d7f23ad0bc9aa7968c4d4aafc62959c295d16f9e
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

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
<<<<<<< HEAD
}

dependencies {

    // ---- UI BASE ----
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    // ---- NAVEGACIÓN ----
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // ---- VIEWMODEL ----
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.1")

    // ---- BASE DE DATOS / ROOM ----
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    // ---- GPS / FUSED LOCATION ----
    implementation("com.google.android.gms:play-services-location:21.2.0")

    // ---- MAPAS OSM ----
    implementation("org.osmdroid:osmdroid-android:6.1.20")
    implementation("tech.utsmankece:osm-android-compose:0.0.5")

    // ---- CAMARA / CAMERAX ----
    implementation("androidx.camera:camera-core:1.3.3")
    implementation("androidx.camera:camera-camera2:1.3.3")
    implementation("androidx.camera:camera-lifecycle:1.3.3")
    implementation("androidx.camera:camera-view:1.3.3")

    // ---- COIL IMÁGENES ----
    implementation("io.coil-kt:coil-compose:2.6.0")

    // ---- TESTING ----
=======

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10" // Ajusta si es necesario
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core y Lifecycle
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat) // Necesario para ExoPlayer UI
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.activity.compose)

    // Compose BOM y dependencias
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // Room (Base de datos)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

    // DataStore (Preferencias)
    implementation(libs.androidx.datastore.preferences)

    // ExoPlayer (Audio/Video)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.ui)

    // Coil (Imágenes)
    implementation(libs.coil.compose)

    // Accompanist (Carrusel)
    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.pager.indicators)

    // Test
>>>>>>> d7f23ad0bc9aa7968c4d4aafc62959c295d16f9e
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
<<<<<<< HEAD
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
=======
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
>>>>>>> d7f23ad0bc9aa7968c4d4aafc62959c295d16f9e
}
