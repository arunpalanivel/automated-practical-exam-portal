# Automated Practical Exam Portal (APEP) – v1

APEP is a backend system designed to digitize and manage coding practical exams in academic institutions.  
APEP v1 focuses on correctness, clarity, and clean backend architecture rather than advanced or production-level features.

---

## 📌 Problem Statement

Traditional practical exams involve manual question distribution, paper-based submissions, and disconnected evaluation workflows.  
APEP aims to automate and standardize this process while preserving **manual faculty evaluation**, which reflects real university exams.

---

## 🎯 Scope (APEP v1 – Frozen)

APEP v1 is a **backend-only** implementation that supports the complete exam lifecycle.

### Included
- Student management (unique roll numbers)
- Faculty management
- Exam creation (subject, date, duration)
- Question bank per exam
- Deterministic question assignment  
  (adjacent roll numbers do not get the same question)
- Single exam submission per student
- Manual evaluation by faculty
- Result storage and retrieval

### Explicitly Excluded
- Authentication / JWT
- Frontend UI
- Online compiler / code execution
- Auto-grading or plagiarism detection

These are planned for future versions.

---

## 🧱 System Architecture

- **Layered architecture**
    - Controller → Service → Repository
- **DTO-based API contracts**
- **Constructor injection**
- **Business logic isolated in services**
- **Persistence using JPA/Hibernate**
- **MySQL as relational database**

---

## 🔄 Exam Workflow

1. Faculty creates an exam
2. Faculty adds questions
3. System assigns questions deterministically to students
4. Student submits exam (only once)
5. Faculty evaluates submission manually
6. Student views result

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- REST APIs
- Bean Validation (Jakarta Validation)

---

## 🧠 Key Design Decisions

- **ExamAttempt and Result are separate entities**  
  Submission and evaluation are modeled independently.
- **No automatic code evaluation**  
  Manual evaluation matches real academic practices.
- **No entity relationships in v1**  
  Logical associations are handled at the service layer for clarity and flexibility.

---

## 🚀 Future Enhancements (v2+)

- Login & role-based access (Student / Faculty / Admin)
- Exam timing enforcement
- Faculty dashboards
- Basic code execution support
- Analytics and reporting

---

## 👤 Author

Arun  
Final-year Computer Science student  
