plugins {
    id("java-library")
    id("maven-publish")
}

group = "ru.kazantsev.nsmp.sdk"
version = "1.6.6"

java {
    withSourcesJar()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/exeki/nsmp.sdk.upper_level_classes")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}


tasks {
    javadoc {
        options.encoding = "UTF-8"
    }
    compileJava {
        targetCompatibility = JavaVersion.VERSION_21.majorVersion
        sourceCompatibility = JavaVersion.VERSION_21.majorVersion
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.slf4j:slf4j-api:2.0.16")
    api("com.google.code.findbugs:jsr305:3.0.2")
    api("javax.activation:javax.activation-api:1.2.0")
    api("org.springframework:spring-web:6.1.5")
    api("org.apache.poi:poi-ooxml:5.2.5")
    api("org.apache.poi:poi:5.2.5")
    api("com.google.code.gson:gson:2.10.1")
    api("com.google.guava:guava:33.1.0-jre")
    api("org.gwtproject:gwt-user:2.10.0")
    api("jakarta.servlet:jakarta.servlet-api:6.0.0")
    api("org.apache.httpcomponents.client5:httpclient5:5.3")

    //Мне говорили что его когда нибудь выпилят из СД
    api("org.codehaus.groovy.modules.http-builder:http-builder:0.7.1")

    // Spring Framework 6.1.5
    api("org.springframework:spring-aop:6.1.5")
    api("org.springframework:spring-aspects:6.1.5")
    api("org.springframework:spring-beans:6.1.5")
    api("org.springframework:spring-context:6.1.5")
    api("org.springframework:spring-context-support:6.1.5")
    api("org.springframework:spring-core:6.1.5")
    api("org.springframework:spring-expression:6.1.5")
    api("org.springframework:spring-jcl:6.1.5")
    api("org.springframework:spring-jdbc:6.1.5")
    api("org.springframework:spring-jms:6.1.5")
    api("org.springframework:spring-messaging:6.1.5")
    api("org.springframework:spring-orm:6.1.5")
    api("org.springframework:spring-oxm:6.1.5")
    api("org.springframework:spring-web:6.1.5")
    api("org.springframework:spring-webmvc:6.1.5")
    api("org.springframework:spring-websocket:6.1.5")

    // Spring Kafka
    api("org.springframework.kafka:spring-kafka:3.1.3")

    // Spring LDAP
    api("org.springframework.ldap:spring-ldap-core:3.2.2")

    // Spring Plugins
    api("org.springframework.plugin:spring-plugin-core:3.0.0")
    api("org.springframework.plugin:spring-plugin-metadata:3.0.0")

    // Spring Retry
    api("org.springframework.retry:spring-retry:2.0.5")

    // Spring Security
    api("org.springframework.security:spring-security-config:6.2.3")
    api("org.springframework.security:spring-security-core:6.2.3")
    api("org.springframework.security:spring-security-crypto:6.2.3")
    //api("org.springframework.security:spring-security-kerberos-core:2.0.0")
    api("org.springframework.security:spring-security-ldap:6.2.3")
    api("org.springframework.security:spring-security-oauth2-client:6.2.3")
    api("org.springframework.security:spring-security-oauth2-jose:6.2.3")
    api("org.springframework.security:spring-security-oauth2-resource-server:6.2.3")
    api("org.springframework.security:spring-security-web:6.2.3")

    // Spring Session
    api("org.springframework.session:spring-session-core:3.2.2")

    // Spring TX (версия 5.3.33 - возможно, вам нужна 6.1.5)
    api("org.springframework:spring-tx:5.3.33")

    // Spring WS
    api("org.springframework.ws:spring-ws-core:4.0.10")
    api("org.springframework.ws:spring-ws-security:4.0.10")
    api("org.springframework.ws:spring-xml:4.0.10")

    // Springfox (Swagger для Spring)
    //api("io.springfox:springfox-core:2.9.3-spring6")
    //api("io.springfox:springfox-schema:2.9.3-spring6")
    //api("io.springfox:springfox-spi:2.9.3-spring6")
    //api("io.springfox:springfox-spring-web:2.9.3-spring6")
    //api("io.springfox:springfox-swagger-common:2.9.3-spring6")
    //api("io.springfox:springfox-swagger-ui:2.9.3-spring6")
    //api("io.springfox:springfox-swagger2:2.9.3-spring6")

    // Jackson Core
    api("com.fasterxml.jackson.core:jackson-core:2.17.0")
    api("com.fasterxml.jackson.core:jackson-annotations:2.17.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.17.0")

    // Jackson Datatype extensions
    api("org.openapitools:jackson-databind-nullable:0.2.6")

    // Jackson Dataformat
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-cbor:2.12.6")


    // Hibernate Core 6.x
    api("org.hibernate.orm:hibernate-core:6.4.4.Final")

    // JPA 3.1 API (в Hibernate 6 используется JPA 3.1)
    api("jakarta.persistence:jakarta.persistence-api:3.1.0")

    // Для кэширования (если нужно)
    api("org.hibernate.orm:hibernate-jcache:6.4.4.Final")
    api("org.ehcache:ehcache:3.10.8")

}

