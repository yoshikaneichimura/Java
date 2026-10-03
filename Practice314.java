public class Practice314 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*10)+1;
        int b = (int)(Math.random()*10)+1;
        System.out.println("a=" + a + " b=" + b);
        if(a > b){
            System.out.println("aの方が大きいです。");
        }else if(a < b){
            System.out.println("bの方が大きいです。");
        }else if(a == b){
            System.out.println("等しいです。");
        }
    }    
}
