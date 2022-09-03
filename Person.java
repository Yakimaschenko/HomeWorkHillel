import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {

    public static void main(String[] args) {
        System.out.println(personInfo("Филатов", "Борис", "Днепр", "+380631111111"));
        System.out.println(personInfo("Кличко","Виталий","Киев","+380631111000"));
        System.out.println(personInfo("Удянский","Николай","Харьков","+380630001111"));

    }

    static String personInfo( String sername, String name, String town, String phone){
        String customer;
        customer = ("Позвонить гражданину " + sername + " "+name+ " из города " + town+ " можно по номеру " + phone );
        return customer;
    }
}
