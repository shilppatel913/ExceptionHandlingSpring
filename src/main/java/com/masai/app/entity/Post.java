package com.masai.app.entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

import jakarta.validation.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "post")
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Post {
	@Id
	@GeneratedValue
	private int id;
	@Size(max = 100,message = "{message.invalid}")
	private String message;
	@Past(message = "{creationDate.invalid}")
	private Date creationDate;
	private Date updationDate;
	@AssertTrue(message = "{isVisible.invalid}")
	private boolean isVisible=true;
	@Size(min = 8,message = "{username.invalid}")
	private String username;
	@Email(message = "{user_email.invalid}")
	private String user_email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Post(int id, String message, Date creationDate, Date updationDate, boolean isVisible, String username,
			String user_email) {
		super();
		this.id = id;
		this.message = message;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
		this.isVisible = isVisible;
		this.username = username;
		this.user_email = user_email;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", message=" + message + ", creationDate=" + creationDate + ", updationDate="
				+ updationDate + ", isVisible=" + isVisible + ", username=" + username + ", user_email=" + user_email
				+ "]";
	}
	
	
	
	
	
}
