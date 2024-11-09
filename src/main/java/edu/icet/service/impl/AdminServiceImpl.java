package edu.icet.service.impl;

import edu.icet.dto.Admin;
import edu.icet.entity.AdminEntity;
import edu.icet.repository.AdminRepository;
import edu.icet.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {

    final AdminRepository adminRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveAdmin(Admin admin) {
        adminRepository.save(modelMapper.map(admin, AdminEntity.class));
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminRepository.save(modelMapper.map(admin, AdminEntity.class));
    }

    @Override
    public List<Admin> getAllAdmins() {
        List<Admin> adminList = new ArrayList<>();
        adminRepository.findAll().forEach(entity -> adminList.add(modelMapper.map(entity, Admin.class)));
        return adminList;
    }

    @Override
    public Admin getAdminById(Integer id) {
        return modelMapper.map(adminRepository.findById(id).orElse(null), Admin.class);
    }

    @Override
    public Boolean deleteAdminById(Integer id) {
        adminRepository.deleteById(id);
        return true;
    }
}
