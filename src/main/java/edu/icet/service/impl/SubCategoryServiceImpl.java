package edu.icet.service.impl;

import edu.icet.dto.SubCategory;
import edu.icet.entity.SubCategoryEntity;
import edu.icet.repository.SubCategoryRepository;
import edu.icet.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubCategoryServiceImpl implements SubCategoryService {

    final SubCategoryRepository subCategoryRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveSubCategory(SubCategory subCategory) {
        subCategoryRepository.save(modelMapper.map(subCategory, SubCategoryEntity.class));
    }

    @Override
    public void updateSubCategory(SubCategory subCategory) {
        subCategoryRepository.save(modelMapper.map(subCategory, SubCategoryEntity.class));
    }

    @Override
    public List<SubCategory> getAllSubCategories() {
        List<SubCategory> subCategoryList = new ArrayList<>();
        subCategoryRepository.findAll().forEach(entity -> subCategoryList.add(modelMapper.map(entity, SubCategory.class)));
        return subCategoryList;
    }

    @Override
    public SubCategory getSubCategoryById(Integer id) {
        return modelMapper.map(subCategoryRepository.findById(id).orElse(null), SubCategory.class);
    }

    @Override
    public Boolean deleteSubCategoryById(Integer id) {
        subCategoryRepository.deleteById(id);
        return true;
    }
}
