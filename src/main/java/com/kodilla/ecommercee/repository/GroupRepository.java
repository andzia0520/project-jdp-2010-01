package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Group;
import com.kodilla.ecommercee.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends CrudRepository <Group, Long> {
    @Override
    List<Group> findAll();

    @Override
    Optional<Group> findById(Long grroupId);

    @Override
    Group save(Group Group);

    @Override
    void deleteById(Long groupId);

}