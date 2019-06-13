import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class JavaRen3{
public static void main(String args[]) throws IOException{
BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
String msg; // 出力メッセージ用
double height, weight; // 身長、標準体重格納用
System.out.print("氏名を入力: ");
msg = bin.readLine();
System.out.print("身長を入力: ");
height = Integer.parseInt(bin.readLine());
System.out.print(msg+"さんの標準体重は");
weight = (height - 100) * 0.9; // 標体重を計算
msg = weight + "kg";
System.out.print(msg);
System.out.print("です");
// ●msgに"さんの標準体重は" という文字列を追加(連結)
// ●height ← キーボードから１行入力し実数に変換 // 身長の入力
// ●msgにweightの値と"kgです" という文字列を追加(連結)
// ●msgに格納されている文字列を出力(改行付き)
}
}
