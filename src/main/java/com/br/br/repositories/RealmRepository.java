package com.br.br.repositories;

import com.lisak.swagger.model.Realm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealmRepository extends CrudRepository<Realm, Long> {}
