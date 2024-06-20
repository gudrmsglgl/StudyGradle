plugins {
    id("java-library") // applies id("java")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}