package com.robinfood.api.repository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "QUESTIONS_TYPE")
public class QuestionTypePOJO implements Serializable {
    @Id
    @Column(name = "ID_QUESTION_TYPE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestionType;

    @Column(name = "DESCRIPTION", length = 100, unique = true, nullable = false)
    private String description;

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

    public QuestionTypePOJO() {

    }

    public QuestionTypePOJO(String description, LocalDate createdDate, LocalDate lastModifiedDate, String createdUser, String lastModifiedUser, boolean active) {
        this.description = description;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.createdUser = createdUser;
        this.lastModifiedUser = lastModifiedUser;
        this.active = active;
    }

    public Long getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(Long idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "QuestionTypePOJO{" +
                "idQuestionType=" + idQuestionType +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", createdUser='" + createdUser + '\'' +
                ", lastModifiedUser='" + lastModifiedUser + '\'' +
                ", active=" + active +
                '}';
    }
}
