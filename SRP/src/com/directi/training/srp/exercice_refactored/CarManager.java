package com.directi.training.srp.exercice_refactored;

public class CarManager {
    private CarDao _carDao;
    private CarFormatter _carFormatter;
    private CarRater _carRater;

    public CarManager(){
        _carDao = new CarDao();
        _carFormatter = new CarFormatter();
        _carRater = new CarRater();
    }

    public Car getCarFromDb(String carId){
        return _carDao.getFromDb(carId);
    }

    public String getCarsNames(){
        return _carFormatter.getCarsNames(_carDao.getAllCars());
    }

    public Car getBestCar(){
        return _carRater.getBestCar(_carDao.getAllCars());
    }
}
