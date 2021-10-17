package br.com.til.msuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.til.msuser.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
