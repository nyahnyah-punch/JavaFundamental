package java_20200514;

public class TwoArrayDemo {

	public static void main(String[] arga) {
		
		//배열 선언 및 생성 - 3차원배열도 똑같다 int[3][2][4] 지하철 최단거리 구할 때 씀 ㅋㅋ
		int [][] a = new int[3][2]; //a라는 층 3개에 방이 2개씩 =>6개
		//배열 할당
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b = {{10,20},{30,40},{50,60}}; //위에랑 얘랑 같은거 
		
		//배열 출력
		for (int i=0; i<a.length; i++) {//a의 0번째부터
			for(int j=0; j<a[i].length;j++) {//여기를 fix할 수 없다 
				System.out.println(a[i][j]);
			}
		}
	}
}
