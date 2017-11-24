package serialize.iulian.com;

public class PersonV2Builder {
    final PersonV2 person;
    public PersonV2Builder(){
        person = new PersonV2();
    }
    public PersonV2 build(){
        return person;
    }
    public PersonV2Builder setFirst(String name){
        person.setFirst(name);
        return this;
    }
    public PersonV2Builder setLast(String name){
        person.setLast(name);
        return this;
    }
    public PersonV2Builder setCls(Integer cls) {
        person.setCls(cls);
        return this;
    }
}
