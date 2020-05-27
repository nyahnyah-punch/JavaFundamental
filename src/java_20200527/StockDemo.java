package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StockDemo {

	public static void main(String[] args) {
		
		Document doc = null;
		String url = "https://finance.naver.com/item/sise_day.nhn?code=005930";
		
		try {
			doc = Jsoup.connect(url).get();
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("삼성전자 주식!");
		System.out.println("");
		
		System.out.println("날자\t\t종가\t전일비\t시가\t고가\t저가\t거래량");
		System.out.println("------------------------------------------------------------------");
		
		Elements trElements = doc.select(".type2 tr");
		
		for(int i=0; i<trElements.size(); i++) {
			//공백 여섯개는 컨티뉴로 카운트 해주기
			if(i==0 || i ==1 || i ==7 || i==8 || i==9 || i ==15) continue;
			Element trElement = trElements.get(i);
			
			String time = trElement.child(0).text();
			String price = trElement.child(1).text();
			String compare = trElement.child(2).text();
			String sell = trElement.child(3).text();
			String buy = trElement.child(4).text();
			String amount = trElement.child(5).text();
			String difference = trElement.child(6).text();
			
			System.out.println(time+"\t"+price+"\t"+compare+"\t"+sell+"\t"+buy+"\t"+amount+"\t"+difference);
			
		}

	}

}
