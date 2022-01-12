package icu.soul.aha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoRollbackServiceImpl {
    @Autowired
    DBMapper dbMapper;

    @Transactional(rollbackFor = Exception.class)
    public void insertRollback(String type) {
        if (type.equals("0")) {
            dbMapper.insert0();
        } else if (type.equals("1")) {
            dbMapper.insert1();
        } else if (type.equals("2")) {
            dbMapper.insert2();
        }
        throw new RuntimeException("ERROR"); //抛出异常，触发回滚
    }
}