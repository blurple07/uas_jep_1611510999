package com.api.faisalluthfi.service
import com.api.faisalluthfi.entity.Category

interface CategoryService{
    List<Category> findAll()
    Category findById(int id)
    Category save(Category category)
    Category update(Category category, int id)
    Category delete (int id)
}