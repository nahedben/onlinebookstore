package com.nahed.onlinebookstore.repository;


import com.nahed.onlinebookstore.entity.Book;
import com.nahed.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface BookRepository  extends JpaRepository<Book,Long>{
}
