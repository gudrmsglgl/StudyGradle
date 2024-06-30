plugins {
    id("application")
    id("my-java-base")
}

tasks.register<Jar>("bundle") {
    group = "My Group"
    description = "packages it all!"

    //from("build/libs/app.jar")
    from(tasks.named("jar"))//
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("jarDistribution"))
}
