package edu.icet.controller;

import edu.icet.dto.Admin;
import edu.icet.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin
public class AdminController {

    final AdminService adminService;

    @PostMapping("/save-admin")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAdmin(@RequestBody Admin admin) {
        adminService.saveAdmin(admin);
    }

    @PutMapping("/update-admin")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAdmin(@RequestBody Admin admin) {
        adminService.updateAdmin(admin);
    }

    @GetMapping("/view-all-admins")
    @ResponseStatus(HttpStatus.OK)
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/get-admin-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Admin getAdminById(@PathVariable Integer id) {
        return adminService.getAdminById(id);
    }

    @DeleteMapping("/delete-admin/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteAdmin(@PathVariable Integer id) {
        return adminService.deleteAdminById(id);
    }
}
