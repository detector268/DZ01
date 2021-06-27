package com.webartist.repos;

import com.webartist.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface DiscountsRepo extends CrudRepository<User, Integer> {

}