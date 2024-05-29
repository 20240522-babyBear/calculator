package exsersice.review.create.object.subproject;

public class Barista {
    /*
     * 주문에 따라 커피를 만들어야함.
     * */
    private static int coffeeStock = 5000; // 5000g 커피보유

    public Coffee[] makeCoffee(Order order) {

        // 재고 차감 처리 - 커피한잔에 20g 사용


        // 커피 생성

        Coffee[] coffees = new Coffee[order.getCount()];

        if (coffeeStock >= order.getCount() * 20) {

            coffeeStock = coffeeStock - order.getCount() * 20;
            for (int i = 0; i < coffees.length; i++) {

                coffees[i] = new Coffee(order.getMenuName(), order.getOption());


            }
            return coffees;
        } else {
            System.out.println("[바리스타] : 커피가루를 충전해주세요!!!!");
            return null;
        }

    }
}