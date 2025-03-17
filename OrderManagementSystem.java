// Superclass Order
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status (to be overridden)
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

// Subclass ShippedOrder (Extends Order)
class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}

// Subclass DeliveredOrder (Extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

// Main class
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different order statuses
        Order order = new Order("123", "2025-03-15");
        ShippedOrder shippedOrder = new ShippedOrder("124", "2025-03-14", "56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("125", "2025-03-13", "98765", "2025-03-16");

        // Displaying order details
        System.out.println("Order Details:");
        System.out.println();
        order.displayOrderDetails();
        System.out.println();
        shippedOrder.displayOrderDetails();
        System.out.println();
        deliveredOrder.displayOrderDetails();
    }
}

//SampleOutput
//Order Details:
//
//Order ID: 123
//Order Date: 2025-03-15
//Order Status: Order Placed
//
//Order ID: 124
//Order Date: 2025-03-14
//Order Status: Shipped (Tracking: 56789)
//
//Order ID: 125
//Order Date: 2025-03-13
//Order Status: Delivered on 2025-03-16