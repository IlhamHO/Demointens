package be.ehb.demointens.model;

import java.util.ArrayList;

public class PersoonDao {
    //Singleton pattern
    private static final PersoonDao ourInstance = new PersoonDao();

    public static PersoonDao getInstance() {
        return ourInstance;
    }

    private PersoonDao() {
        personen.add(new Persoon("Jan","tel:0123456789", "http://www.google.be" ));
        personen.add(new Persoon("David","tel:0492827218", "http://www.ehb.be" ));
    }

    //eigen waarden
    private ArrayList<Persoon> personen = new ArrayList();
    public ArrayList<Persoon> getPersonen(){
        return personen;
    }
}
