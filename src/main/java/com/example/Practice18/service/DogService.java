package com.example.Practice18.service;

import com.example.Practice18.models.Dog;
import com.example.Practice18.models.User;
import com.example.Practice18.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public User getUserByDog(Long dogId) {
        return dogRepository.findOneById(dogId).getUser();
    }

    public Dog findById(Long id) {
        return dogRepository.findOneById(id);
    }

    public List<Dog> findByName(String name) {
        return dogRepository.findAllByName(name);
    }

    public List<Dog> findByBreed(String breed) {
        return dogRepository.findAllByBreed(breed);
    }

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }
}
