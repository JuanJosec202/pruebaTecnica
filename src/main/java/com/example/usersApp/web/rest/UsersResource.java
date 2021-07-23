package com.example.usersApp.web.rest;

import com.example.usersApp.service.IUsersService;
import com.example.usersApp.service.dto.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersResource {

    @Autowired
    IUsersService iUsersService;

    @PostMapping("/users")
    public ResponseEntity<UsersDTO> create(@RequestBody UsersDTO usersDTO){
        usersDTO.setFechaCreacion(LocalDate.now());
        usersDTO.setEstado(true);
        return new ResponseEntity<>(iUsersService.create(usersDTO), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UsersDTO>> getUsers() {
        return ResponseEntity.status(200).body(iUsersService.getAllUsers());
    }

    @PutMapping("/users")
    public ResponseEntity<UsersDTO> updateUsers(@RequestBody UsersDTO usersDTO) {
        return new ResponseEntity<>(iUsersService.updateUsers(usersDTO), HttpStatus.OK);
    }
}
