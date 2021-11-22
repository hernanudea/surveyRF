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

    @OneToMany()
    @JoinColumn(name = "ID_RESPONSE_TYPE_OPTION", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<ResponseOptionPOJO> listResponseOption;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "ID_RESPONSE_TYPE_OPEN", nullable = false)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private List<ResponseOpenPOJO> listResponseOpen;

}
