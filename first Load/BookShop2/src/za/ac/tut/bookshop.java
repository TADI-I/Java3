
package za.ac.tut;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.comicnovel.ComicNovel;


/**
 *
 * @author tadiw
 */
public class bookshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] bookInfo = {"The Stupidest Angel#2#CM002",
								"Vile Bodies#8#EW008",
								"Cold Comfort Farm#1#SG001",
								"Lightning Rods#2#HDW002",
								"A Complicated Kindness#1#MT001",
								"Auntie Mame#9#PD009",
								"Catch-22#5#JH005",
								"The Color of Magic#1#TP001",
								"Lucky Jim#3#KA003"};
        ArrayList<ComicNovel> books = new ArrayList<>();
      
        for(int i = 0 ; i < bookInfo.length ; i++){
            String[] info = bookInfo[i].split("#");
            
            String title = info[0];
            int volume = Integer.parseInt(info[1]);
            String code = info[2];
            
            ComicNovel obj = new ComicNovel(title,volume,code);
            books.add(obj);
                  
        }
        String list = globalDetails(books);
        JOptionPane.showMessageDialog(null,
                list);
        String lookup = JOptionPane.showInputDialog("Enter the code of a comic:");
        
        boolean first = isFirstEdition(books,
                lookup);
        
        if (first == true)
            lookup += " is a first edition and is a collectors item";
        else
            lookup += " is NOT a first edition so is not a collectors item";
        
        JOptionPane.showMessageDialog(null,
                lookup);
        
    }
    
    public static boolean isFirstEdition(ArrayList<ComicNovel> novels,String lookup){
        boolean first = false;
        
        for(int i = 0 ; i< novels.size() ; i++){
        ComicNovel obj = novels.get(i);
        
        if(lookup.equalsIgnoreCase(obj.getTitle())){
            first = obj.getVolume() == 1;
        }
        }
        return first;
    }
    
     public static String globalDetails(ArrayList<ComicNovel> novels){
          String books = "The list of comic novels with its search codes:\n===============================================";
          
          
          for(int i = 0 ; i< novels.size() ; i++){
              ComicNovel obj = novels.get(i);
              books += "\n" + obj.getTitle() + " =>" + obj.getCode(); 
          }
         return books;
     }
    
}
