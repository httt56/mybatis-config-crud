package com.greedy.test01;

import java.util.Date;

public class postDTO {
	
	private int postNum;
	private int blogNum;
	private String categoryNum;
	private String postTitle;
	private String postContent;
	private String deletes;
	private int postFileNum;
	private Date dates;
	public postDTO() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public postDTO(int postNum, int blogNum, String categoryNum, String postTitle, String postContent, String deletes,
			int postFileNum, Date dates) {
		super();
		this.postNum = postNum;
		this.blogNum = blogNum;
		this.categoryNum = categoryNum;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.deletes = deletes;
		this.postFileNum = postFileNum;
		this.dates = dates;
	}
	public int getPostNum() {
		return postNum;
	}
	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}
	public int getBlogNum() {
		return blogNum;
	}
	public void setBlogNum(int blogNum) {
		this.blogNum = blogNum;
	}
	public String getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(String categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getDeletes() {
		return deletes;
	}
	public void setDeletes(String deletes) {
		this.deletes = deletes;
	}
	public int getPostFileNum() {
		return postFileNum;
	}
	public void setPostFileNum(int postFileNum) {
		this.postFileNum = postFileNum;
	}
	public Date getDates() {
		return dates;
	}
	public void setDates(Date dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "postDTO [postNum=" + postNum + ", blogNum=" + blogNum + ", categoryNum=" + categoryNum + ", postTitle="
				+ postTitle + ", postContent=" + postContent + ", deletes=" + deletes + ", postFileNum=" + postFileNum
				+ ", dates=" + dates + "]";
	}
	
	
}
