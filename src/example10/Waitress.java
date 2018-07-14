package example10;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }


    public void printMenu(){
        allMenu.print();
    }

    public void printVegetableMenu(){

        Iterator iterator = allMenu.createIterator();

        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetable()) {
                    menuComponent.print();
                }else {
                    System.out.println("吃的真多!");
                }
            }catch (UnsupportedOperationException e){

            }
        }

    }
}
