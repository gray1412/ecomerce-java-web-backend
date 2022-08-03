package com.taka.ecommerce.repository;


import com.taka.ecommerce.model.AuthenticationToken;
import com.taka.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {
    AuthenticationToken findTokenByUser(User user);
    AuthenticationToken findTokenByToken(String token);
}