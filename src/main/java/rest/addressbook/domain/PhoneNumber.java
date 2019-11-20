package rest.addressbook.domain;

import java.util.Objects;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object obj){
    if (obj == this){
      return true;
    }
    if(obj == null){
      return false;
    }
    if(this.getClass() != obj.getClass()){
      return false;
    }

    PhoneNumber phone_n = (PhoneNumber) obj;
    return Objects.equals(number, phone_n.number) && Objects.equals(type, phone_n.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

}
