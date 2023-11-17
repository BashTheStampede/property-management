package com.mycompany.propertymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mycompany.propertymanagement.entity.PropertyEntity;


public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
    
    //@Query("SELECT p FROM PropertyEntity p WHERE p.userEntity.id = :userId AND p.title = :title")
    //List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId, @Param("title") Long title);

    List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId);
}
