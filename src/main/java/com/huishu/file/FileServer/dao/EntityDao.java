package com.huishu.file.FileServer.dao;

import com.huishu.file.FileServer.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 测试dao
 * <p>
 *
 * @author yindq
 */
@Repository
public interface EntityDao extends CrudRepository<TestEntity, Long> {
}
