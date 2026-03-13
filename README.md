# Flipkart Playwright Automation Framework

A **UI and API automation framework** built using **Playwright with Java**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.
This project demonstrates automation of key **Flipkart e-commerce workflows** such as product search, filtering, price validation, and add-to-cart functionality.

🚀 Technologies Used
* Java
* Playwright
* TestNG
* Maven
* Page Object Model (POM)
* Git & GitHub
* API Testing using Playwright

📂 Project Structure
flipkart-playwright-framework
│
├── pom.xml
├── testng.xml
│
├── screenshots
│
└── src
    └── test
        └── java
            │
            ├── base
            │     └── BaseTest.java
            │
            ├── pages
            │     ├── HomePage.java
            │     ├── SearchPage.java
            │     └── ProductPage.java
            │
            ├── tests
            │     └── FlipkartTest.java
            │
            ├── api
            │     └── FlipkartAPITest.java
            │
            └── utils
                  └── ScreenshotUtil.java

⚙️ Features Implemented
* Product search automation
* Brand filter application
* Product selection from results
* Dynamic product price extraction
* Add to cart automation
* Screenshot capture utility
* UI Automation using Playwright
* API Testing using Playwright
* Parallel test execution with TestNG

🧪 Test Scenario
1. Open Flipkart website
2. Search for a product (Samsung Mobile)
3. Apply Samsung brand filter
4. Select the first product from results
5. Capture product price
6. Add the product to cart
7. Take screenshot of the result

▶️ How to Run the Project
1️⃣ Clone the repository
git clone https://github.com/yourusername/flipkart-playwright-framework.git
2️⃣ Navigate to the project
cd flipkart-playwright-framework
3️⃣ Install Playwright browsers
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
4️⃣ Run automation tests
mvn test
📸 Screenshots
Screenshots captured during execution are stored in:
/screenshots
🔌 API Test Example
This framework also includes a simple **API automation test** using Playwright to validate API responses.
Example API:
https://fakestoreapi.com/products
The test prints:
* Status Code
* Response Body
🧠 Design Pattern Used
Page Object Model (POM)
Benefits:
* Better code reusability
* Easy maintenance
* Clean test structure
* Separation of test logic and page actions

