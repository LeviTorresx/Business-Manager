package com.bussinessmanager.BM.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
    private Long adminId;
    @NotBlank(message = "El nombre no puede estar vacio")
    private String name;
    @NotBlank(message = "El email no puede estar vacio")
    private String email;
    @NotBlank(message = "El numero telefonico no puede estar vacio")
    private String phoneNumber;
    @NotBlank(message = "La contraseña no puede estar vacio")
    private String password;

    private List<Long> storeIds;
}
