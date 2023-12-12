public class President {
    private static President thePresident;
    public static President getThePresident() {
        if (thePresident ==null) thePresident =new President();
        return thePresident;
    }
    private President() {

    }
}
