package utils.http.https.jsoup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

public class JsoupHttpsUploadFile  {

	public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/fileUpload";
        File file = new File("/opt/fileUpload/index.jpg");
        String fileRquestParam = "file";
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("userName", "admin");
        dataMap.put("md5", "12cd76nskju98zud7fda0f6c9wa54");
        Response response = doPostFileRequest(url, dataMap, file, fileRquestParam);
        System.out.println(response.statusMessage());
    }
 
    /**
     * @param url              请求的Url
     * @param paramMap         参数
     * @param file             文件
     * @param fileRequestParam form表单对应的文件name属性名
     * @return
     * @throws Exception
     */
    public static Response doPostFileRequest(String url, Map<String, String> paramMap, File file, String fileRequestParam) throws Exception {
        if (StringUtils.isBlank(url)) {
            throw new Exception("The request URL is blank.");
        }
        // Https请求
        if (StringUtils.startsWith(url, "https")) {
            trustEveryone();
        }
        Connection connection = Jsoup.connect(url);
        connection.method(Connection.Method.POST);
        connection.timeout(12000);
        connection.header("Content-Type", "multipart/form-data");
        connection.ignoreHttpErrors(true);
        connection.ignoreContentType(true);
        if (paramMap != null && !paramMap.isEmpty()) {
            connection.data(paramMap);
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            connection.data(fileRequestParam, file.getName(), fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Response response = connection.execute();
            if (response.statusCode() != HttpStatus.SC_OK) {
                throw new Exception("http请求响应码:" + response.statusCode() + "");
            }
            return response;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    /**
     * 解决Https请求,返回404错误
     */
    private static void trustEveryone() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
 
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new X509TrustManager[]{new X509TrustManager() {
 
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
 
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
 
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
