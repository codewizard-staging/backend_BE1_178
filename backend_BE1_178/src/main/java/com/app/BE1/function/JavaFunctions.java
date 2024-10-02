package com.app.BE1.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.BE1.repository.FundingRoundRepository;
import com.app.BE1.repository.StageRepository;
import com.app.BE1.repository.DocumentRepository;
import com.app.BE1.repository.InvestorRepository;
import com.app.BE1.repository.FounderRepository;
import com.app.BE1.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
