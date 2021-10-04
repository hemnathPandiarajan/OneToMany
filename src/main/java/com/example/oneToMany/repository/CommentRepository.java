package com.example.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneToMany.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
