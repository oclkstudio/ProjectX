package com.futurex.projectx.service;

import com.futurex.projectx.entity.Wagon;

import java.util.List;

public interface WagonService {
    public List<Wagon> findAll();

    public Wagon findById(int id);

    public void save(Wagon wagon);

    public void deleteById(int id);
}
