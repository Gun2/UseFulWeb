package com.useful.web.service;

import java.util.List;

import org.json.JSONArray;


import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.vo.LottoResultVO;

import com.useful.web.domain.vo.MsgResultVO;

public interface MsgService {
	
List<MsgResultVO> selectAllMsgResult();
	
	//�ֱ� x�� �޽��� ��ȯ
	JSONArray selectRecentChat(int limit);
	
	//chat ����
	int insertChat(ChatDTO dto);
	
	void test();

	public List<LottoResultVO> list() throws Exception;
	
	public int count() throws Exception;
	
	// 게시물 목록 + 페이징
	public List listPage(int displayPost, int postNum) throws Exception;
	
	// 게시글 목록 + 페이징 + 검색
	public List listPageSearch(int displayPost, int postNum, String searchType, String keyword) throws Exception;

	// 게시글 총 갯수 + 검색 적용
	public int searchCount(String searchType, String keyword) throws Exception;
	
	public int searchCount(int displayPost, int postNum, String searchType, String keyword) throws Exception;
		
}

