package serialize.iulian.com;

import java.io.*;

import lombok.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Builder(builderClassName = "EmployeeBuilder")

public class Employee implements Serializable{
    private static final long serialVersionUID = 2L;
    private String firstname;
    private String email;

    private void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
        try {
            System.out.println("readObject");
            input.defaultReadObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void writeObject(ObjectOutputStream output) throws IOException {
        try {
            System.out.println("writeObject");
            output.defaultWriteObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve");
        return new EmployeeBuilder().build();
    }
    private Object writeReplace() throws ObjectStreamException{
        System.out.println("writeReplace");
        return new EmployeeBuilder().build();
    }

}