import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class JavaRen5{
public static void main(String args[]) throws IOException{
BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
String name[];
int score[];
int cnt,maxIdx,i;
System.out.print("クラスの人数を入力：");
cnt = Integer.parseInt(bin.readLine());
name = new String[cnt];
score = new int[cnt];
// System.out.print(cnt);
    for(i=0; i < cnt; i++){
        System.out.print("氏名を入力");
        name[i] = bin.readLine();
        System.out.print("得点を入力");
        score[i] = Integer.parseInt(bin.readLine());
    }
    maxIdx=0;
    for(i=0;i<score.length;i++){
        if(score[i] > score[maxIdx]){ //もっと高得点の学生がいたら
            maxIdx = i;
    }
}
System.out.print("最高得点は"+name[maxIdx]+"さんの"+score[maxIdx]+"です");
}
}