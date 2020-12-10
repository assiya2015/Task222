package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarApplication {
    List<Car> cars = null;
    public List<Car> getList(Integer count){
        if (cars == null) {
            cars = new ArrayList<>();
        }
        cars.add(new Car("red", "Lexus", 2005));
        cars.add(new Car("white", "BMW", 2018));
        cars.add(new Car("black", "Mercedes", 2019));
        cars.add(new Car("grey", "Subaru", 2015));
        cars.add(new Car("yellow", "Lamborghini", 2020));
        if (count == null || count>= 5) {
            return cars;
        } else {
            cars = cars.subList(0, count);
        }

        return cars;
    }

}
