plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":data-model"))

    implementation(platform("com.example:platform"))
    implementation(libs.commons.lang3)
    implementation(libs.slf4j.api)

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    integrationTestImplementation("")
}