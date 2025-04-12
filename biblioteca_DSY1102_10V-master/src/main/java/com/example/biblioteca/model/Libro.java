package com.example.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

// se crea la clase y el constructor sin parametro
// el data es el tostring, lo repetitivo, para hacerlo automatico
// 
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
