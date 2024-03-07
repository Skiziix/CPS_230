public class Driver {
    public static void main(String[] args) {
        Month month;
        try {
            month = new Month("January");
            System.out.println("\n\n" + month);

        } catch (InvalidMonthName e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
