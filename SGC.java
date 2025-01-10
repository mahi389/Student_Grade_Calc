import java.util.Scanner;
public class SGC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************Student grade Calculator*******************");
        System.out.println("Enter the number of subjects:");
        int s = sc.nextInt();
        int total = 0;
        System.out.println("enter the marks obtained in" + s + " subjects respectively:");
        for (int i = 0; i < s; i++) {
            int marks = sc.nextInt();
            total = total + marks;
        }
        double AP = (double) total / s;
        String Grade;
        if (AP >= 98) {
            Grade = "A+";
        } else if (AP >= 88) {
            Grade = "A";
        } else if (AP >= 70) {
            Grade = "8";
        } else if (AP >= 60) {
            Grade = "C";
        } else if (AP >= 50){
        Grade = "D";
        }
        else{
        Grade = "fail(f)";
    }
        System.out.println("Total marks = "+total);
         System.out.println("Average percentage= "+AP+"%");
          System.out.println("Grade is: = "+Grade);
    }
}


