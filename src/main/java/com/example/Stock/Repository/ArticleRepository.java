package com.example.Stock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.Models.Article;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
    
}
