package com.task2.SimpleBlogApp.WebLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.task2.SimpleBlogApp.Model.Post;
import com.task2.SimpleBlogApp.Model.User;
import com.task2.SimpleBlogApp.Persistance.IUserRepo;
import com.task2.SimpleBlogApp.ServiceLayer.IBlogService;

import jakarta.servlet.http.HttpSession;

import java.time.LocalDateTime;
import java.util.*;


@Controller
public class HandlerMapper
{

	@Autowired
	private IBlogService service;
	
    @Autowired	
	private IUserRepo userrepo;
	


	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/blogs")
	public String getAllBlogs(Map<String,Object> map)
	{
		map.put("blogs",service.getAllBlogs());
		return "AllBlogs";
	}
	
	
	@GetMapping("/login")
	public String showloginform()
	{
		return "Login";
	}
	
	@PostMapping("/login")
	public String loginform(@RequestParam String username, @RequestParam String password,Map<String ,Object> map,@ModelAttribute("post") Post blog,HttpSession session)
	{
		if(userrepo.findByFirstnameAndSetPassword(username, password)!=null)
		{
			 session.setAttribute("username", username);
			
			
			
			return "redirect:/getUserBlogs";
		}
		
		return "redirect:/login";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("user") User user)
	{
		return "Register";
	}
	
	
	@PostMapping("/registerNewUser")
	public String registerNewUser(@ModelAttribute("user") User user)
	{
		userrepo.save(user);
		return "redirect:/login";
	}
	
	
	@PostMapping("/submitBlog")
	public String submitBlog(@ModelAttribute("post") Post blog)
	{
		blog.setDt(LocalDateTime.now());
		service.save(blog);
		return "redirect:/getUserBlogs";
	}
	
	
	 @GetMapping("/editBlog")
	    public String editBlog(@RequestParam("id") Integer id, Model model) {
	        Optional<Post> post = service.findById(id);
	        if (post.isPresent())
	        {
	            model.addAttribute("post", post.get());
	            return "WriteBlogs";
	        }
	        else
	        {
	        	return "redirect:/getUserBlogs";
	        }
	    }
	 
	 @GetMapping("/deleteBlog")
	 public String deleteBlog(@RequestParam("id") Integer id)
	 {
	        service.deleteBlogById(id);
	        return "redirect:/getUserBlogs"; // Assuming "allBlogs" is the view name to display all blogs
	 }
	 
	 
	   @GetMapping("/about")
    	public String about()
    	{
			return "About";
	  	}
	   
	   @GetMapping("/writeBlog")
	   public String writeBlog(@RequestParam(required = false) String username, Map<String, Object> map, @ModelAttribute("post") Post blog) {
	       if (username != null) {
	           blog.setUsername(username);
	       }
	       map.put("post", blog);
	       return "WriteBlogs";
	   }


	   @GetMapping("/logout")
	    public String logout(HttpSession session)
	   {
	        session.invalidate(); // Invalidate the session
	        return "redirect:/home"; // Redirect to the home page
	    }
	   
	   
	   @GetMapping("/getUserBlogs")
	   public String getUserBlogs(Map<String,Object> map,HttpSession session)
	   {
		   String username=(String) session.getAttribute("username");
		   
		   map.put("blogs", service.findAllByUsername(username));
		   return "CUserBlogs";
	   }
	   
}
