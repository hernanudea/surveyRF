package com.robinfood.api.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SURVEYS_RESPONSE_TYPE_OPTION")
public class ResponseOptionPOJO implements Serializable {
    @Id
    @Column(name = "ID_RESPONSES_TYPE_OPTION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponseTypeOption;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SURVEY_TYPE_OPEN", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private SurveyPOJO survey;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_QUESTION", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private QuestionPOJO question;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_SURVEY_TYPE_OPTION", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private OptionPOJO option;

    public ResponseOptionPOJO() {
    }

    public ResponseOptionPOJO(SurveyPOJO survey, QuestionPOJO question, OptionPOJO option) {
        this.survey = survey;
        this.question = question;
        this.option = option;
    }

    public Long getIdResponseTypeOption() {
        return idResponseTypeOption;
    }

    public void setIdResponseTypeOption(Long idResponseTypeOption) {
        this.idResponseTypeOption = idResponseTypeOption;
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

    public OptionPOJO getOption() {
        return option;
    }

    public void setOption(OptionPOJO option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "ResponseOptionPOJO{" +
                "idResponseTypeOption=" + idResponseTypeOption +
                ", survey=" + survey +
                ", question=" + question +
                ", option=" + option +
                '}';
    }
}
