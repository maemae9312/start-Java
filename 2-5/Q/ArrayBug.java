class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[5];
    
    name[0] = "月野";
    name[1] = "楓";
    name[2] = "葛葉";
    name[3] = "社";
    name[4] = "佐々木";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
