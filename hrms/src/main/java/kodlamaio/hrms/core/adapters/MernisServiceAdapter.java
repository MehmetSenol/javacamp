package kodlamaio.hrms.core.adapters;


import kodlamaio.hrms.mernisService.PMVKPSPublicSoap;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MernisServiceAdapter implements UserCheckService{
    @Override
    public boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName,LocalDate birthDate) {
        PMVKPSPublicSoap hlikpsPublicSoap=new PMVKPSPublicSoap();
        boolean result=false;
        try{
            result=hlikpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(nationalIdentity),firstName,lastName,birthDate.getYear());
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }
}
