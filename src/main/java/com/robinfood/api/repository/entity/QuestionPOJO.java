package com.robinfood.api.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "QUESTIONS")
public class QuestionPOJO implements Serializable {

    @Id
    @Column(name = "ID_QUESTION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestion;

    @Column(name = "QUESTION", length = 400, nullable = false, unique = true)
    private String question;

    @Column(name = "EXPLANATION", length = 200, nullable = false)
    private String explanation;

    @Column(name = "PRIORITY", nullable = false)
    private int priority;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_QUESTION_TYPE", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private QuestionTypePOJO questionType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_QUESTION", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private List<OptionPOJO> listOptions;

    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    @Column(name = "LAST_MODIFIED_DATE")
    private LocalDate lastModifiedDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "LAST_MODIFIED_USER")
    private String lastModifiedUser;

    @Column(name = "ACTIVE")
    private boolean active;

    public QuestionPOJO() {

    }

    public QuestionPOJO(String question, String explanation, int priority, QuestionTypePOJO questionType, List<OptionPOJO> listOptions, LocalDate createdDate, LocalDate lastModifiedDate, String createdUser, String lastModifiedUser, boolean active) {
        this.question = question;
        this.explanation = explanation;
        this.priority = priority;
        this.questionType = questionType;
//        this.listOptions = listOptions;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.createdUser = createdUser;
        this.lastModifiedUser = lastModifiedUser;
        this.active = active;
    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public QuestionTypePOJO getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionTypePOJO questionType) {
        this.questionType = questionType;
    }

    public List<OptionPOJO> getListOptions() {
        return listOptions;
    }

    public void setListOptions(List<OptionPOJO> listOptions) {
        this.listOptions = listOptions;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "QuestionPOJO{" +
                "idQuestion=" + idQuestion +
                ", question='" + question + '\'' +
                ", explanation='" + explanation + '\'' +
                ", priority=" + priority +
                ", questionType=" + questionType +
             //   ", listOptions=" + listOptions +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", createdUser='" + createdUser + '\'' +
                ", lastModifiedUser='" + lastModifiedUser + '\'' +
                ", active=" + active +
                '}';
    }
}
