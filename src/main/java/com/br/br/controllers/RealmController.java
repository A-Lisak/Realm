package com.br.br.controllers;

import com.br.br.repositories.RealmRepository;
import com.lisak.swagger.api.ServiceApi;
import com.lisak.swagger.model.Realm;
import com.lisak.swagger.model.Request;
//import com.lisak.swagger.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@Validated

public class RealmController implements ServiceApi {

    private final RealmRepository customerRepository;

    @NotNull
    private  Realm realm;

    @Autowired
    public RealmController(RealmRepository customerRepository, Realm realm) {
        this.customerRepository = customerRepository;
        this.realm = realm;
    }

//    @PostMapping("/customers")
//    public Realm addCustomer(@RequestBody Realm customer) {
//        customerRepository.save(customer);
//        return customer;
//    }

//    @GetMapping("/customers")
//    public List<Realm> getCustomers() {
//        return (List<Realm>) customerRepository.findAll();
//    }

    @Override
    public ResponseEntity<Realm> retrieve(@PathVariable("id") final Long id) {
        Optional<Realm> realm1 = customerRepository.findById(id);
//        Realm response  = new Realm();
        if (realm1.isPresent()) {
             realm = realm1.get();
        }
//        Response response = new Response().realms(realm);

        return new ResponseEntity<>(realm, HttpStatus.OK);
    }

//    @Override
//    public ResponseEntity<Realm> create(final @Valid @RequestBody Request request) {
//     customerRepository.save(request);
//
////        Response response = new Response().realms(realms);
//        Realm response  = new Realm();
////        if (realm.isPresent()) {
////            response = realm.get();
////        }
////        Response response = new Response().realms(realm);
//
//
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
}

