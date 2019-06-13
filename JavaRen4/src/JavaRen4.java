import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class JavaRen4{
    public static void main(String args[])throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("全角文字１文字入力:");
        String mark = "";
        while(mark.length() != 1){
            mark = bin.readLine();
            	if(mark.length() != 1) {
            		System.out.print("1文字だけ入力してください");
            	}
        }
        System.out.print("サイズを入力:");
        int size = Integer.parseInt(bin.readLine());
        String buf = "";
        int width = size +1; //size=5の時width=6
        int cnt = size-1;	  //size=5の時cnt=4
        for(int j=1;j <=size; j++){
            for(int i=1; i<=size*2-1; i++){
            	if(cnt < i&i< width) {
            	    buf = buf + mark;
            }else{
            		buf = buf + "□";
           }
          }
            buf = buf + "\r\n";
            cnt = cnt-1;
            width=width+1;
    }
        System.out.print(buf);
}
}

//ピラミッドになるときは4<i<6 ,3<8, 2<i<10, 1<i<12