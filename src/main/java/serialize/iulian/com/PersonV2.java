package serialize.iulian.com;

import java.io.Serializable;

public class PersonV2 extends Person implements Serializable{
        public static final long serialVersionUID = 2L;
        private String first;
        private String last;
        private Integer age;
        private Integer cls;
        public PersonV2 (){};

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

    public Integer getCls() {
        return cls;
    }

    public void setCls(Integer cls) {
        this.cls = cls;
    }
}
