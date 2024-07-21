import com.example.gradle.Slf4jSimpleRule
import gradle.kotlin.dsl.accessors._7f98a97a4d2946203731d69c78178e41.check
import gradle.kotlin.dsl.accessors._7f98a97a4d2946203731d69c78178e41.test

plugins {
    id("java")
    id("com.diffplug.spotless")
}

dependencies.components {
    withModule<Slf4jSimpleRule>("org.slf4j:slf4j-simple")
}

sourceSets.create("integrationTest")


tasks.register<Test>("integrationTest") {
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath

    useJUnitPlatform()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform {
        excludeTags("slow")
    }

    maxParallelForks = 4

    maxHeapSize = "1g"
}

tasks.register<Test>("testSlow") {
    testClassesDirs = sourceSets.test.get().output.classesDirs
    classpath = sourceSets.test.get().runtimeClasspath

    useJUnitPlatform {
        includeTags("slow")
    }
}

tasks.check {
    dependsOn(tasks.named("testSlow"))
}