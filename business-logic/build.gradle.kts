plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))

    implementation(platform("com.example:platform"))
    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
}