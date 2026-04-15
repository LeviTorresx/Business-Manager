package com.bussinessmanager.BM.Services;

import com.bussinessmanager.BM.Dto.AdminDto;
import com.bussinessmanager.BM.Dto.ResponseRegDTO;
import com.bussinessmanager.BM.Entities.Admin;
import com.bussinessmanager.BM.Repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    public ResponseRegDTO register(AdminDto adminDto){

        if (adminRepository.existsByEmail(adminDto.getEmail())){
           throw new IllegalArgumentException("El usuario ya esta registrado");
        }

        Admin admin = new Admin();

        admin.setName(adminDto.getName());
        admin.setEmail(adminDto.getEmail());
        admin.setPhoneNumber(adminDto.getPhoneNumber());
        admin.setPassword(passwordEncoder.encode(adminDto.getPassword()));

        Admin adminResponse = adminRepository.save(admin);

        ResponseRegDTO response = new ResponseRegDTO();

        response.setName(adminResponse.getName());
        response.setEmail(adminResponse.getEmail());
        return response;
    }
}
