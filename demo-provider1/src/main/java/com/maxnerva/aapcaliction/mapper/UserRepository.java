package com.maxnerva.aapcaliction.mapper;

import com.maxnerva.aapcaliction.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}