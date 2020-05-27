package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {

	public static void main(String[] args) {
		
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("주요뉴스 출력 성공!");
		
		Elements elements = doc.select(".home_news_list li");
		
		for(int i = 0; i < elements.size(); i++) {
			
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
			
		}
		
		
		/*
		String url = "http://www.imbc.com/";
		
		//HTML문서 전체를 관리하기 위한 문서 
		Document doc = null;
		
		try {
			//url로 연결하여 html정보를 get방식으로 가져온다 
			doc = Jsoup.connect(url).get();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("성공...!");
		
		//가지고오고싶은 정보의 위치를 정확히 입력
		// . -> 클래스 이름 가지고 올 때
		// # -> id정보를 가지고 올 때 
		// li정보를 가지고 오고싶으면 한칸 띠고 뒤에 li붙혀주기 
		Elements elements = doc.select(".notice-list li");
		
		//li가 여러개 있음으로 for문 돌려서 하나씩 빼와야함
		for(int i = 0; i < elements.size(); i++) {
			
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
			
		}
		*/

	}
}
