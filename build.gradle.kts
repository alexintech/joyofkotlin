ext["kotlintestVersion"] = "3.3.3"
ext["slf4jVersion"] = "1.7.26"

plugins {
    base
    kotlin("jvm") version "1.3.41"
}

allprojects {

    group = "com.joyofkotlin"
    version = "1.0-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        
        maxHeapSize = "1G"
    }
}
