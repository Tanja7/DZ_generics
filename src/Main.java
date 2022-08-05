public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> box1 = new MagicBox<>(3);
        MagicBox<String> box2 = new MagicBox<>(3);
        MagicBox<Double> box3 = new MagicBox<>(5);
        box1.add(133);
        box1.add(245);
        box1.add(7889);
        box1.pick();
        box1.add(4654);
        box1.pick();
        box2.add("Мороженное");
        box2.add("Яблоки");
        box2.add("Конфеты");
        box2.pick();
        box2.add("Вода");
        box2.pick();
        box3.add(56.45);
        box3.pick();
    }
}
