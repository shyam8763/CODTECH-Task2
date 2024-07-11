package com.task2.SimpleBlogApp.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Post
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
    private String username;
    
   

	private String title;
    
    @Column(length = 10000)
    private String content;
    
    private LocalDateTime dt;

	public Post(Integer id, String title, String content, LocalDateTime dt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.dt = dt;
	}

	public Post()
	{
		super();
	}

	 public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}
    
    
	
}
