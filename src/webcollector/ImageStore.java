package webcollector;
import java.io.DataInputStream;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.net.URL;  
  
public class ImageStore {
	
	public static void downloadImage(String imageURL,String fileName) throws IOException{  
        System.getProperties().setProperty("http.proxyHost", "IP");//设置代理  
        System.getProperties().setProperty("http.proxyPort", "Port");  
        URL url = new URL(imageURL);  
        //打开网络输入流  
        DataInputStream dis = new DataInputStream(url.openStream());  
        String newImageName="C:\\Users\\MSI\\Desktop\\PHOTO\\"+fileName+".jpg";  
        //建立一个新的文件  
        FileOutputStream fos = new FileOutputStream(new File(newImageName));  
        byte[] buffer = new byte[1024];  
        int length;  
        //开始填充数据  
        while((length = dis.read(buffer))>0){  
            fos.write(buffer,0,length);  
        }  
        dis.close();  
        fos.close();      
    }  
}
