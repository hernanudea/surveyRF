package com.robinfood.api.repository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "OPTIONS")
public class OptionPOJO implements Serializable {

    @Id
    @Column(name = "ID_OPTION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOption;

    @Column(name = "DESCRIPTION", length = 400, nullable = false, unique = true)
    private String description;

    @Column(name = "EXPLANATION", length = 200, nullable = false)
    private String explanation;

    @Column(name = "PRIORITY", nullable = false)
    private int priority;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ID_QUESTION")
//    private QuestionPOJO question;

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

    public OptionPOJO() {

    }

    public OptionPOJO(String description, String explanation, int priority,LocalDate createdDate, LocalDate lastModifiedDate, String createdUser, String lastModifiedUser, boolean active) {
        this.description = description;
        this.explanation = explanation;
        this.priority = priority;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.createdUser = createdUser;
        this.lastModifiedUser = lastModifiedUser;
        this.active = active;
    }

    public Long getIdOption() {
        return idOption;
    }

    public void setIdOption(Long idOption) {
        this.idOption = idOption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "OptionPOJO{" +
                "idOption=" + idOption +
                ", description='" + description + '\'' +
                ", explanation='" + explanation + '\'' +
                ", priority=" + priority +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", createdUser='" + createdUser + '\'' +
                ", lastModifiedUser='" + lastModifiedUser + '\'' +
                ", active=" + active +
                '}';
    }
}
