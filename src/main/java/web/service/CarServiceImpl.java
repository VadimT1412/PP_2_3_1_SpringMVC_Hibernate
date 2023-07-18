package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carsList = new ArrayList<>();

    public CarServiceImpl() {
        carsList.add(new Car(1, "X4", 2019));
        carsList.add(new Car(2, "X5", 2020));
        carsList.add(new Car(3, "X6", 2021));
        carsList.add(new Car(4, "X7", 2022));
        carsList.add(new Car(5, "X8", 2023));
    }

    @Override
    public List<Car> getCount(int count) {
        if (count >= 5) {
            return carsList;
        }
        return carsList.subList(0, count);
    }
}
