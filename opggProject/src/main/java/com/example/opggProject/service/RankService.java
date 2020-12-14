package com.example.opggProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.opggProject.domain.rank.RankData;
import com.example.opggProject.domain.rank.RankRepository;

@Service
public class RankService {

	@Autowired
	private RankRepository rankRepository;
	
	public void rankSave(RankData rank) {
		rankRepository.save(rank);
	}
	
	public Page<RankData> rankList(Pageable pageable){
		return rankRepository.findAll(pageable);
	}
	
	public List<String> rankName(){
		return rankRepository.mFindByName();
	}
	public RankData findName(String data) {
		return rankRepository.mFind(data);
	}
	
	
}
