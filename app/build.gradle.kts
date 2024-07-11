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
    runtimeOnly(libs.slf4j.simple)
}