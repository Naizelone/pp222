package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "X5", 2020));
        carList.add(new Car("Mercedes", "e200", 2018));
        carList.add(new Car("Mercedes", "e63", 2021));
        carList.add(new Car("Toyota", "RAV4", 2015));
        carList.add(new Car("BMW", "X3", 2020));

    }
    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> showCars(int count){
        List<Car> carList1 = new ArrayList<>();
        for (int i = 0; i < count;i++){
            carList1.add(carList.get(i));
        }
        return carList1;
    }

}
