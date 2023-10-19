package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.User;

import java.util.Optional;

@Repository
public interface Userrepo extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userID);

}
