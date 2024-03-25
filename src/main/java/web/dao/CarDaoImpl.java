package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    public CarDaoImpl() {
        this.carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 212, 2000000));
        carList.add(new Car("INFINITY", "QX50", 2234, 2300000));
        carList.add(new Car("CHERRY", "TIGUAN", 3563, 1700000));
        carList.add(new Car("KIA", "SORENTA", 876, 2100000));
        carList.add(new Car("HONDA", "HONGQI", 543, 2600000));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carList.stream().limit(count).toList();
    }
}
