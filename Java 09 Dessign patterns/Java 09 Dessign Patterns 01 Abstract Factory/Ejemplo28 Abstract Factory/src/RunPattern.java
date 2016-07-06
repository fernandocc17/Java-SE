import Abstract.Address;
import Abstract.PhoneNumber;
import Interface.AddressFactory;

public class RunPattern{
    public static void main(String [] arguments){
        System.out.println("Example for the AbstractFactory pattern");
        System.out.println(" (take a look in the RunPattern code. Notice that you can");
        System.out.println("  use the Address and PhoneNumber classes when writing");
        System.out.println("  almost all of the code. This allows you to write a very");
        System.out.println("  generic framework, and plug in Concrete Factories");
        System.out.println("  and Products to specialize the behavior of your code)");
        System.out.println();
        
        System.out.println("Creating U.S. Address and Phone Number:");
        //Se instancia una direccion de USA y se guarda en una de la interface AdressFactory
        //Debe resultar conocido de cuando vimos el polimorfismo.
        AddressFactory usAddressFactory = new USAddressFactory();
        //Se crea la nueva instancia de USAdress
        Address usAddress = usAddressFactory.createAddress();
        //Se crea la nueva instancia de USPhone
        PhoneNumber usPhone = usAddressFactory.createPhoneNumber();
        
        usAddress.setStreet("142 Lois Lane");
        usAddress.setCity("Metropolis");
        usAddress.setRegion("WY");
        usAddress.setPostalCode("54321");
        usPhone.setPhoneNumber("7039214722");
        
        System.out.println("U.S. address:");
        System.out.println(usAddress.getFullAddress());
        System.out.println("U.S. phone number:");
        System.out.println(usPhone.getPhoneNumber());
        System.out.println();
        System.out.println();
        
        System.out.println("Creating French Address and Phone Number:");
        AddressFactory frenchAddressFactory = new FrenchAddressFactory();
        Address frenchAddress = frenchAddressFactory.createAddress();
        PhoneNumber frenchPhone = frenchAddressFactory.createPhoneNumber();
        
        frenchAddress.setStreet("21 Rue Victor Hugo");
        frenchAddress.setCity("Courbevoie");
        frenchAddress.setPostalCode("40792");
        frenchPhone.setPhoneNumber("011324290");
        
        System.out.println("French address:");
        System.out.println(frenchAddress.getFullAddress());
        System.out.println("French phone number:");
        System.out.println(frenchPhone.getPhoneNumber());
    }
}