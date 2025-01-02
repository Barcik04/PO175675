package zad4;

import java.util.Arrays;

public class ItemManager<T> {
    private T[] items;

    public ItemManager(T[] items) {
        this.items = items != null ? Arrays.copyOf(items, items.length) : null;
    }

    public void addItem(T item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    public T getItem(int index) {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException("Index are out of bounds");
        }

        return items[index];
    }

    public int getItemCount() {
        return items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
