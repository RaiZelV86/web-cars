package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    public final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2015),
            new Car("Honda", "Civic", 2018),
            new Car("BMW", "X5", 2020),
            new Car("Audi", "A4", 2019),
            new Car("Ford", "Focus", 2017)
    );

    public List<Car> getCars(int count) {
        if (count <= 0) {
            return List.of();
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }

    public List<Car> getALlCars() {
        return cars;
    }
}
