# API Automation Framework

## Overview
This project is a scalable API Automation Framework built using:
- Java
- RestAssured
- TestNG
- Maven
- Log4j2
- Extent Reports

## Features
- CRUD testing using JSONPlaceholder & ReqRes
- Reusable Request & Response Specifications
- Config-driven Base URL
- Centralized Logging
- Extent Reporting

## Project Structure
src/test/java
  ├── tests
  ├── payload
  ├── utils
  ├── resources
  ├── listeners

src/test/resources
  ├── config.properties
  ├── log4j2.xml

## Test Report

Extent Report is generated after execution at:

/target/extent-report.html

Open the HTML file in any browser to view detailed test execution results,
including:
- Test status (Pass/Fail)
- Logs
- Execution time
- Error details
- Request & Response (if logged)

## How To Run
mvn clean test