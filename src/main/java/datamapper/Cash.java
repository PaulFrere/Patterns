package datamapper;

import java.util.HashMap;
import java.util.Map;

public class Cash {

    Map<Integer,People> cash = new HashMap<Integer, People>();

    public void addToCash(People people){
        cash.put(people.getId(), people );
    }

    public People getPeopleFromCash(int id){
        return cash.get(id);
    }

}
