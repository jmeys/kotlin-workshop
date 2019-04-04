package ex4;

/*
 * Uh-oh, it seems like someone wrote some java class by mistake.
 * Can you convert it to Kotlin?
 * While you're at it: might also convert the unit tests for this class
 *
 * Tip: SW50ZWxsaUogaGFzIENvZGUgPiBDb252ZXJ0IHRvIEtvdGxpbiBvciBzaG9ydGN1dCBDbWQrU2hpZnQrQWx0KyBL
 */
public class Animal {

    private final String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
