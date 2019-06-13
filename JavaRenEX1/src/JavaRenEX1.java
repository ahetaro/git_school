import java.io.IOException;
class JavaRenEX1{
public static void main(String args[]) throws IOException{
//BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

int i,j,h;
String hage[][][] = new String[3][5][5]; //h[]横　
										  //j[][]縦　
										  //i[][][]左二つの個数
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				for(h=0;h<5;h++) {
//					if(h==4) {
//						hage[i][j][h]="◇";
//					}else {
						hage[i][j][h]="■";
					}
				}
		}
				for(i=0;i<3;i++) {
					for(j=0;j<5;j++) {
						for(h=0;h<5;h++) {
							System.out.print(hage[i][j][h]);
						}
						System.out.print("\r\n");
					}
						System.out.print("\r\n");
					}
				}
		}

