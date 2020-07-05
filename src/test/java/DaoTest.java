import com.poem.pojo.Dynasty;
import com.poem.pojo.ResultPoem;
import com.poem.repository.DynastyMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class DaoTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        DynastyMapper a=context.getBean("dynastyMapper", DynastyMapper.class);
        List<Dynasty> b=a.SelectDynasty("夏");
        System.out.println(b);

    }
}
