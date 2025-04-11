package com.example.weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;

public class WeatherApp {

    private static final String API_KEY = "f847e2c370654ddf1ee9930d80c3b6cd"; // Replace with your API key
  //  private static final String CITY = "Pune"; // Replace with the desired city

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the city name: ");
        String 	CITY=sc.next();
        try {
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + CITY + "&appid=" + API_KEY + "&units=metric"; // Use metric units

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject jsonResponse = new JSONObject(response.toString());
                displayWeatherData(jsonResponse);

            } else {
                System.out.println("Error: HTTP request failed with response code: " + responseCode);
            }

            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayWeatherData(JSONObject json) {
        try {
            System.out.println("Weather in " + json.getString("name") + ":");

            JSONObject main = json.getJSONObject("main");
            double temperature = main.getDouble("temp");
            double feelsLike = main.getDouble("feels_like");
            double humidity = main.getDouble("humidity");

            JSONArray weatherArray = json.getJSONArray("weather");
            JSONObject weather = weatherArray.getJSONObject(0);
            String description = weather.getString("description");

            System.out.println("Temperature: " + temperature + " °C");
            System.out.println("Feels Like: " + feelsLike + " °C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Description: " + description);

        } catch (Exception e) {
            System.out.println("Error parsing JSON response: " + e.getMessage());
        }
    }
}
