package com.mybatis.models;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class TcontactosDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public TcontactosDAO() {

	}
    
	public List<Tcontactos> selectAll() {
		List<Tcontactos> list = sqlSession.selectList("Tcontactos.getAll");
		return list;
	}
    
	public Tcontactos selectById(int id) {
		Tcontactos contact = (Tcontactos) sqlSession.selectOne("Tcontactos.getById", id);
		return contact;
	}
    
	public void insert(Tcontactos contact) {
		sqlSession.insert("Tcontactos.insert", contact);
	}
    
	public void update(Tcontactos contact) {
		sqlSession.update("Tcontactos.update", contact);
	}
    
	public void delete(int id) {
		sqlSession.delete("Tcontactos.delete", id);
	}
}
