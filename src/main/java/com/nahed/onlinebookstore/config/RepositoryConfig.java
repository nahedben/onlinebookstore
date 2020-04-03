package com.nahed.onlinebookstore.config;

import com.nahed.onlinebookstore.entity.Book;
import com.nahed.onlinebookstore.entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
   @Autowired
    private EntityManager entityManager;


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
       //here We expose the id of each book and every BookCategory
//        config.exposeIdsFor(Book.class);
//        config.exposeIdsFor((BookCategory.class);

        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
                .map(Type::getJavaType).toArray(Class[]::new));



    }
}
