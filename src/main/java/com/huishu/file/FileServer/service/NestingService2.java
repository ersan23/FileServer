package com.huishu.file.FileServer.service;

import com.huishu.file.FileServer.dao.EntityDao;
import com.huishu.file.FileServer.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 嵌套的service
 *
 * @author yindq
 */
@Service
public class NestingService2 {
	@Autowired
	private EntityDao entityDao;


	@Transactional
	public void add(){
		for (int i = 0; i < 5; i++) {
			TestEntity entity = new TestEntity(String.valueOf(i));
			entityDao.save(entity);
			if(i==2){
				throw new RuntimeException("我就是要抛出一个异常");
			}
		}
	}
}
