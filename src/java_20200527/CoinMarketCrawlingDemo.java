package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCrawlingDemo {
	
	public static void main(String[] args) {
		
//		문자열 더블로 바꾸기(번외편)
		String test = "6,909.45".replaceAll(",","");
		double d = Double.parseDouble(test);
		System.out.println(d);
		
		//반대로 3자리 단위로 콤마 다시 찍어주기
		String test1 = String.format("%,.2f", d); //콤마 찍고 소수 둘째자리까지
		System.out.println(test1);
		//
		
//		파일로 저장해보기
		//이미 다 읽어와서 리더는 필요없다
		FileWriter fw = null; 
		//단점: 개행 표시가 귀찮다 = 버퍼드로 감싸 (프린트로 감싸면 플러시도 필요없징)
		
//		비트코인 모니터출력
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200521&end=20200527";
		
		Document doc = null;
		
		try { //전체를 try/catch로 묶어주기  
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin.txt");
			
			
			System.out.println("비트코인 '-'\n");
			System.out.println();
			
			fw.write("비트코인 '-'\n");
			fw.write("\n");
			
			//table 밑에 tr가져오기 (tr하나가 한줄)
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
			
			System.out.println("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래가\t\t총량");
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			
			fw.write("날짜\t\t시가\t고가\t저가\t종가\t거래가\t\t총량\n");
			fw.write("------------------------------------------------------------------------------------------------------\n");
			
			//한줄한줄 뽑지말고 바로 뽑아오기
			//2중 for문 말고바로 택스트로 뽑아오기
			//변수처리를 할 수 있고 앨리먼트 하나하나에 다양한 변화를 줄 수 있다
			for(int i=0; i<trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text(); 
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				
				//화면출력
				System.out.println(date+"\t"+ open+"\t"+ high +"\t"+low +"\t"+close+"\t"+volume+"\t"+marketCap);
				
				//파일로 출력
					fw.write(date+"\t"+ open+"\t"+ high +"\t"+low +"\t"+close+"\t"+volume+"\t"+marketCap+"\n");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
				try {
					if(fw != null) fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				}
			
		}
			
		
		/*
		//얘는 디스플레이용으론 괜찮음
		for(int i = 0; i < trElements.size(); i++) {
			Element trElement = trElements.get(i);
			
			//tr밑에 td가 하나 더 있음으로 for문 두개 돌려주기
			Elements tdElements = trElement.select("td");
			
			for (int j = 0; j < tdElements.size(); j++) {
				Element tdElement = tdElements.get(j);
				System.out.print(tdElement.text() + "\t");
				
			}
			System.out.println(); //한줄 끝나면 개행 
			
		}
		
		 */
		
		
	}
}
