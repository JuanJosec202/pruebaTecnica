package com.example.usersApp.service;

import com.example.usersApp.service.dto.UsersDTO;

import java.util.List;

public interface IUsersService {

    public UsersDTO create(UsersDTO usersDTO);

    public List<UsersDTO> getAllUsers();

    public UsersDTO updateUsers(UsersDTO usersDTO);

}
