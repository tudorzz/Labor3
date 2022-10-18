import java.util.Arrays;

public class ProduktController {

    public int add(Produkt[] list) {
        int sum = 0;
        for (Produkt prod : list) {
            prod.addRabatt();
            sum += prod.getBasispreis();
        }
        return sum;
    }
    public Produkt[] filter(Produkt[] list){
        int index=0;
        Produkt[] filtered= new Produkt[100];

        for(Produkt prod:list){
            prod.addRabatt();
            if(prod.getBasispreis()>100)
                filtered[index++]=prod;
        }
        return filtered;
    }

    public void sorted(Produkt[] list){
        for(Produkt prod:list)
            prod.addRabatt();

        Arrays.sort(list,(prod1,prod2)->{
            if(prod1.getBasispreis()>=prod2.getBasispreis())
                return 0;
            return 1;
        });
    }

    public Produkt findMax(Produkt[] list){
        Produkt max=new Produkt(Float.MIN_VALUE,Integer.MIN_VALUE);

        for(Produkt prod: list){
            if(prod.getBasispreis() > max.getBasispreis())
                max=prod;
        }
        return max;
    }

    public Produkt findMin(Produkt[] list){
        Produkt min=new Produkt(Float.MIN_VALUE,Integer.MAX_VALUE);

        for(Produkt prod: list){
            if(prod.getBasispreis() < min.getBasispreis())
                min=prod;
        }
        return min;
    }
}
