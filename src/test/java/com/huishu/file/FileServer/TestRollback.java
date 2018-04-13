package com.huishu.file.FileServer;

import com.huishu.file.FileServer.dao.EntityDao;
import com.huishu.file.FileServer.entity.TestEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试事务的回滚
 *
 * @author yindq
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRollback {
	@Autowired
	private EntityDao entityDao;

	@Test
	@Transactional
	public void testRoll(){
		try {
			for (int i = 0; i < 10; i++) {
				TestEntity entity = new TestEntity(String.valueOf(i));
				entityDao.save(entity);
				/*if (i == 4) {
					throw new RuntimeException("异常");
				}*/
			}
		}catch (Exception e){
			System.out.println("不做任何处理");
		}
	}
}
