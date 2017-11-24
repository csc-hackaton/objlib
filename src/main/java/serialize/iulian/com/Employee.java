package serialize.iulian.com;

import java.io.Serializable;

/** v1 */
public class Employee implements Serializable{
    private static long serialVersionUID = 1L;
    private String firstname;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Employee.serialVersionUID = serialVersionUID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
/** v1->v2 compatible*/
//public class Employee implements Serializable {
//    private static long serialVersionUID = 1L;
//    private String firstname;
//    private String lastname;
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public static void setSerialVersionUID(long serialVersionUID) {
//        Employee.serialVersionUID = serialVersionUID;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//}

/** v2->v3 incompatible */

//public class Employee implements Serializable{
//    private static long serialVersionUID = 3L;
//    private String firstname;
//    private String email;
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public static void setSerialVersionUID(long serialVersionUID) {
//        Employee.serialVersionUID = serialVersionUID;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}