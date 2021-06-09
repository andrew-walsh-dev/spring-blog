package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String viewAllPosts(){
        return "Posts index page.";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewOnePost(@PathVariable int id){
        return "View post with id of " + id + ".";
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
