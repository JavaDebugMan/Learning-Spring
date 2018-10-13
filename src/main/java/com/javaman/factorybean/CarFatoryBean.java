package com.javaman.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author pengzhe
 * @date 2018/6/24 10:18
 * @description
 */

public class CarFatoryBean implements FactoryBean<Car> {

    private String carInfo;


    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        return car;

    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }
}
