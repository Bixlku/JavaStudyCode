public class Test1 {
    String str = new String("hsp");
    char[] ch = {'j','a','v','a'};
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+" and ");
        System.out.println(ex.ch);
    }

    public void change(String str,char[] ch){
        str = "java";
        ch[0] = 'h';
    }
}