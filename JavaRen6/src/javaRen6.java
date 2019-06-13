import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class JavaRen6{
public static void main(String args[]) throws IOException{
BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));


int j,h,line,column;
String board2[][] = new String[5][7];
line = board2.length;
column =  board2[0].length;

	for(j=0;j<board2.length;j++) {
		for(h=0;h<board2[0].length;h++) {
			if(j==0||j==line-1) {
				board2[j][h]="■";
			}else if(h==0||h==column-1){
				board2[j][h]="■";
			}else {
				board2[j][h]="□";
			}
		}
	}

	for(j=0;j<board2.length;j++) {
		for(h=0;h<board2[0].length;h++) {
			System.out.print(board2[j][h]);
		}
			System.out.print("\r\n");
		}
	System.out.print("縦の長さ"+"　"+board2.length+"\r\n");
	System.out.print("横の長さ"+"　"+board2[0].length);
	}
}









//System.out.print(board[0].length);


