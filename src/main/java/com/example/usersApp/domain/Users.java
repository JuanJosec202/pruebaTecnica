package com.example.usersApp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;



import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
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
