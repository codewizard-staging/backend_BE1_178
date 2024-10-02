package com.app.BE1.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.BE1.model.Stage;
import com.app.BE1.model.Startup;
import com.app.BE1.model.FundingRound;
import com.app.BE1.model.Founder;
import com.app.BE1.model.Document;
import com.app.BE1.model.Investor;
import com.app.BE1.enums.RoundStatus;
import com.app.BE1.enums.StageName;
import com.app.BE1.converter.StageNameConverter;
import com.app.BE1.converter.RoundStatusConverter;

@Entity(name = "StartupPreviousRounds")
@Table(schema = "\"be1_190\"", name = "\"StartupPreviousRounds\"")
@Data
public class StartupPreviousRounds{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"RoundId\"")
    private Integer roundId;
 
}