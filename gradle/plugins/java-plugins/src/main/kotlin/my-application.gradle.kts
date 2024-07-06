import com.example.gradle.JarCount
import gradle.kotlin.dsl.accessors._e8b683809be5525aec317ee21c75fdd6.build

plugins {
    id("application")
    id("my-java-base")
}

tasks.register<JarCount>("countJars") {
    allJars.from(tasks.jar) // app.jar
    allJars.from(configurations.runtimeClasspath) // 각 모듈의 jar

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
}

tasks.register<Jar>("bundle") {
    group = "My Group"
    description = "packages it all!"

    //from("build/libs/app.jar")
    from(tasks.named("jar"))//
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("jarDistribution"))
}

tasks.build {
    dependsOn(tasks.named("bundle"))
}

tasks.register("buildAll") {
    description = "Builds even more!"

    dependsOn(tasks.build)
    dependsOn(tasks.named("countJar"))
}