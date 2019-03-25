public class quiz4 {
public static void main(String[] args) {
	for(int i =0; i < 100; i ++) {
		int six = 0;
		if (i % 6 == 0) {
			six = six + i;
			System.out.println("6의 배수는 : " + six);
		}
		
	}
}
}



//입력받은 숫자를 6의배수로 출력 메소드생성
//public class quiz4{
// public void doCheck(int nubmer1){
//if(number1 % 6 ==0){
//sysout "6의배수입니다.
//{else{
//sysout"6의배수가 아닙니다"
//----------------------------------------------
//public class quiz5 {
//public static void main(String[] args) {
//quiz4 c1 = new quiz4();
//for (int i = 0; i < 100 ; i++){
//c1.doCheck(i+1);
//
/*---2main---
public class quiz4{
 public boolean doCheck(int nubmer1){
if(number1 % 6 ==0){
//sysout "6의배수입니다.
return true;
{else{
//sysout"6의배수가 아닙니다"
return False;
 
//----------------------------------------------
//public class quiz5 {
//public static void main(String[] args) {
//quiz4 c1 = new quiz4();
//sysout ("6의배수는");
//for (int i = 0; i < 100 ; i++){
//boolean result = c1.doCheck(checkNumber); --> (i+1) 
//if (result);
//sysout("" + (checkNumber))

*/