plugins {
	java
	war
	id("org.springframework.boot") version "3.3.6"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "hello"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation ("org.apache.tomcat.embed:tomcat-embed-jasper")
	implementation ("jakarta.servlet:jakarta.servlet-api") //스프링부트 3.0 이상
	implementation ("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api") //스프링부트
	implementation ("org.glassfish.web:jakarta.servlet.jsp.jstl") //스프링부트 3.0 이상
}

tasks.withType<Test> {
	useJUnitPlatform()
}
