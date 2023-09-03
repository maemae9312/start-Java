class Loop3 {
    public static void main (String[] args) {
        int[] score = {80,100,75,30};
    
        String[] name = {"月野","剣持","佐々木","葛葉"};
    
        for (int i = 0; i < score.length; i++) {
            System.out.println(name[i] + "さん" +score[i] + "点");
        }
        System.out.println("受験者数: " + score.length + "名");
    }
}
