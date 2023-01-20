package com.pojo;

public class Tutorial {
	private int id;
	private String name;
	private String author;
	private int visits;
	private String contents;
	private int topic_id;

	public Tutorial(int id, String name, String author, int visits, String contents, int topic_id) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.visits = visits;
		this.contents = contents;
		this.topic_id = topic_id;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", author=" + author + ", visits=" + visits + ", contents="
				+ contents + ", topic_id=" + topic_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
}
