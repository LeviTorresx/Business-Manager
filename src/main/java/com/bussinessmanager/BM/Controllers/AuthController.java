package com.bussinessmanager.BM.Controllers;

import com.bussinessmanager.BM.Dto.AdminDto;
import com.bussinessmanager.BM.Dto.ResponseRegDTO;
import com.bussinessmanager.BM.Services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/AuthService")
@RequiredArgsConstructor
public class AuthController {

    public final AuthService authService;

    @PostMapping("/register")
    public ResponseRegDTO register(@RequestBody @Valid AdminDto dto){
        return authService.register(dto);

    }
}
