package com.tcj.red_book.repository;

import com.tcj.red_book.entity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User queryByUsername(String userName);
}
