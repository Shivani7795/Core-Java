package string;

public class Length {
    public static void main(String[] args) {
        String name = "Shivani";
        String extend = "A";
        System.out.println("Name:" + name);
        System.out.println("Full Name:"+name +extend);
        String same_name = "ShivaniA";
        String again_same = "ShivaniA";

        if(same_name==again_same){
            System.out.println("matching");
        }
        else{
            System.out.println("not matching");
        }
    }
}
