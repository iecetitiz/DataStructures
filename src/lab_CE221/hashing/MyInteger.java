package lab_CE221.hashing;
import java.util.Objects;

public class MyInteger
{
    public int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return get() == myInteger.get();
    }

    @Override
    public int hashCode() {
        return Objects.hash(get());
    }
}
