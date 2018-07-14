package example10;

public class WaitressTest {

    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("DinnerMenu","Lunch");
        MenuComponent dessertMenu = new Menu("DessertMenu","Dessert of Course");
        MenuComponent subMenu = new Menu("SubMenu","副食");


        MenuComponent allMenus = new Menu("AllMenu","All of food");
        dinnerMenu.add(new MenuItem("汉堡","热量高",false,3.88));
        dinnerMenu.add(new MenuItem("肉丝炒面","山西特色",false,10.00));
        dinnerMenu.add(new MenuItem("烧鹅腿","双拼饭",false,11.00));
        dinnerMenu.add(new MenuItem("油麦菜","青菜",true,11.00));

        allMenus.add(dinnerMenu);

        dessertMenu.add(new MenuItem("小脆筒","奶油",false,3.00));
        dessertMenu.add(new MenuItem("芝士蛋挞","鸡蛋",false,2.50));

        dinnerMenu.add(dessertMenu);

        subMenu.add(new MenuItem("辣条","卫龙产品",false,0.5));
        dessertMenu.add(subMenu);

        Waitress waitress = new Waitress(allMenus);


        waitress.printMenu();
        waitress.printVegetableMenu();





    }


}
