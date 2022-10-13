package ca.vanier;

public class mainob {

    public static void main(String[] args) {

        Object_Manager obj = new Object_Manager();

        obj.setName("Misha");

        System.out.println(obj.getName());

        obj.setproducts("Coc");

        System.out.println(obj.getproducts());

        obj.setnum(2);

        System.out.println(obj.getnum());
    }

}
