
buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
    }
}


plugins {
    kotlin("jvm") version "1.4.10"
}


subprojects {

    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    group = "com.nonpool"
    version = "1.0"


    tasks {
        compileKotlin {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_1_8.toString()
            }
        }
        compileTestKotlin {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_1_8.toString()
            }

        }
    }

    repositories {
        maven(url = "https://maven.aliyun.com/repository/public")
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("reflect"))
        implementation(kotlin("stdlib-jdk8"))
    }

}