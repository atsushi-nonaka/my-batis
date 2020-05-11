package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Sample;
import com.example.mapper.SampleMapper;

@Service
@Transactional
public class SampleService {
	
	@Autowired
	private SampleMapper mapper;
	
	public List<Sample> findAll(){
		return mapper.findAll();
	}
}
