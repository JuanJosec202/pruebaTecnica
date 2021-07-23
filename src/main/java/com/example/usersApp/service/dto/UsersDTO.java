package com.example.usersApp.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class UsersDTO implements Serializable {

    @Id
    private long id;

    @NotNull
    @Length(max = 60)
    private String nombre;

    @NotNull
    @Length(max = 100)
    private String correo;

    @NotNull
    @Length(max = 20)
    private String telefono;

    @NotNull
    @Length(max = 50)
    private String password;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCreacion;

    @NotNull
    private boolean estado;

}
