package com.example.biblioteca.service;

import com.example.biblioteca.model.Libro;
import com.example.biblioteca.repository.LibroRepository;


import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


// le tengo que indicar a spring que tome esto como tal
// el service es el que tiene la logica de negocio
// haremos una inyeccion de independencias
@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> obtenerLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro buscarLibroPorId(int id){
        return libroRepository.buscarLibroPorId(id);
    }

    public Libro buscarLibroPorIsbn(String isbn){
        return libroRepository.buscarLibroPorIsbn(isbn);
    }

    public Libro buscarLibroPorAutor(String autor){
        return libroRepository.buscarLibroPorAutor(autor);
    }

    public Libro actualizar(Libro lib){
        return libroRepository.actualizar(lib);
    }

    public void eliminar(int id){
        libroRepository.eliminar(id);
        System.out.println("El libro se está eliminando.");
    }
}
