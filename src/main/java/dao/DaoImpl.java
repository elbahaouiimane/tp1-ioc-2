package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double GetData() {
        /*
        se connecter a la BD
         */
        System.out.println("versionbd");
        double temp=Math.random()*40;
        return temp;
    }
}
