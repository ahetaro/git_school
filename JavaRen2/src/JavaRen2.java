import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaRen2{
    public static void main(String args[]) throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        String box="";
        for(int i=1; i<=10; i++){
            for(int j=1; j<6; j++){
            	if(i % 2 ==0) {
            	box = box + "□" + "■";
            		}else {
            			box = box + "■"+"□";
            		}
            	}
            		box = box + "\r\n";
        		}
        			System.out.print(box);
        	}
    }