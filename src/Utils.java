import java.util.Locale;

public class Utils {
    public static String chuanHoaXau(String s){
        //1 xoa di cac cai space o dau va cuoi cua chuoi
        s = s.trim();
        s = s.replaceAll("\\s+"," ");
        return s;
    }

    public static String extractLastName(String s){
        s = chuanHoaXau(s);
        String[] words = s.split(" ");
        String lastName = words[0];
        return lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    public static String extractFirstName(String s){
        s = chuanHoaXau(s);
        String[] words = s.split(" ");
        String firstName = words[words.length - 1];
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    public static String extractMiddleName(String s){
        s = chuanHoaXau(s);
        String[] words = s.split(" ");
        String middleName = "";
        for(int i = 1; i <= words.length - 2 ; i ++){
            String temp = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            middleName += temp + " ";
        }

        return middleName;
//        return  null
    }

}
