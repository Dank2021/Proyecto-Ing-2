package com.example.prototipo.dao;

import com.example.prototipo.Auto;
import javafx.collections.ObservableList;

import java.sql.Connection;

public interface ParkingDao {
    public void agregarAutosBD(Auto nuevo_auto);
    public Auto modificarAutoBD(Auto antiguo_auto, Auto nuevo_auto);
    public void eliminarAutoBD(Auto nuevo_auto);
    //public ObservableList getDataCars();
}
