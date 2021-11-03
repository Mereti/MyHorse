package repository;

import model.Gamer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface GamerRepository extends CrudRepository<Gamer,Long> {

    @Modifying
    @Query(value = "INSERT INTO gamer (email,password,nickname) VALUES (:email,:password,:nickname)", nativeQuery = true) void registerGamer(
        @Param("email") String email,
        @Param("password") String password,
        @Param("nickname") String nickname
    );
    @Query(value = "SELECT * FROM gamer WHERE email = :email", nativeQuery = true) Gamer getGamerByEmail(
      @Param("emial") String email
    );
    @Query(value = "SELECT * FROM gamer WHERE nickname = :nickname", nativeQuery = true) Gamer getGamerByNickname(
      @Param("nickname") String nickname
    );

}
