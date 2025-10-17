package oopsconcepts.inhertance.multilevel;

public class PropertyRegistry {
    public static void main(String[] args) {
        Child child = new Child();
        child.education();
        child.earningWithJewelleryShop();
        child.earningWithJewelleryShop();
        child.wealthWithIceCreamFactoryBusiness();
        child.ancestralProperty();

        Father father = new Father();
        father.earningWithJewelleryShop();
        father.ancestralProperty();
        father.wealthWithIceCreamFactoryBusiness();

        GrandFather grandFather = new GrandFather();
        grandFather.ancestralProperty();
        grandFather.wealthWithIceCreamFactoryBusiness();
    }
}
