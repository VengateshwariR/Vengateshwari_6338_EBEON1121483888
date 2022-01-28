package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int Id_q;
	@Column
	private String question;
	
	//@OneToOne()
	//@JoinColumn(name= "id")
	 @OneToMany(mappedBy="question",cascade=CascadeType.ALL )
	
	List<Answer>answer;
	
	
	
	public int getId_q() {
		return Id_q;
	}
	public void setId_q(int id_q) {
		Id_q = id_q;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	public Question(int id_q, String question, List<Answer> answer) {
		super();
		Id_q = id_q;
		this.question = question;
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Question [Id_q=" + Id_q + ", question=" + question + ", answer=" + answer + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
