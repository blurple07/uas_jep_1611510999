package com.api.faisalluthfi.controller
import com.api.faisalluthfi.entity.Book
import com.api.faisalluthfi.service.BookService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/books")
class BookController{
    @Autowired
    private final BookService bookService
    
    @GetMapping('')
    List<Book> findAll(){
        bookService.findAll()
    }

    @GetMapping('{id}')
    Book findById(@PathVariable('id') int id){
        bookService.findById(id)
    }

    @PostMapping()
    Book save(@RequestBody Book book){
        bookService.save(book)
    }

    @PutMapping('{id}')
    Book update(@RequestBody Book book, @PathVariable('id') int id){
        bookService.update(book, id)
    }

    @DeleteMapping('{id}')
    Book delete(@PathVariable('id') int id){
        bookService.delete(id)
    }
}