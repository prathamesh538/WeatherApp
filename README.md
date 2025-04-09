# WeatherApp - Java REST API Client
*COMPANY*:CODTECH IT SOLUTIONS

*NAME*:PRATHAMESH SANJAY PATHARE

*INTERN ID*:CT08WPS

*DOMAIN*:JAVA PROGRAMMING

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH KUMAR

This Java application retrieves and displays weather data from the OpenWeatherMap API. It demonstrates how to consume a public REST API, parse JSON responses, and present the data in a user-friendly format.

## Features

* **Real-time Weather Data:** Fetches current weather information for a specified city.
* **Clear Output:** Displays temperature, "feels like" temperature, humidity, and weather description.
* **Error Handling:** Gracefully handles HTTP errors and JSON parsing issues.
* **Configurable City:** Easily change the target city by modifying a constant in the code.
* **Metric Units:** Displays temperature in Celsius.

## Prerequisites

* **Java Development Kit (JDK):** Version 8 or later.
* **OpenWeatherMap API Key:** You'll need a free API key from [openweathermap.org](https://openweathermap.org/).
* **JSON Library:** The `org.json` library is used for JSON parsing.

## Installation and Usage

1.  **Clone the Repository (Optional):** If you're using Git, clone this repository to your local machine.
2.  **Obtain an API Key:** Sign up for a free API key at [openweathermap.org](https://openweathermap.org/).
3.  **Add the JSON Library:**
    * If using Maven, add the dependency to your `pom.xml`.
    * If using Gradle, add the dependency to your `build.gradle`.
    * Otherwise, download the `json.jar` and add it to your project's classpath.
4.  **Replace API Key:** In the `WeatherApp.java` file, replace `"YOUR_OPENWEATHERMAP_API_KEY"` with your actual API key.
5.  **Set City (Optional):** Change the `CITY` constant in `WeatherApp.java` to the desired city.
6.  **Compile and Run:** Compile and run the `WeatherApp.java` file using your IDE or command line.
7.  **View Output:** The weather information will be displayed in the console.

## Project Structure
