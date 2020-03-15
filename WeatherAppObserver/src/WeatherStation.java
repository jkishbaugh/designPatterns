public class WeatherStation {
    public static void main(String[] args){
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(data);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(data);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
        ForecastDisplay forecastDisplay = new ForecastDisplay(data);

        data.setMeasurements(80, 65, 30.4f);
        data.setMeasurements(70, 55, 29.5f);
        data.setMeasurements(78, 90, 30.7f);
    }
}
