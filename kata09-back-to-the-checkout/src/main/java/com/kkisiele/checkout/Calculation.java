package com.kkisiele.checkout;

public final class Calculation {
    private Money totalPrice;
    private Items items = new Items();

    private Calculation(Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Calculation() {
        this(Money.ZERO);
    }

    public Calculation(Money totalPrice, Item item) {
        this(totalPrice);
        items.add(item);
    }

    public Money totalPrice() {
        return totalPrice;
    }

    public Items items() {
        return new Items(items);
    }

    public void add(Calculation calculation) {
        totalPrice = totalPrice.add(calculation.totalPrice);
        items.add(calculation.items());
    }

    public void add(Item item, Money money) {
        items.add(item);
        totalPrice = totalPrice.add(money);
    }

    public void applyDiscount(Money discount) {
        totalPrice = totalPrice.subtract(discount);
    }
}
