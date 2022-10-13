package ca.vanier;

import java.util.ArrayList;
import java.util.List;

public class mainob {

    public static void main(String[] args) {

        Object_Manager obj = new Object_Manager();
        List<Object> list = new ArrayList<>();

        obj.setName("club");

        // System.out.println(obj.getName());

        obj.setproducts("Coc");

        // System.out.println(obj.getproducts());

        obj.setnum(1);

        // System.out.println(obj.getnum());

        list.add(obj.getnum());
        list.add(obj.getproducts());
        list.add(obj.getName());

        System.out.print(list);
    }

}
