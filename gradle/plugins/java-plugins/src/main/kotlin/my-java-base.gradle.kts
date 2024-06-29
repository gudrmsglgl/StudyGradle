plugins {
    id("java")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.withType<JavaCompile>().configureEach {

}

tasks.named<JavaCompile>("compileJava") { // == tasks.compileJava { }

}

tasks.compileTestJava {

}

tasks.test {

}

tasks.javadoc {

}