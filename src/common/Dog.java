package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author L117student
 */
public class Dog implements Comparable {
    private String name;
    private int age;
    private String rabiesId;

    public Dog(String name, int age, String rabiesId) {
        this.name = name;
        this.age = age;
        this.rabiesId = rabiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(String rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + ", rabiesId=" + rabiesId + '}';
    }

    @Override
     public int compareTo(Object other) {
        
        Dog o = (Dog)other;
        
        // Using a utility from Apache Commons
        return new CompareToBuilder()
               .append(this.rabiesId, o.rabiesId)
               .toComparison();
        
     }

    
}
