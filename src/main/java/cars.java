import org.jsoup.Jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Shafayat on 1/29/2017.
 */
public class cars {
    public static void main(String[] args)
    {
        for (int i = 1; i <=377 ; i++) {
            try {
                Document pageURL = Jsoup.connect("https://www.carmudi.com.bd/cars/?sort=suggested&page="+i).get();
                Elements carURL =pageURL.select(".item-title.type-m");
                for (Element element :
                     carURL) {
                    String link=element.select("a").attr("href");
                    Document eachCarURL=Jsoup.connect("https://www.carmudi.com.bd"+link).get();
                    Elements car=eachCarURL.select(".column");
                    for (Element element1:
                         car) {
                        String carModel=element1.select(".title-bar span").text();
                        String price=element1.select(".type-xl").text();
                        String color=element1.select("#details .left .block-list li:nth-of-type(1)").text();
                        String cc=element1.select(".tech-bar.clearfix .column:nth-of-type(4) .type-s").text();
                        System.out.println(carModel);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
