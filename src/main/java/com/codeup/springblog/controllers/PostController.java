package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String viewAllPosts(Model model){
        List<Post> posts = new ArrayList<>(Arrays.asList(
                new Post("Title1", "Body1"),
                new Post("Title2", "Body2")
        ));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewOnePost(@PathVariable int id, Model model){
        Post post = new Post("The post you are looking for", "The body too");
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "View the form for creating a new post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String posts(){
        return "Create a new post.";
    }


}
