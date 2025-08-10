# 🚀 Test Automation Framework – Java + TestNG  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)  
![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=for-the-badge&logo=testing-library&logoColor=white)  
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)  
![LambdaTest](https://img.shields.io/badge/LambdaTest-2B2D42?style=for-the-badge&logo=lambdatest&logoColor=00FFFF)  
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)  

---

## 📌 Overview  
A **robust, maintainable, and scalable** automation testing framework built with **Java** and **TestNG**.  
Supports **LambdaTest integration** for cloud-based cross-browser testing and **parallel execution** for faster test cycles.  

This framework is based on **Page Object Model (POM)** with a structured package design for improved readability, maintainability, and scalability.  

---

## ✨ Features  
- **Java + TestNG** based architecture  
- **Cloud execution** on LambdaTest  
- **Parallel execution** for faster test cycles  
- **Page Object Model (POM)** design pattern  
- **Data-driven testing** support via data providers  
- **Listeners** for reporting and logging  
- **Utility classes** for reusable functions  
- Centralized configuration using `config` folder  
- Detailed HTML and console reports  
- Screenshot capture on failures  

---

## 📂 Project Structure  
```plaintext
automation-assignment
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   ├── test
│       ├── java
│       │   ├── com.constants          # Constant values used across framework
│       │   ├── com.ui.dataproviders   # Data providers for parameterized tests
│       │   ├── com.ui.listeners       # TestNG listeners for logging/reporting
│       │   ├── com.ui.pages           # Page Object Model classes
│       │   ├── com.ui.pojo            # POJO classes for data models
│       │   ├── com.ui.tests           # Test classes
│       │   │   ├── LoginTest.java     # Sample test for login functionality
│       │   │   └── TestBase.java      # Base test setup/teardown
│       │   └── com.utility            # Utility/helper functions
│       └── resources                  # Test-specific resources
├── config                             # Framework configuration files
├── logs                               # Execution logs
├── testData
