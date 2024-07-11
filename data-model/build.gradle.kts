plugins {
    id("my-java-library") // applies id("java")
}

dependencies {
    implementation(platform("com.example:platform"))
}