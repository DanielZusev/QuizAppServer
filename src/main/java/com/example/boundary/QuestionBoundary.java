package com.example.boundary;

public class QuestionBoundary {
	
	private String questionId;
	private String categoryId;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String correctAnswer;
	private String isImageQuestion;
	
	public QuestionBoundary() {
		
	}

	public QuestionBoundary(String questionId, String categoryId, String question, String answerA, String answerB,
			String answerC, String answerD, String correctAnswer, String isImageQuestion) {
		
		this.questionId = questionId;
		this.categoryId = categoryId;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.correctAnswer = correctAnswer;
		this.isImageQuestion = isImageQuestion;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getIsImageQuestion() {
		return isImageQuestion;
	}

	public void setIsImageQuestion(String isImageQuestion) {
		this.isImageQuestion = isImageQuestion;
	}
	

}
