plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {

    namespace = "com.example.mycicd"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mycicd"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
//    val keystorePath = "C:/Users/84410/Desktop/dense.jks" // 确保路径正确
//    signingConfigs {
//        create("release") {
//            keyAlias = "dense"
//            keyPassword = "123654"
//            storeFile = file(keystorePath) // 使用 file() 处理路径
//            storePassword = "123654"
//        }
//    }


    buildTypes {
        debug {
            // 可选配置，例如禁用代码混淆以便调试
            isMinifyEnabled = false
        }
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

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}