package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
@Autowired
@Qualifier("dao2")
    private IDao dao;
    public MetierImpl() {
    }


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.GetData();
        double res=tmp*50;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
