package serialize.iulian.com;

import java.io.Serializable;

public class PersonV1 extends Person implements Serializable{
        public static final long serialVersionUID = 1L;
        private String first;
        private String last;
        private Integer age;
        public PersonV1 (){};

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
