package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {


    @Override
    public double GetData() {
        System.out.println("version web service");
        return 90;
    }
}
