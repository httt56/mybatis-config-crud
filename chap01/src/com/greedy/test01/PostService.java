package com.greedy.test01;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class PostService {
	  
	public List<postDTO> findAllPost() {
	      
	      SqlSession sqlSession = getSession(); //자바 config 설정으로 정의된 sqlSession을 불러옴
	      
	      postDAO menuDAO =sqlSession.getMapper(postDAO.class);
	      List<postDTO> post = postDAO.selectAllPost();
	      
	      sqlSession.close();
	      
	      return post;
	   }

//	   public MenuDTO findMenuByMenuCode(int code) {
//	      
//	      SqlSession sqlSession = getSession();
//	      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
//	      
//	      MenuDTO menu = menuDAO.selectMenuByCode(code);
//	      sqlSession.close();
//	      
//	      return menu;
//	   }
//
//	   public boolean registNewMenu(MenuDTO menu) {
//	      SqlSession sqlSession = getSession();
//	      
//	      MenuDAO menuDao = sqlSession.getMapper(MenuDAO.class);
//	      int result = menuDao.insertMenu(menu);
//	      
//	      if(result > 0) {
//	         sqlSession.commit();
//	      }else {
//	         sqlSession.rollback();
//	      }
//	      sqlSession.close();
//	      
//	      return result > 0 ? true:false;
//	   }
//
//	   public int modifyMenu(ModifyMenuDTO menuDTO) {
//	      SqlSession sqlSession = getSession();
//	      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
//	      int result = menuDAO.modifyMenu(menuDTO);
//	      
//	      if(result > 0) {
//	         sqlSession.commit();
//	      }else {
//	         sqlSession.rollback();
//	      }
//
//	      sqlSession.close();
//	      return result;
//	   }
//
//	   public int removeMenu(int code) {
//
//	      SqlSession sqlSession = getSession();
//	      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
//	      
//	      int result = menuDAO.removeMenu(code);
//	      
//	      if(result > 0) {
//	         sqlSession.commit();
//	      }else {
//	         sqlSession.rollback();
//	      }
//	      
//	      sqlSession.close();
//	      return result;
//	   }
	
	
	
}
