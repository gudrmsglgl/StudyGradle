plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))
    // group, name, version
    implementation("org.apache.commons:commons-lang3:3.12.0")
}