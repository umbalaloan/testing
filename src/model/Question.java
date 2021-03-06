package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question")
public class Question implements java.io.Serializable {

	private Integer questionId;
	private String questionDesc;
	private String questionType;
	private char questionLevel;
	private Set<Questionitem> questionitems = new HashSet<Questionitem>(0);
	private Set<Questionsolution> questionsolutions = new HashSet<Questionsolution>(
			0);
	private Set<Questioninfo> questioninfos = new HashSet<Questioninfo>(0);
	private Set<Questionfigure> questionfigures = new HashSet<Questionfigure>(0);
	private Set<Testsectionitem> testsectionitems = new HashSet<Testsectionitem>(
			0);
	private Set<Sharedquestion> sharedquestions = new HashSet<Sharedquestion>(0);
	private Set<Questiontopic> questiontopics = new HashSet<Questiontopic>(0);
	private Set<Questionowner> questionowners = new HashSet<Questionowner>(0);

	public Question() {
	}

	public Question(String questionType, char questionLevel) {
		this.questionType = questionType;
		this.questionLevel = questionLevel;
	}

	public Question(String questionDesc, String questionType,
			char questionLevel, Set<Questionitem> questionitems,
			Set<Questionsolution> questionsolutions,
			Set<Questioninfo> questioninfos,
			Set<Questionfigure> questionfigures,
			Set<Testsectionitem> testsectionitems,
			Set<Sharedquestion> sharedquestions,
			Set<Questiontopic> questiontopics, Set<Questionowner> questionowners) {
		this.questionDesc = questionDesc;
		this.questionType = questionType;
		this.questionLevel = questionLevel;
		this.questionitems = questionitems;
		this.questionsolutions = questionsolutions;
		this.questioninfos = questioninfos;
		this.questionfigures = questionfigures;
		this.testsectionitems = testsectionitems;
		this.sharedquestions = sharedquestions;
		this.questiontopics = questiontopics;
		this.questionowners = questionowners;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "QUESTION_ID", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Column(name = "QUESTION_DESC", length = 65535)
	public String getQuestionDesc() {
		return this.questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	@Column(name = "QUESTION_TYPE", nullable = false, length = 15)
	public String getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	@Column(name = "QUESTION_LEVEL", nullable = false, length = 1)
	public char getQuestionLevel() {
		return this.questionLevel;
	}

	public void setQuestionLevel(char questionLevel) {
		this.questionLevel = questionLevel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questionitem> getQuestionitems() {
		return this.questionitems;
	}

	public void setQuestionitems(Set<Questionitem> questionitems) {
		this.questionitems = questionitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questionsolution> getQuestionsolutions() {
		return this.questionsolutions;
	}

	public void setQuestionsolutions(Set<Questionsolution> questionsolutions) {
		this.questionsolutions = questionsolutions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questioninfo> getQuestioninfos() {
		return this.questioninfos;
	}

	public void setQuestioninfos(Set<Questioninfo> questioninfos) {
		this.questioninfos = questioninfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questionfigure> getQuestionfigures() {
		return this.questionfigures;
	}

	public void setQuestionfigures(Set<Questionfigure> questionfigures) {
		this.questionfigures = questionfigures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Testsectionitem> getTestsectionitems() {
		return this.testsectionitems;
	}

	public void setTestsectionitems(Set<Testsectionitem> testsectionitems) {
		this.testsectionitems = testsectionitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Sharedquestion> getSharedquestions() {
		return this.sharedquestions;
	}

	public void setSharedquestions(Set<Sharedquestion> sharedquestions) {
		this.sharedquestions = sharedquestions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questiontopic> getQuestiontopics() {
		return this.questiontopics;
	}

	public void setQuestiontopics(Set<Questiontopic> questiontopics) {
		this.questiontopics = questiontopics;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Questionowner> getQuestionowners() {
		return this.questionowners;
	}

	public void setQuestionowners(Set<Questionowner> questionowners) {
		this.questionowners = questionowners;
	}

}
