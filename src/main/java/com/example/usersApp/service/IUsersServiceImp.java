package com.example.usersApp.service;

import com.example.usersApp.repository.UsersRepository;
import com.example.usersApp.service.dto.UsersDTO;
import com.example.usersApp.service.transformer.UsersTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IUsersServiceImp implements IUsersService{

    @Autowired
    UsersRepository usersRepository;


    @Override
    public UsersDTO create(UsersDTO usersDTO) {
        return UsersTransformer.getUsersDTOFromUsers(usersRepository.save(UsersTransformer.getUsersFromUsersDTO(usersDTO)));
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        return usersRepository.findAll().stream().map(UsersTransformer::getUsersDTOFromUsers)
                .collect(Collectors.toList());
    }

    @Override
    public UsersDTO updateUsers(UsersDTO usersDTO) {
        return UsersTransformer.getUsersDTOFromUsers(usersRepository.save(UsersTransformer.getUsersFromUsersDTO(usersDTO)));
    }

}
