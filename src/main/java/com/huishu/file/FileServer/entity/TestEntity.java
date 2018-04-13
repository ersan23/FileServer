package com.huishu.file.FileServer.entity;

import com.alibaba.fastjson.JSONObject;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 实体类
 * 
 * @author yindq
 */
@Entity
@Table(name = "t_test_data")
public class TestEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 主键id */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/** 文件名 */
	private String name;

	public TestEntity(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
