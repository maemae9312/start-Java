public class DataType {
    public static void main (String[] args) {
        int month = 8;
        int day = 12;
        // float型の場合、fを忘れるとコンパイルエラーになる
        float weight = 89.0f;
        double height = 178.6;
        char bloodType = 'O';

        String name = "月野";

        System.out.println("こんにちは！" + name + "です。");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg。");
        System.out.println("誕生日は" + month + "月" + day +"日");
        System.out.println("血液型は" + bloodType + "型です");
    }
}
