plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))
    // group, name, version
    implementation("org.apache.commons:commons-lang3:3.12.0")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:1.7.36")
}