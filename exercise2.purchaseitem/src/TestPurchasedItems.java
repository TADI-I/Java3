import exercise2.purchaseitem.weigheditem.WeighedItem.WeighedItem;
import exercise2.purchaseitem.counteditem.CountedItem.CountedItem;
import javax.swing.JOptionPane;
public class TestPurchasedItems {
    public static void main(String[] args) {
    
        WeighedItem item = new WeighedItem(1.23,
                "Banana",
                5.0);
        
        JOptionPane.showMessageDialog(null,
                item.toString());
        
      CountedItem count = new CountedItem(5,
            "Sweets",
            1.5);
      JOptionPane.showMessageDialog(null,
                count.toString());

//This way wont work becuse there is no set weight in the jar file
//    String info = JOptionPane.showInputDialog("Enter product name ,price");
//    String[] split = info.split(" ");
//    WeighedItem item = new WeighedItem();
//    item.setName(split[0]);
//    item.setUnitPrice(Double.parseDouble(split[1]));
//    
//    JOptionPane.showMessageDialog(null,
//                item.toString());
}
}
