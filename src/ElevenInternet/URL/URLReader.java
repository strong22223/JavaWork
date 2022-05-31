package ElevenInternet.URL;

import java.io.*;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws Exception {
        URL google = new URL("http://www.baidu.com//index.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()));
         byte[] bytes=new byte[1024];
         int len;
         String str;
          PrintStream  os = new PrintStream(System.out) ;

        while((len=reader.read())!=-1){
                os.write(len);
        }
//        os.close();
        reader.close();
    }
}
