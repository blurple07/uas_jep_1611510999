package com.api.faisalluthfi.service.impl
import com.api.faisalluthfi.entity.Book
import com.api.faisalluthfi.repository.BookRepository
import com.api.faisalluthfi.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService implements BookService{
    @Autowired
    private final BookRepository BookRepository

    @Override
    List<Book> findAll(){
        BookRepository.findAll()
    }

    @Override
    Book findById(int id){
        BookRepository.findById(id)
    }

    @Override
    Book save(Book book){
        BookRepository.save(book)
    }

    @Override
    Book update(Book book, int id){
        def record = BookRepository.findById(id)
        record.with{
            name = book.name
            isbn = book.isbn
            category_id = book.category_id
        }

        BookRepository.save(record)
        record
    }

    @Override
    Book delete(int id){
        def record = BookRepository.findById(id)
        BookRepository.delete(record)
        record
    }
}