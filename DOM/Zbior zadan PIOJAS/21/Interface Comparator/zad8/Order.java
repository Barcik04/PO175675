package zad8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Order {
    private int id;
    private String customerName;
    private LocalDate orderDate;

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "id: " + id + ", customerName: " + customerName + ", orderDate: " + orderDate;
    }

    public static class ComparatorOrder implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            int result = o1.getOrderDate().compareTo(o2.getOrderDate());
            if (result == 0) {
                return Integer.compare(o1.getId(), o2.getId());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "John Doe", LocalDate.of(1990, 1, 1)));
        orders.add(new Order(2, "Bob Ross", LocalDate.of(1991, 12, 18)));
        orders.add(new Order(0, "Jill WIlliams", LocalDate.of(1990, 1, 1)));

        orders.sort(new ComparatorOrder());

        for (Order ord : orders) {
            System.out.println(ord);
        }
    }
}
