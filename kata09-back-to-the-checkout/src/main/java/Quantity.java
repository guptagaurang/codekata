public final class Quantity implements Comparable<Quantity> {
    public static Quantity ZERO = new Quantity(0);
    public static Quantity ONE = new Quantity(1);

    private final Integer value;

    public Quantity(int value) {
        this.value = value;
    }

    public static Quantity valueOf(int value) {
        return new Quantity(value);
    }

    public Quantity add(Quantity quantity) {
        return new Quantity(value + quantity.value);
    }

    public boolean isGreaterOrEqual(Quantity quantity) {
        return this.compareTo(quantity) >= 0;
    }

    public double divide(Quantity quantity) {
        return value.doubleValue() / quantity.value.doubleValue();
    }

    public Quantity multiply(int m) {
        return new Quantity(value * m);
    }

    public int value() {
        return value;
    }

    @Override
    public boolean equals(Object another) {
        if(another instanceof Quantity) {
            Quantity quantity = (Quantity) another;
            return value.equals(quantity.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public int compareTo(Quantity quantity) {
        return value.compareTo(quantity.value);
    }

}
