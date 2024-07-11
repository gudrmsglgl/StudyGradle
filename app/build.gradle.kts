plugins {
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))

    implementation(platform("com.example:platform"))
    runtimeOnly("org.slf4j:slf4j-simple")
}