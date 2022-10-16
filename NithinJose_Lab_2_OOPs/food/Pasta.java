package food;
import java.util.*;

public class Pasta extends MenuItem {
    
    PastaSauce sauce;
    PastaType type;

    Map<PastaSauce, Integer> saucePriceMap
                = new HashMap<PastaSauce, Integer>();
    
    Pasta(
        PastaType type, PastaSauce sauce
    ){
        saucePriceMap.put(PastaSauce.White, 10);
        saucePriceMap.put(PastaSauce.Red, 20);
        this.sauce = sauce;
        this.type = type;
    }

    public int getPrice() {
        
        int price = super.getPrice();
        price += saucePriceMap.get(this.sauce);

        return price;
    }
}
