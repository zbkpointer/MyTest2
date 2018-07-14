package example07;

public class ChocolateBoiled {
    private static boolean empty;
    private static boolean boiled;
    private static ChocolateBoiled chocolateBoiled;

    private ChocolateBoiled(){
        empty = true;
        boiled = false;
    }

    public synchronized static ChocolateBoiled getChocolateBoiled() {
        if (chocolateBoiled == null){
            chocolateBoiled = new ChocolateBoiled();
            System.out.println(chocolateBoiled.toString());
            return chocolateBoiled;
        }else {

            System.out.println(chocolateBoiled.toString());
            return chocolateBoiled;

        }
    }

    public void fill(){
        if(isEmpty()){
            empty =false;
            boiled =false;
        }
    }
    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            boiled =true;
        }
    }

    public void drain(){
        if (!isEmpty()&&isBoiled()){
            empty =true;
        }
    }


    public static boolean isEmpty(){
        return empty;
    }

    public static boolean isBoiled(){
        return boiled;
    }

}
