package dependencyinversion;

interface DataSource {
    void connect();
    void disconnect();
}


class MySQLDataSource implements DataSource {
    @Override
    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }
}

class OrderService {
    private DataSource dataSource;

    public OrderService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void placeOrder() {
        dataSource.connect();
        // process order
        dataSource.disconnect();
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new MySQLDataSource());

        orderService.placeOrder();
    }
}
