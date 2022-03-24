package Chapter2;


//    public void measurementsChanged(){
//
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();
//
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay(temp, humidity, pressure);
//    }


//Sharpen your pencil :
//B: For every new display element, we need to alter the code
//C: We have no way to add (or remove) display elements at run time.
//E: ew haven't encapsulated the part that changes

import java.util.ArrayList;

public class WeatherData implements Subject{//implementam interfata Subject


    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){

        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o){//adaugam un observer

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){//dc un observer vrea sa se dezaboneze, il stergem din lista

        int i = observers.indexOf(o);
        if(i >= 0){

            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(){//trimitem noile stari catre toti subscriber-ii

        for(int i =0; i< observers.size(); i++){

            Observer obs = (Observer) observers.get(i);
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChnaged(){//notificam subscriber-ii cand s-au modif masuratorile de temp de la statia meteo

        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChnaged();
    }
    //dc se modifica masuratorile meteo, accesam measurementsChnaged, pentru a notifica subscriber-ii ca sunt info noi meteo




























}

