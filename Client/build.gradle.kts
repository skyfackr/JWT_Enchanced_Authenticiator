plugins {
    id("java")
}

group = "wang.skycloud.JWTEA.Client"
version = "1.0-SNAPSHOT"

repositories {
    maven { url=uri("https://maven.aliyun.com/nexus/content/groups/public")};
    mavenCentral()
}

dependencies {
    implementation("com.auth0:java-jwt:4.3.0")
    testImplementation("org.projectlombok:lombok:1.18.26")
    testImplementation("com.auth0:java-jwt:4.3.0")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
    implementation("org.projectlombok:lombok:1.18.26")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.26")


    implementation("org.apache.logging.log4j:log4j:2.20.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}