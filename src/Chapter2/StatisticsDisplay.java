package Chapter2;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement{

    private ArrayList<Float> temperatures;
    private float currentTemperature;
    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperatures = new ArrayList<>();
        minTemperature = 9999999;
        maxTemperature = 0;
    }

    @Override
    public void display(){
        System.out.println("AVG/Max/Min temperature = " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float preassure){

        temperatures.add(temperature);
        currentTemperature = temperature;
        minTemperature = Math.min(currentTemperature, minTemperature);
        maxTemperature = Math.max(currentTemperature, maxTemperature);
        averageTemperature = calcAverageTemperature();
        display();
    }


    public float calcAverageTemperature(){

        float s = 0;
        for(Float nr : temperatures){

            s += nr;
        }
        return s/temperatures.size();
    }
}
