package com.sportathon.performance.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;


//import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@Entity
@Table(name="performance", uniqueConstraints= {@UniqueConstraint(columnNames= {"sportName","sportRank"})})
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(unique = true)
	private long teamId;
    
    @NotNull
    @Size(min=1,max=255)
    private String teamName;
    
    @NotNull
    @Size(min=1,max=255)
    private String sportName;
    
    @NotNull
    private Integer sportRank;

}