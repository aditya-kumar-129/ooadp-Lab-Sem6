interface CalculateTax {
    float taxAmount(int qty, float price);
}

class GST implements CalculateTax {
    public float taxAmount(int qty, float price) {
        return qty * price * 0.18f;
    }
}

class MauriTaxAdapter implements CalculateTax {
    MauriTax mauriTaxObject = new MauriTax();
    public float taxAmount(int qty, float price) {
        return mauriTaxObject.mauriTaxAmount(qty, price);
    }
}

// it doesn’t match your CalculateTax interface.
class MauriTax {
    float mauriTaxAmount(int qty, float price) {
        return qty * price * 0.1f;
    }
}

class Item {
    String name;
    int quantity;
    float price;
    CalculateTax calculateTaxObject;

    public Item(String name, int quantity, float price, CalculateTax calculateTaxObject) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.calculateTaxObject = calculateTaxObject;
    }

    void setTax(CalculateTax calculateTaxObject) {
        this.calculateTaxObject = calculateTaxObject;
    }

    void displayItem() {
        System.out.println("Name: " + name + " Quantity: " + quantity + " Price: " + price);
        float tax = calculateTaxObject.taxAmount(quantity, price);
        float billAmount = (quantity * price) + tax;
        System.out.println("Tax Amount: " + tax + " Bill Amount: " + billAmount);
    }
}

class AdapterDesignPattern {
    public static void main(String[] args) {
        // Runtime polymorphism is used here
        CalculateTax calcTaxObject = new MauriTaxAdapter();
        Item itemObject = new Item("cycle", 2, 100, calcTaxObject);
        itemObject.displayItem();

        // here we are calling for the second time
        itemObject.setTax(new GST());
        itemObject.displayItem();
    }
}