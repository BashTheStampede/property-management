package com.mycompany.propertymanagement.converter;

import org.springframework.stereotype.Component;

import com.mycompany.propertymanagement.model.PropertyDTO;
import com.mycompany.propertymanagement.entity.PropertyEntity;

@Component
public class PropertyConverter {
    
    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO) {
        
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());

        return pe;
    }

    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity) {
        
        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setUserId(propertyEntity.getUserEntity().getId());
        
        return propertyDTO;
    }
}
