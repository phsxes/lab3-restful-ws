package rest.addressbook.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A really simple Address Book. This class is not thread safe.
 */
public class AddressBook {

  private int nextId = 1;
  private List<Person> personList = new ArrayList<>();

  //Create a new addressbook.
  public AddressBook(){}

  //Make a copy of an exiting addressbook.
  public AddressBook(AddressBook original_ab){
    this.nextId = original_ab.nextId;
    this.personList = new ArrayList<>(original_ab.personList);
  }

  /**
   * The value of next unique identifier.
   *
   * @return the next unique identifier.
   */
  public int getNextId() {
    return nextId;
  }

  public void setNextId(int nextId) {
    this.nextId = nextId;
  }

  /**
   * The list of persons in this address book.
   *
   * @return a person list.
   */
  public List<Person> getPersonList() {
    return personList;
  }

  public void setPersonList(List<Person> persons) {
    this.personList = persons;
  }

  /**
   * Returns the old next identifier and increases the new value in one.
   *
   * @return an identifier.
   */
  public int nextId() {
    int oldValue = nextId;
    nextId++;
    return oldValue;
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

    AddressBook ab = (AddressBook) obj;
    return nextId == ab.nextId && Objects.equals(personList, ab.personList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextId, personList);
  }
}
