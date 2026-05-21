package br.com.jose.cadastro_usuario.busines.service;

import br.com.jose.cadastro_usuario.infrastructure.entitys.User;
import br.com.jose.cadastro_usuario.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService() {

    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.saveAndFlush(user); // Salva e fecha a conexão com o banco de dados
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado!")
        );
    }

    public void deleteUserByEmail(String email) {
        userRepository.deleteByEmail(email);
    }

    public void updateUserById(Long id, User user) {
        User userEntity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado!")
        );
        User userUpdated = User.builder()
                .email(user.getEmail() != null ?
                        user.getEmail() : userEntity.getEmail())
                .name(user.getName() != null ?
                        user.getName() : userEntity.getName())
                .id(userEntity.getId())
                .build();
        userRepository.saveAndFlush(userUpdated);
    }

}
