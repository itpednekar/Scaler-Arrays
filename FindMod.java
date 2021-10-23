//Problem asked in google
public class MyClass {
    public static void main(String args[]) {
        String str = " ";
        int p = 7;
        Integer mod = 0;
        for(int i=0; i<str.length(); i++){
            String num = mod.toString() + str.charAt(i);
            mod = Integer.parseInt(num) % p;
        }
        System.out.println(mod);
    }
}
