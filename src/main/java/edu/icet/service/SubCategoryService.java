package edu.icet.service;

import edu.icet.dto.SubCategory;

import java.util.List;

public interface SubCategoryService {
    void saveSubCategory(SubCategory subCategory);
    void updateSubCategory(SubCategory subCategory);
    List<SubCategory> getAllSubCategories();
    SubCategory getSubCategoryById(Integer id);
    Boolean deleteSubCategoryById(Integer id);
}
