package com.webartist.repos;

import com.webartist.domain.Orders;
import com.webartist.domain.User;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface OrdersRepo extends CrudRepository<Orders, Long> {

    List<Orders> findByAuthor(User user);

}