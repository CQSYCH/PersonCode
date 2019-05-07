package tk.mybatis.web.tool;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Base64Tran {
    public static void main(String[] args){
        System.out.println(Base64Tran.encryptString("123456789"));
    }
    public static String encryptString(final String str){
        String b64= Base64.encode(str.getBytes());
        b64=Base64Tran.key(b64);
        return b64;
    }
    private static String key(final String b64){
        final String key=b64.substring(0,2);
        final String keyTmp=Base64Tran.reverse(key);
        return b64.replaceFirst(key,keyTmp);
    }
    private static String reverse(final String str){
        final int length=str.length();
        String reverse="";
        for(int i=0;i<length;i++){
            reverse=str.charAt(i)+reverse;
        }
        return reverse;
    }
}
