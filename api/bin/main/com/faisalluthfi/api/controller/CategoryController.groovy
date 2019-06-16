package com.api.faisalluthfi.controller
import com.api.faisalluthfi.entity.Category
import com.api.faisalluthfi.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/categories")
class CategoryController{
    @Autowired
    private final CategoryService categoryService
    
    @GetMapping('')
    List<Category> findAll(){
        categoryService.findAll()
    }

    @GetMapping('{id}')
    Category findById(@PathVariable('id') int id){
        categoryService.findById(id)
    }

    @PostMapping()
    Category save(@RequestBody Category category){
        categoryService.save(category)
    }

    @PutMapping('{id}')
    Category update(@RequestBody Category category, @PathVariable('id') int id){
        categoryService.update(category, id)
    }

    @DeleteMapping('{id}')
    Category delete(@PathVariable('id') int id){
        categoryService.delete(id)
    }
}