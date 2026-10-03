public class Practice318 {
    public static void main(String[] args) {
        int min = -10;
        int max = 35;
        int num = (int)(Math.random() * (max - min +1)) + min;
        System.out.println("摂氏" + num + "度");
        if(num >= 30){
            System.out.println("真夏日です。");
        }else if(num > 30  && num <= 25){
            System.out.println("夏日です。");
        }else if(num < 0 )
            System.out.println("真冬日です。");
    }
}
