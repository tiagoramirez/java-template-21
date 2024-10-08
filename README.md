# Java 21 Template

This is a template project for Java 21 projects.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Running Tests](#running-tests)
<!-- - [License](#license) -->

## Introduction

This project is a template for Java 21 projects that includes a Dockerfile, a docker-compose.yml file, and a Spring Boot application with basic controllers, services, and tests.

## Prerequisites

### Java
- Java Development Kit (JDK) version 21

### Infrastructure
- Docker

## Usage

Follow these steps to get the project up and running locally:

1. Clone the repository
2. Start the Docker container by running the following command:
```sh
docker compose up -d --build
```
3. Test the API endpoint using any REST client with the following request:
```sh
curl --location --request GET 'http://localhost:8080/api/v1/health'
```
4. You can also use the Swagger UI at `http://localhost:8080/api/v1/swagger-ui/index.html`

## Running Tests

To run the tests for this project, execute the following command:
```
.\gradlew test
```
To view the test coverage report, open the `index.html` file located inside the `build\reports\jacoco\test\html` folder (generated by the previous command).

<!-- ## License -->

<!-- Specify the license under which the project is distributed. -->
