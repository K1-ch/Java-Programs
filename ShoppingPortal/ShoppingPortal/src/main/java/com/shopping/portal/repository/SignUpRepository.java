package com.shopping.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.portal.entity.User;

@Repository
public interface SignUpRepository extends JpaRepository<User, String> {

}
