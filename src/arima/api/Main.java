package arima.api;

import arima.api.analytics.Arima;
import arima.api.models.ForecastResultModel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double data[] = {0.79968,0.27899,-0.35347,-0.84433,-0.99692,-0.75011,-0.20279,0.42578,0.88377,
                0.98769,0.69591,0.12533,-0.49546,-0.91775,-0.97237,-0.63742,-0.047106,0.56208,0.94609,
                0.95106,0.57501,-0.031411,-0.62524,-0.96858,-0.92388,-0.50904,0.10973,0.68455,0.98511,
                0.89101,0.43994,-0.18738,-0.73963,-0.99556,-0.85264,-0.36812,0.26387,0.79016,0.99988,0.80902};
        int forecast_length = 10;
        ForecastResultModel forecastResult = Arima.forecast_arima(
                data, forecast_length);
        for (int i=0; i<forecast_length; i++){
            System.out.println(forecastResult.getForecast()[i]);
        }

    }
}
