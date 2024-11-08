package edu.icet.service.impl;

import edu.icet.dto.Category;
import edu.icet.entity.CategoryEntity;
import edu.icet.repository.CategoryRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository categoryRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(modelMapper.map(category, CategoryEntity.class));
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categoryList = new ArrayList<>();
        categoryRepository.findAll().forEach(entity -> categoryList.add(modelMapper.map(entity, Category.class)));
        return categoryList;
    }

    @Override
    public Category getCategoryById(Integer id) {
        return modelMapper.map(categoryRepository.findById(id).orElse(null), Category.class);
    }

    @Override
    public Boolean deleteCategoryById(Integer id) {
        try {
            categoryRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
