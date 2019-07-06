plugins {
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib"))
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.3.40")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.5.0")
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.ext["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.ext["slf4jVersion"]}")
}
