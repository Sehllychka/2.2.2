package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("model1", "num1", "veh1"));
        cars.add(new Car("model2", "num2", "veh2"));
        cars.add(new Car("model3", "num3", "veh3"));
        cars.add(new Car("model4", "num4", "veh4"));
        cars.add(new Car("model5", "num5", "veh5"));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

