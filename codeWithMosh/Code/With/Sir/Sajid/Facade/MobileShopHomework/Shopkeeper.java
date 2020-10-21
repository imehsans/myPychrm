package Code.With.Sir.Sajid.Facade.MobileShopHomework;

public class Shopkeeper {
    private MobileShop iphone;
    private MobileShop samsang;
    private  MobileShop blackBerry;

    public Shopkeeper() {
        this.iphone = new Iphone();
        this.samsang = new Samsung();
        this.blackBerry = new  BlackBerry();
    }

    public void sellIphone(){
        iphone.modelNo();
        iphone.price();
    }

    public void sellSamsung(){
        samsang.modelNo();
        samsang.price();
    }

    public void sellBlackBerry(){
        blackBerry.modelNo();
        blackBerry.price();
    }
}
