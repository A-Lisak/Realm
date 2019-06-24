package com.br.br.controllers;

import com.br.br.repositories.RealmRepository;
import com.br.br.entity.Realm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@Validated

public class RealmController {

    private final RealmRepository customerRepository;


    @Autowired
    public RealmController(RealmRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    @PostMapping("/service/user/realm")
    public Realm create(@RequestBody Realm realm) {
        customerRepository.save(realm);
        return realm;
    }

    @RequestMapping(value = "/service/user/realm/{id}", method = RequestMethod.GET)
    public Realm getRealm(@PathVariable final Long id) {
        Optional<Realm> response = customerRepository.findById(id);
        return response.get();
    }
}

