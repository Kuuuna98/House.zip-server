package com.ssafy.happy.model.repo;

import java.util.List;

import com.ssafy.happy.dto.House;
import com.ssafy.happy.dto.SearchCondition;

public interface HouseRepo {

	House select(int no);
	List<House> selectGugun(SearchCondition condition);
	List<House> selectDong(String dong);
	List<House> selectApt(String aptName);
	int getTotalSearchCount(SearchCondition condition);
}
