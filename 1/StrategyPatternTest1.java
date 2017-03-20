public class StrategyPatternTest1 {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

      //instead of inherite the function of operation, we keluarkan each method /behavior
      //assign them to interface.

      //now we can share behavior/algorith cross border.
      //inheritance can be view as tree.
      //work well if we want to share downward.
   }
}