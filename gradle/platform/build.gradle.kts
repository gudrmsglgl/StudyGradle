plugins {
    id("java-platform")
}

group = "com.example"

javaPlatform.allowDependencies()
dependencies {
    api(platform("org.junit:junit-bom:5.8.2"))
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")
}