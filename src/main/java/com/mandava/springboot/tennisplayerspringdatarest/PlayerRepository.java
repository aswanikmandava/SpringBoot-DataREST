package com.mandava.springboot.tennisplayerspringdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
