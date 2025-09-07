Student Management System (Spring + Hibernate)
📌 Overview

This project is a Student Management System built using Spring Framework and Hibernate ORM with XML-based configuration.
It demonstrates CRUD (Create, Read, Update, Delete) operations on a Student entity using Hibernate Criteria Builder API.

The project is designed for beginners and intermediate developers who want to learn:

How to integrate Spring and Hibernate.

How to configure Hibernate using hibernate.cfg.xml.

How to perform database operations using Criteria Builder.

How to structure a Spring-Hibernate application.

🚀 Features

Add a new student to the database.

Retrieve student details.

Update existing student records.

Delete student records.

Fetch students using Criteria Queries.

🛠️ Tech Stack

Java 17+

Spring Framework (Core, Context)

Hibernate ORM (with XML configuration)

Criteria API (Criteria Builder)

Maven (for build automation)

MySQL / PostgreSQL (can be configured in hibernate.cfg.xml)

⚙️ Project Setup
1️⃣ Clone Repository
git clone https://github.com/your-username/student-management-spring-hibernate.git
cd student-management-spring-hibernate

2️⃣ Configure Database

Create a database (example: student_db).

Update hibernate.cfg.xml with your DB credentials:

<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/student_db</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">yourpassword</property>

3️⃣ Build & Run
mvn clean install


Run the main application:

mvn exec:java -Dexec.mainClass="com.example.MainApp"

📂 Project Structure
src/main/java
 └── com.example
     ├── entity
     │   └── Student.java
     ├── dao
     │   └── StudentDao.java
     ├── service
     │   └── StudentService.java
     ├── config
     │   └── HibernateConfig.xml
     └── App.java

🔍 Sample CRUD Usage
Add Student
Student student = new Student("John", "Doe", "john.doe@example.com");
studentService.saveStudent(student);

Fetch Students using Criteria Builder
List<Student> students = studentService.getStudentsByCriteria("lastName", "Doe");

🧑‍💻 Author

👤 Sharwan Kumar

GitHub: https://github.com/kumar-sharwan729

