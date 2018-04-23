package dao;

import com.fontys.rekeningadministratie.domain.ProvinceSettings;

/**
 *
 * @author Dirkv
 */
public interface ProvinceDAO {
    
    public void addProvinceSettings(ProvinceSettings provinceSettings);
    
    public void updateProvinceSettings(ProvinceSettings provinceSettings);
}
