package com.webartist.repos;

import com.webartist.domain.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepo extends JpaRepository<Usr, Long> {
    Usr findByUsername(String username);
}