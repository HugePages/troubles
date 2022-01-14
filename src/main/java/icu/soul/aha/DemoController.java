package icu.soul.aha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoRollbackServiceImpl demoRollbackService;

    @RequestMapping(value = "/insert-rollback", method = RequestMethod.GET)
    @ResponseBody
    public void insertRollback(String type,String exception) {
        demoRollbackService.insertRollback(type,exception);
    }
}
