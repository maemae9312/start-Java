class LoopMessage{
  public static void main(String[] args){
    //メッセージを10回表示
    int messageCount = 1;
    while(messageCount <= 10) {
      System.out.println("message to " + messageCount);
      messageCount++;
    }
  }
}
