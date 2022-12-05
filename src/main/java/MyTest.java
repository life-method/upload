import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@WebServlet("/one")
public class MyTest extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        HashMap<Object, Object> hashMap = new HashMap<>();

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("abc");
    }

    public static void main(String[] args) {
        User<Object> objectUser = new User<>();
        objectUser.setName("sdd");
        String s = JSON.toJSONString(objectUser);
        System.out.println(s);
    System.out.println("修改过的");
    }



}
