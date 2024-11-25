package L02;

public class Mainn {

    public static void main(String[] args) {
        String str = "abcdefg";
        int size = str.length();
        int i=0;
        while(i<size){
            if(str.charAt(i)=='d'){
                System.out.println("Ok");
                break;
            }
            i++;
        }
        if(i==size)
            System.out.println("not OK");

        String str2 = "abcefg";
        str2+="d";
        int i2 = 0;
        int size2 = str2.length();
        while(str2.charAt(i2)!='d'){
            i++;
        }
        if(i==size)
            System.out.println("not OK");
        else
            System.out.println("Ok");

    }
}
