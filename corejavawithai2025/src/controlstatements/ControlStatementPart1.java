package controlstatements;

public class ControlStatementPart1 {
    public static void main(String[] args) {
        int orderItemNo = 40;
        // switch-case statements
        // break -
        switch (orderItemNo) {
            case 1:
                System.out.println("Tofu");
                break;
            case 2:
                System.out.println("Broccoli");
                break;
            case 3:
                System.out.println("French fries");
                break;
            case 4:
                System.out.println("Pizza");
                break;
            case 40:
                System.out.println("Indian Masala Dosa");
                break;
            default:
                System.out.println("Salad & Water");
                break;
        }
    }
}
