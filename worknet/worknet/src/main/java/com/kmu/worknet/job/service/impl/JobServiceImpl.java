package com.kmu.worknet.job.service.impl;

import com.kmu.worknet.job.domain.Job;
import com.kmu.worknet.job.domain.Page;
import com.kmu.worknet.job.domain.SearchWord;
import com.kmu.worknet.job.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

	private final com.kmu.worknet.job.mappers.mapper mapper;

	@Override
	public List<Job> selectJobList(Page page) throws Exception {
		return mapper.selectJobList(page);
	}
	@Override
	public List<Job> selectRecomandJob(int memSeq) throws Exception {
		return mapper.selectRecomandJob(memSeq);
	}
	@Override
	public Job selectJobDetail(String wantedAuthNo) throws Exception {
		return mapper.selectJobDetail(wantedAuthNo);
	}
	@Override
	public List<Job> categoryDo(SearchWord allList, Page page) throws Exception {
		return mapper.categoryDo(allList, page);
	}
	@Override
	public int selectTotalBoard() throws Exception {
		return mapper.selectTotalBoard();
	}
	@Override
	public void updateJobDate(String today) throws Exception {
		mapper.updateJobDate(today);
	}
	@Override
	public int selectCategoryTotalBoard(SearchWord allList) throws Exception {
		return mapper.selectCategoryTotalBoard(allList);
	}
	@Override
	public void updateRecRating(Map<String, Object> map, int memSeq) throws Exception {
		mapper.updateRecRating(map, memSeq);
	}
	@Override
	public void insertDetailActivity(String wantedAuthNo, String kind, int memSeq, String searchWord) throws Exception {
		mapper.insertDetailActivity(wantedAuthNo, kind, memSeq, searchWord);
	}
	@Override
	public List<Job> selectJobBaseList(String wantedAuthNo) throws Exception{
		return mapper.selectJobBaseList(wantedAuthNo);
	}

/*	@Override 일반추천
	public String ratingCheck(Map<String, Object> map, int memSeq) {
		return mapper.ratingCheck(map, memSeq);
	}
	@Override 인설트
	public void insertRating(Map<String, Object> map, int memSeq) throws Exception {
		mapper.insertRating(map, memSeq, Long.toString(System.currentTimeMillis()));
	}
	@Override
	public void insertRatingActivity(Map<String, Object> map, int memSeq) throws Exception {
		mapper.insertRatingActivity(map, memSeq);
	}
	@Override 업데이트
	public void updateRating(Map<String, Object> map, int memSeq) throws Exception {
		mapper.updateRating(map, memSeq, Long.toString(System.currentTimeMillis()));
	}
	@Override
	public void insertRatingReviseRating(Map<String, Object> map, int memSeq) throws Exception {
		mapper.insertRatingReviseRating(map, memSeq);
	}
*/

/*
	@Override 공고기반 추천
	public String jobBaseRatingCheck(Map<String, Object> map, int memSeq) throws Exception {
		return mapper.jobBaseRatingCheck(map, memSeq);
	}
	@Override 인설트
	public void insertJobBaseRatingInsert(Map<String, Object> map, int memSeq) throws Exception {
		mapper.insertJobBaseRatingInsert(map, memSeq, Long.toString(System.currentTimeMillis()));
	}
	@Override 업데이트
	public void updateJobBaseRating(Map<String, Object> map, int memSeq) throws Exception {
		mapper.updateJobBaseRating(map, memSeq, Long.toString(System.currentTimeMillis()));
	}

*/
}
