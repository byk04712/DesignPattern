package com.pattern.observer.weather;

/**
 * 此布告板根据 WeatherData 对象显示当前观测值
 */
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherSubject) {
        // 实例化具体的天气Subject
        this.weatherData = weatherSubject;
        // 注册观察者
        this.weatherData.registerObserver(this);
    }

    /**
     * 显示当前观测值
     */
    public void display() {
        System.out.println("==== Current conditions：" + temperature + " F degrees and " + humidity + "% humidity  ====");
    }

    /**
     * 当有新的变化时，记录数据并更新显示数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
