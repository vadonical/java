import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.runoob.com/java/java-url-processing.html");
            System.out.println("URL为：" + url.toString());
            System.out.println("协议为：" + url.getProtocol());
            System.out.println("验证信息：" + url.getAuthority());
            System.out.println("文件名及请求参数为：" + url.getFile());
            System.out.println("主机名为：" + url.getHost());
            System.out.println("路径为：" + url.getPath());
            System.out.println("端口为：" + url.getPort());
            System.out.println("默认端口为：" + url.getDefaultPort());
            System.out.println("请求参数为：" + url.getQuery());
            System.out.println("定位位置为：" + url.getRef());
            System.out.println("用户信息为：" + url.getUserInfo());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
