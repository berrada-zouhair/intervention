package com.intervention.controller;

import com.intervention.model.Intervention;
import com.intervention.service.InterventionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interventions")
public class InterventionController {

    private InterventionService interventionService;

    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }

    @GetMapping
    public Iterable<Intervention> getAll() {
        return this.interventionService.getAllInterventions();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Intervention intervention) {
        this.interventionService.add(intervention);
    }

    @DeleteMapping("{interventionId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void create(@PathVariable Long interventionId) {
        this.interventionService.remove(interventionId);
    }
}
