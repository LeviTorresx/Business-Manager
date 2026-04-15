package com.bussinessmanager.BM.Controllers;

import com.bussinessmanager.BM.Entities.Admin;
import com.bussinessmanager.BM.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

}
