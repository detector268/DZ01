package com.webartist.repos;

import com.webartist.domain.Accounts;
import org.springframework.data.repository.CrudRepository;

public interface DiscountsRepo extends CrudRepository<Accounts, Integer> {

}