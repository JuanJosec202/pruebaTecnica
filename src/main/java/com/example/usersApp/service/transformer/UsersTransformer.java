package com.example.usersApp.service.transformer;

import com.example.usersApp.domain.Users;
import com.example.usersApp.service.dto.UsersDTO;

public class UsersTransformer {

    public static UsersDTO getUsersDTOFromUsers(Users users){

        if(users == null){
            return null;
        }

        UsersDTO dto = new UsersDTO();

        dto.setId(users.getId());
        dto.setNombre(users.getNombre());
        dto.setCorreo(users.getCorreo());
        dto.setTelefono(users.getTelefono());
        dto.setPassword(users.getPassword());
        dto.setFechaCreacion(users.getFechaCreacion());
        dto.setEstado(users.isEstado());

        return dto;

    }

public static Users getUsersFromUsersDTO(UsersDTO dto){

        if(dto == null){
            return null;
        }

        Users users = new Users();

        users.setId(dto.getId());
        users.setNombre(dto.getNombre());
        users.setCorreo(dto.getCorreo());
        users.setTelefono(dto.getTelefono());
        users.setPassword(dto.getPassword());
        users.setFechaCreacion(dto.getFechaCreacion());
        users.setEstado(dto.isEstado());

        return users;
}

}
