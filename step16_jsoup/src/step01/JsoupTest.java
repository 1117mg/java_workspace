package step01;

import java.io.IOException;
import java.sql.SQLException;
//import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import news.dao.NewsDAO;
import news.dto.News;

public class JsoupTest {
	public static void main(String[] args) {
		Document doc = null;
		/*
		 	step01 : https://en.wikipedia.org/wiki/Main_Page
			
			https://en.wikipedia.org/wiki/2023_Prague_shooting
			https://en.wikipedia.org/wiki/Fiducia_supplicans
			https://en.wikipedia.org/wiki/2023_Sundhn%C3%BAkur_eruption
			https://en.wikipedia.org/wiki/2023_Jishishan_earthquake
			https://en.wikipedia.org/wiki/2023_Serbian_parliamentary_election
		 */
		try {
			doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
			// Element, Elements 
//			System.out.println(doc.getElementById("mp-welcome"));
//			System.out.println(doc.select("#mp-itn > ul > li:nth-child(1) > b > a").get(0).absUrl("href"));
//			System.out.println(doc.select("#mp-itn > ul > li:nth-child(2) > b > a").get(0).absUrl("href"));
//			System.out.println(doc.select("#mp-itn > ul > li:nth-child(3) > b > a").get(0).absUrl("href"));
//			System.out.println(doc.select("#mp-itn > ul > li:nth-child(4) > b > a").get(0).absUrl("href"));
//			System.out.println(doc.select("#mp-itn > ul > li:nth-child(5) > b > a").get(0).absUrl("href"));
			
			
//			System.out.println(doc.select("#mp-itn > ul > li > b > a"));
//			Elements news = doc.select("#mp-itn > ul > li > b > a");
//			for(Element title : news) {
//				System.out.println(title.absUrl("href"));
//			}
			
			/*
			 	step02 : https://www.w3schools.com/java/default.asp
			 	
				Examples in Each Chapter 	:	#main > h2:nth-child(6)
											    //*[@id="main"]/h2[1]
				Java Exercises				:	#main > h2:nth-child(12)
												//*[@id="main"]/h2[2]
				Java Quiz					:	#main > h2:nth-child(17)
				Learn by Examples			:	#main > h2:nth-child(21)	
				My Learning					:	#main > h2:nth-child(26)
				Java Reference				:	#main > h2:nth-child(33)
				Download Java	 			:	#main > h2:nth-child(38)
												//*[@id="main"]/h2[7]
												
			 */
//			doc = Jsoup.connect("https://www.w3schools.com/java/default.asp").get();
//			Elements titles = doc.select("#main > h2");
//			Elements titles = doc.selectXpath("//*[@id=\"main\"]/h2");
//			for(Element title : titles) {
//				System.out.println(title.text());
//			}
			
			
			/*
			 	step03 : https://sports.news.naver.com/wfootball/index.nhn
				
				// step01 --> step02 : jdbc
				
				news
				title varchar(???)  : 異뺢뎄 �궛���뒗 �넀�씎誘쇱씪源� �솴�씗李ъ씪源뚢���꽦�깂 �븵�몢怨� 由대젅�씠 異쒓꺽
				url (text)   		: https://sports.news.naver.com/news?oid=081&aid=0003418614
				
				留⑥쑀�� 洹몃┛�슦�뱶 �씤�뿰 �쓲�젮吏덉닔濡앪���젅�븣-ATM�쓽 �늿移� 寃뚯엫 �냽�룄�룄 鍮⑤씪吏��꽕
				https://sports.news.naver.com/news?oid=477&aid=0000465345
				
			 */
				doc = Jsoup.connect("https://sports.news.naver.com/wfootball/index.nhn").get();
				/*
					.home_news li a
				 */
				
				Elements news = doc.select(".home_news li a");
				for(Element article : news) {
					try {
						NewsDAO.insertDept(new News(article.text(), article.absUrl("href")));
					} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					}
				}
				
//				for(int i = 0; i < news.size(); i++) {
//					try {
//						NewsDAO.insertDept(new News(news.get(i).text(), news.get(i).absUrl("href")));
//					} catch (ClassNotFoundException | SQLException e) {
//						e.printStackTrace();
//					}
//				}
				
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
