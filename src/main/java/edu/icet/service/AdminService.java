package edu.icet.service;

import edu.icet.dto.Admin;

import java.util.List;

public interface AdminService {
    void saveAdmin(Admin admin);
    void updateAdmin(Admin admin);
    List<Admin> getAllAdmins();
    Admin getAdminById(Integer id);
    Boolean deleteAdminById(Integer id);
}
