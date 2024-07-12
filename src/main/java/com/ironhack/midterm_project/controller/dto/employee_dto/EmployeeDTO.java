package com.ironhack.midterm_project.controller.dto.employee_dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ironhack.midterm_project.controller.dto.seller_dto.SellerDTO;
import com.ironhack.midterm_project.model.Seller;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SellerDTO.class, name = "SellerDTO")
})
public class EmployeeDTO {
    @NotBlank(message = "Name cannot be blank")
    private String name;
}