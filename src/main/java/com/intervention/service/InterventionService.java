package com.intervention.service;

import com.intervention.model.Intervention;
import com.intervention.repository.InterventionRepository;
import org.springframework.stereotype.Service;

@Service
public class InterventionService {

    private InterventionRepository interventionRepository;

    public InterventionService(InterventionRepository interventionRepository) {
        this.interventionRepository = interventionRepository;
    }

    public Iterable<Intervention> getAllInterventions() {
        return this.interventionRepository.findAll();
    }

    public void add(Intervention intervention) {
        this.interventionRepository.save(intervention);
    }
}
