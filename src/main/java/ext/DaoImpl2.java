package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double GetData() {
        System.out.println("version capteurs");
        double temp=1000;
        return temp;
    }
}
