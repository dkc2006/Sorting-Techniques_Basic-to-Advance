package sorting.bubbleSort;

import java.util.Arrays;

class MobilePhone {
    String name;
    Double price;


    public MobilePhone(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "MobilePhone{" + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

class Sorter {
    public void sort(MobilePhone[] phones) {
        for (int counter = 0; counter < phones.length; counter++) {
            for (int index = 0; index < phones.length - 1; index++) {
                if (phones[index].price > phones[index + 1].price) {
                    MobilePhone temp = phones[index];
                    phones[index] = phones[index + 1];
                    phones[index + 1] = temp;
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        MobilePhone[] phones = new MobilePhone[]{new MobilePhone("A", 10.0), new MobilePhone("B", 4.0)};
        System.out.println(Arrays.toString(phones));
        Sorter sorter = new Sorter();
        sorter.sort(phones);
        System.out.println(Arrays.toString(phones));

    }
}