package JavaProgram.lab1;
class incdec {
    public static void main(String[] args) {
        float var1 = 5, var2 = 5,var3 = 3,var4=3;
        float postfixinc=var1++;
        float postfixdec=var2--;
        float prefixinc=++var3;
        float prefixdec=--var4;
        System.out.println("postfix increment="+postfixinc);
        System.out.println("postfix decrement="+postfixdec);
        
        System.out.println("prefix increment="+prefixinc);
        System.out.println("prefix decrement="+prefixdec);
    }
}
