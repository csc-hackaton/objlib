package serialize.iulian.com;


public class PersonFactory{
    public Person create(Integer version){
        switch (version){
            case 1: return new PersonV1();
            case 2: return new PersonV2();
            default: return new PersonV1();
        }
    }
}