public class Main {
    public static void main(String[] args) {
        Animal catBarsik = new Cat("Barsik");
        Animal catMurzik = new Cat("Murzik");
        Animal catMyrka = new Cat("Myrka");
        Animal dogSharik = new Dog("Sharik");
        Animal dogMuhtar = new Dog("Muhtar");
        Animal dogPatron = new Dog("Patron");

        Cat.getCounter();
        Dog.getCounter();
        Animal.getCounter();

        catBarsik.run(228);
        catMyrka.run(123);
        dogSharik.run(666);
        dogPatron.run(128);

        catBarsik.swim(99);
        dogSharik.swim(13);
        dogPatron.swim(4);
    }
}