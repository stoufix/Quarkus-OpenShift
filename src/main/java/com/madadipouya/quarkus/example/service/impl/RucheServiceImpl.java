package com.madadipouya.quarkus.example.service.impl;

import com.madadipouya.quarkus.example.entity.Ruche;
import com.madadipouya.quarkus.example.repository.RucheRepository;
import com.madadipouya.quarkus.example.service.RucheService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RucheServiceImpl implements RucheService {

    private final RucheRepository rucheRepository ;

    @Inject
    public RucheServiceImpl(RucheRepository rucheRepository) {
        this.rucheRepository = rucheRepository;
    }

    @Override
    public List<Ruche> getAllRuches() {
        return this.rucheRepository.listAll();
    }

}
