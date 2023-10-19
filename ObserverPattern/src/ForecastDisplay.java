public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Observable weatherData;
    public ForecastDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObservers(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.temperature = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast is: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
