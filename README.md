
                              ToDoMVC UI automation using Selenium and Java
                              
This repository contains web application automation for **TodoMVC** web application using Selenium, Cucumber BDD framework with Java as programming language. Framework is structured by following the page object design patterns and Behaviour driven development(BDD) is implemented as a part of it. Gherkins language is used to write the test cases in BDD format and cucumber is used to integrate it with Java. Framework is designed in such a way that it is easier for maintenance. 

**Instructions to run the automation tests**
1. Ensure below steps are executed on **Mac** machine.
2. Ensure **chrome** web application is installed.
3. Install Eclipse IDE from https://www.eclipse.org/downloads/
4. Clone this automation suite using `git clone https://github.com/tuljadevi/ToDoMVC.git`
5. Download **google chrome driver** from https://chromedriver.chromium.org/downloads based on your currently installed chrome application and place it in **src/test/resource/driver** folder 

Download chrome driver based on chrome application installed
<img width="1525" alt="Screenshot 2022-07-22 at 10 38 51 AM" src="https://user-images.githubusercontent.com/21265237/180350839-eda973ee-7447-4ee1-9e13-22feb11aca4b.png">

Unzip the file and copy chrome driver executable file to **src/test/resource/driver** folder in the project repo
<img width="576" alt="Screenshot 2022-07-22 at 10 41 13 AM" src="https://user-images.githubusercontent.com/21265237/180351114-5c90944a-e1eb-4549-960d-1472fb883773.png">

6. Run the script through feature file or jUnit
- Navigate to **TestRunner.java** file present in **src/test/java/StepDefinitions**
- Right click on the file and select **Run As** > **1 JUnit Test**
  
<img width="1430" alt="Screenshot 2022-07-22 at 10 43 56 AM" src="https://user-images.githubusercontent.com/21265237/180351451-b78f31e2-43e9-4bd2-8dd9-4eccb0adb52e.png">

7. Once automation tests are executed, HTML report will be generated and can be viewed **target/HtmlReports/cucumber.html**
<img width="583" alt="Screenshot 2022-07-22 at 10 49 08 AM" src="https://user-images.githubusercontent.com/21265237/180352051-e7774ffd-a61e-4d58-90cd-325d613dbdb9.png">
