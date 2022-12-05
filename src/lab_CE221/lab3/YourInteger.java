package lab_CE221.lab3;

import java.util.Objects;

public class YourInteger {
        public int value;

        public YourInteger(int value) {
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
            YourInteger myInteger = (YourInteger) o;
            return get() == myInteger.get();
        }

        @Override
        public int hashCode() {
            return Objects.hash(get());
        }
}
