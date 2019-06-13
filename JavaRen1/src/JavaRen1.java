import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaRen1{
    public static void main(String args[]) throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int dt[]={68,80,75,63,97,45};
        int sum=0,i;
        double avg;
        for(i=0;i<6;i++){
            sum = sum + dt[i];
        }
        avg=sum/6;

    System.out.print(avg);
    System.out.print(sum);
    }
}