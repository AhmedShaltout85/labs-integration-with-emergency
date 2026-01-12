# Labs Integration With Emergency

A Spring Boot application built to integrate laboratory systems with emergency services.  
The project is packaged as a **WAR** file and uses **Spring Data JPA** with **Microsoft SQL Server**.

---

## 🛠 Tech Stack

- **Java:** 17
- **Spring Boot:** 3.5.5
- **Build Tool:** Maven
- **Packaging:** WAR
- **Database:** Microsoft SQL Server
- **ORM:** Spring Data JPA (Hibernate)
- **Application Server:** Apache Tomcat
- **Utilities:** Lombok

---

## 📦 Dependencies Overview

- `spring-boot-starter-web` – RESTful web services
- `spring-boot-starter-data-jpa` – Database access with JPA
- `mssql-jdbc` – SQL Server JDBC driver
- `spring-boot-starter-tomcat` – Provided scope for external Tomcat deployment
- `lombok` – Boilerplate code reduction
- `spring-boot-starter-test` – Unit and integration testing

---

## 📁 Project Packaging

This project is packaged as a **WAR** file:

```xml
<packaging>war</packaging>
It can be:

Deployed to an external Tomcat server

Or run locally using Spring Boot (embedded Tomcat for development)

⚙️ Prerequisites
Make sure you have the following installed:

JDK 17

Maven 3.9+

Microsoft SQL Server

(Optional) Apache Tomcat 10+ for external deployment

🚀 Running the Application
1️⃣ Configure Database
Update your application.properties or application.yml:

properties
نسخ الكود
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=YOUR_DB
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
2️⃣ Build the Project
bash
نسخ الكود
mvn clean package
This will generate a WAR file in:

text
نسخ الكود
target/labs-integration-with-emergency-0.0.1.war
3️⃣ Run Locally (Development)
bash
نسخ الكود
mvn spring-boot:run
Application will start at:

text
نسخ الكود
http://localhost:8080
4️⃣ Deploy to External Tomcat
Copy the generated WAR file to:

text
نسخ الكود
TOMCAT_HOME/webapps/
Start Tomcat

Access the application at:

text
نسخ الكود
http://localhost:8080/labs-integration-with-emergency
🧪 Running Tests
bash
نسخ الكود
mvn test
🧱 Lombok Support
Lombok is used and configured via the Maven Compiler Plugin.

📌 Make sure Lombok support is enabled in your IDE:

IntelliJ IDEA: Settings → Plugins → Lombok

Eclipse: Install Lombok plugin and run lombok.jar

📌 Notes
The Tomcat dependency is marked as provided, suitable for WAR deployment.

Java version is locked to 17 for compatibility with Spring Boot 3.x.

Suitable for enterprise integration and backend service deployment.

📄 License
This project is currently unlicensed.

👤 Author
Ahmed Shaltout
Backend / Spring Boot Developer

🤝 Contribution
Contributions, issues, and feature requests are welcome.

markdown
نسخ الكود

If you want, I can also:
- Customize it for **internal government / enterprise usage**
- Add **API documentation (Swagger/OpenAPI)** section
- Add **Docker** instructions
- Write it in **Arabic** or bilingual (EN/AR)

Just tell me 👍