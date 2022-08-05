import java.util.Random;

public class MagicBox<T> {
    private int maxItems; // максимальное количество объектов
    private T[] items;

    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }

    // Метод добавления объекта
    public boolean add(T item) {
        for (int i = 0; i < maxItems; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i] + "   ");
//        }
        System.out.println("Коробка наполнена. Мест для добавления нового объекта нет!");
        return false;
    }

    public T pick() {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна. Осталось заполнить ячеек - "
                        + (maxItems - i));
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(maxItems);
        System.out.println(items[randomInt]);
        return items[randomInt];
    }
}


