package racingcar.domain;

import racingcar.model.Car;
import racingcar.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

import static racingcar.utils.RandomUtils.generateRandomNumber;

public class CarRacingGame {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;

    private final CarRepository carRepository;

    public CarRacingGame(){
        carRepository = new CarRepository();
    }

    public void eachCarRacing() {
        List<Car> cars = carRepository.findAll();
        for (Car car : cars) {
            int randomNumber = generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            moveCar(car, randomNumber);
        }
    }

    // TODO: moveCar() 구현
}