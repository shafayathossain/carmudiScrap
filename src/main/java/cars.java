import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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
                if(i<377)
                {
                    for(j=1;j<=30;j++)
                    {

                    }
                }
                else
                {
                    for(j=1;j<=16;j++)
                    {
                        
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
