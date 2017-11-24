package serialize.iulian.com;

public class PersonV1Builder {
    final PersonV1 person;
    public PersonV1Builder(){
        person = new PersonV1();
    }
    public PersonV1 build(){
        return person;
    }
    public PersonV1Builder setFirst(String name){
        person.setFirst(name);
        return this;
    }
    public PersonV1Builder setLast(String name){
        person.setLast(name);
        return this;
    }
}
