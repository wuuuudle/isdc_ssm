package isdc.isdcssm;

import isdc.isdcssm.dao.*;
import isdc.isdcssm.model.ApplicationForm;
import isdc.isdcssm.model.BlogData;
import isdc.isdcssm.model.Semester;
import isdc.isdcssm.model.User;
import isdc.isdcssm.service.*;
import isdc.isdcssm.service.Impl.BlogServiceImpl;
import isdc.isdcssm.service.Impl.FileServiceImpl;
import org.assertj.core.condition.Join;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IsdcSsmApplicationTests
{

    @Autowired
    private BlogServiceImpl blogService;
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private ApplicationFormDAO applicationFormDAO;


    public IsdcSsmApplicationTests()
    {

    }

    @Test
    public void contextLoads()
    {
        List<ApplicationForm> a = applicationFormDAO.selectAll();
        List b = a;
    }

    @Test
    public void BlogDataDAOTest()
    {
        blogService.updateBlogData();
    }

    @Test
    public void UserDAOTest()
    {
        User user = userDAO.selectByEmail("1364847132@qq.com");
        System.out.println(user.getIsMember());
        System.out.println(user.getAccessToken());
    }

    @Test
    public void DirTest()
    {

    }
}


