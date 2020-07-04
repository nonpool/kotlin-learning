
plugins {
    kotlin("jvm") version "1.3.72"
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
                jvmTarget = JavaVersion.VERSION_11.toString()
            }
        }
        compileTestKotlin {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_11.toString()
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