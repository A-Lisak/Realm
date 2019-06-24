package com.br.br.repositories;


import com.br.br.entity.Realm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealmRepository extends CrudRepository<Realm, Long> {}
