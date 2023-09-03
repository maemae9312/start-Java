class Comparison{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    //大きい方の値を表示
    if (a > b){
      System.out.println("The larger number is: " + a);
    } else if(a < b) {
      System.out.println("The larger number is: " + b);
    } else {
      System.out.println("Both numbers are equal.");
    }

  }
}
