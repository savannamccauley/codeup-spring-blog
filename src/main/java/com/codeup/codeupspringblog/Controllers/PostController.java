package com.codeup.codeupspringblog.Controllers;

import com.codeup.codeupspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @GetMapping("/posts")

    public String viewPosts(Model model) {
        List<Post> posts= new ArrayList<>();
        posts.add(new Post("first post", "this is my first post"));
        posts.add(new Post("second post", "this is my second post"));

        model.addAttribute("posts",posts);
        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model) {
        Post post1= new Post("title", "description");
        model.addAttribute("post", post1);
        return "posts/show";
    }


    @GetMapping("/posts/create")
    @ResponseBody
    public String showPostForm() {
        return "Viewing form to create a new post!";
    }


    @PostMapping("/posts/create")
//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String submitNewPost() {
        return "submitting new post";
    }
}
