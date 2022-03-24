package Chapter2;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80F,65F,  30.4F);
        weatherData.setMeasurements(82F, 70F,29.2F);
        weatherData.setMeasurements(78F, 90F, 29.2F);

        //System.out.println(weatherData.observers.size());

    }
}
