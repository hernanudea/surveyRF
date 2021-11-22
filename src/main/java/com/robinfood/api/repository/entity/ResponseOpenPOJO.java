package com.robinfood.api.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SURVEYS_RESPONSE_TYPE_OPEN")
public class ResponseOpenPOJO implements Serializable {

    @Id
    @Column(name = "ID_RESPONSES_TYPE_OPEN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponseTypeOpen;

    @Column(name = "TEXT_TYPE_OPEN", length = 512)
    private String textTypeOpen;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SURVEY_TYPE_OPEN", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private SurveyPOJO survey;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_QUESTION", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private QuestionPOJO question;

    public ResponseOpenPOJO() {

    }

    public ResponseOpenPOJO(String textTypeOpen, SurveyPOJO survey, QuestionPOJO question) {
        this.textTypeOpen = textTypeOpen;
        this.survey = survey;
        this.question = question;
    }

    public Long getIdResponseTypeOpen() {
        return idResponseTypeOpen;
    }

    public void setIdResponseTypeOpen(Long idResponseTypeOpen) {
        this.idResponseTypeOpen = idResponseTypeOpen;
    }

    public String getTextTypeOpen() {
        return textTypeOpen;
    }

    public void setTextTypeOpen(String textTypeOpen) {
        this.textTypeOpen = textTypeOpen;
    }

    public SurveyPOJO getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyPOJO survey) {
        this.survey = survey;
    }

    public QuestionPOJO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionPOJO question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "ResponseOpenPOJO{" +
                "idResponseTypeOpen=" + idResponseTypeOpen +
                ", textTypeOpen='" + textTypeOpen + '\'' +
                ", survey=" + survey +
                ", question=" + question +
                '}';
    }
}
