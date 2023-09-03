class Array {
    public static void main (String[] args) {
        int[] score = {80,100,75,30};

        String[] name = {"月野","剣持","佐々木","葛葉"};

        System.out.println(name[0] + "さん:" + score[0] + "点");
        System.out.println(name[1] + "さん:" + score[1] + "点");
        System.out.println(name[2] + "さん:" + score[2] + "点");
        System.out.println(name[3] + "さん:" + score[3] + "点");
        System.out.println("受験者数:" + score.length + "名");
    }
}
