



import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@WebServlet("/webOne")
public class UploadController extends HttpServlet {
    public static void main(String[] args) throws IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //Content-Disposition,表示接受到的数据怎么处理
        response.addHeader("Content-Disposition","attachment;filename="
                + "data2.txt");


        response.setContentType("text/plain;charset=utf-8");

        String s="abcsads";
        // 设置输出流的格式
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(s.getBytes());
         outputStream.flush();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("UTF-8");
//
//        response.setCharacterEncoding("UTF-8");
//        response.setHeader("Content-Type","Utf-8");
//       解决乱码问题，这一行代码同时设置浏览器和服务器的字符集为UTF-8,跟上面两行一样的
        response.setContentType("text/html;charset=UTF-8");

        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("中文乱码".getBytes("UTF-8"));
    }



    //    public void  download(@PathVariable("path") String path,HttpServletResponse response) throws IOException {
//        //找到在硬盘的位置
//        File uploadFile = new File(fileUploadPath+path);
//        // 设置输出流的格式
//        ServletOutputStream os = response.getOutputStream();
//
//        //Content-Disposition,表示接受到的数据怎么处理
//        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(path, "UTF-8"));
//
//        //设置文件下载的类型
//        response.setContentType("application/msword");
//        //uploadFile 将file所有数据读到数组里面储存了
//        byte[] bytes = FileUtil.readBytes(uploadFile);
//        os.write(bytes);
//        os.flush();
//        os.close();
//    }
}
