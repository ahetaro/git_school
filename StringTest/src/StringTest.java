import java.io.IOException;

//     public static void main(String args[]) {
//     int dt[] = {15, 35, 86, 48, 93};//適当な値の配列
//     int i, sum = 0; //カウンタ、合計用
//     String msg; //出力メッセージ用
//     msg = "数値: "; //msgに「数値 : 」を入れる
//     for(i = 0; i < 5; i++){ //配列全要素に対するループ
//     sum = sum + dt[i]; //sumに値を加えていく
//     msg = msg + dt[i] + "、"; //msgに数値を文字列化して連結*1
// }
//     System.out.println(msg + "の合計は" + sum + "です");
// } //↑さらに合計ﾒｯｾｰｼﾞを連結して出力
// }
class StringTest{
public static void main(String args[]) throws IOException {
int dt[] = {15, 35, 86, 48, 93};//適当な値の配列
int i, sum = 0, avg; //カウンタ、合計用、平均用
String msg; //出力メッセージ用
msg = "数値: "; //msgに「数値 : 」を入れる
System.out.println(msg + "の合計は" + sum + "です");
avg = (int)(sum / 5.0); //平均を int型で計算する*3
System.out.println(msg + "の平均は" + avg + "です");
} //↑平均ﾒｯｾｰｼﾞを連結して出力
}
