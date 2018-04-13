package com.huishu.file.FileServer.service;

import com.huishu.file.FileServer.dao.EntityDao;
import com.huishu.file.FileServer.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 被嵌套的service
 *
 * @author yindq
 */
@Service
public class NestingService1 {
	@Autowired
	private EntityDao entityDao;

	@Transactional
	public void add(){
		try {
			for (int i = 0; i < 5; i++) {
				TestEntity entity = new TestEntity(String.valueOf(i));
				entityDao.save(entity);
				if (i == 2) {
					throw new RuntimeException("异常");
				}
			}
		}catch (Exception e){
			System.out.println("不做任何处理");
		}
	}
}
