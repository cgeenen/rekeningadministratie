package dao;

import com.fontys.rekeningadministratie.domain.ProvinceSettings;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Remco
 */
@Stateless
public class ProvinceDAOImpl implements ProvinceDAO {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addProvinceSettings(ProvinceSettings provinceSettings){
        this.em.persist(provinceSettings);
    }
    
    @Override
    public void updateProvinceSettings(ProvinceSettings provinceSettings) {
        this.em.merge(provinceSettings);
    }
}