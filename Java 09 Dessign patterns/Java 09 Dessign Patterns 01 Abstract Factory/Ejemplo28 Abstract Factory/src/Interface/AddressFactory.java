package Interface;
import Abstract.Address;
import Abstract.PhoneNumber;

public interface AddressFactory{
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
}