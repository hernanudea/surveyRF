package com.robinfood.api.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "SURVEYS")
public class SurveyPOJO implements Serializable {

    @Id
    @Column(name = "ID_SURVEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSurvey;

    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    @Column(name = "ID_CLIENT")
    private String idClient;

    @Column(name = "ID_RESTAURANT")
    private String idRestaurant;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_RESPONSE_TYPE_OPTION", nullable = false)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<ResponseOptionPOJO> listResponseOption;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_RESPONSE_TYPE_OPEN", nullable = false)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<ResponseOpenPOJO> listResponseOpen;

    public SurveyPOJO() {
    }

    public SurveyPOJO(LocalDate createdDate, String idClient, String idRestaurant, List<ResponseOptionPOJO> listResponseOption, List<ResponseOpenPOJO> listResponseOpen) {
        this.createdDate = createdDate;
        this.idClient = idClient;
        this.idRestaurant = idRestaurant;
        this.listResponseOption = listResponseOption;
        this.listResponseOpen = listResponseOpen;
    }

    public Long getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(Long idSurvey) {
        this.idSurvey = idSurvey;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public List<ResponseOptionPOJO> getListResponseOption() {
        return listResponseOption;
    }

    public void setListResponseOption(List<ResponseOptionPOJO> listResponseOption) {
        this.listResponseOption = listResponseOption;
    }

    public List<ResponseOpenPOJO> getListResponseOpen() {
        return listResponseOpen;
    }

    public void setListResponseOpen(List<ResponseOpenPOJO> listResponseOpen) {
        this.listResponseOpen = listResponseOpen;
    }

    @Override
    public String toString() {
        return "SurveyPOJO{" +
                "idSurvey=" + idSurvey +
                ", createdDate=" + createdDate +
                ", idClient='" + idClient + '\'' +
                ", idRestaurant='" + idRestaurant + '\'' +
                ", listResponseOption=" + listResponseOption +
                ", listResponseOpen=" + listResponseOpen +
                '}';
    }
}
