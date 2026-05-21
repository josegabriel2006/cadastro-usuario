package br.com.jose.cadastro_usuario.infrastructure.repository;

import br.com.jose.cadastro_usuario.infrastructure.entitys.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    @Transactional // Se caso der qualquer erro, não irá deletar o email;
    void deleteByEmail(String email);
}
