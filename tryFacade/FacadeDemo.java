package tryFacade;

public class FacadeDemo {
  public static void main(String[] args) {
    Sports2000Facade facadeWrapperObject = new Sports2000Facade(true, 100);
    facadeWrapperObject.displayItems();
    facadeWrapperObject.displayAmount();
  }
}