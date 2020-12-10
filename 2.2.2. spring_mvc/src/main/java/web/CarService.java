package web;

public class CarService {

    public int getCount(Integer count){
        return new CarApplication().getList(count).size();
    }


}
