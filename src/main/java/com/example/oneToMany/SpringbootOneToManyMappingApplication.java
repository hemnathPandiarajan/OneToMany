package com.example.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oneToMany.entity.Comment;
import com.example.oneToMany.entity.Post;
import com.example.oneToMany.repository.PostRepository;

@SpringBootApplication
public class SpringbootOneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post = new Post("one to many mapping", "this is the example of one to one mapping");

		Comment comment1 = new Comment("Great post");
		Comment comment2 = new Comment("Impressive");
		Comment comment3 = new Comment("informative");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);
	}

}
