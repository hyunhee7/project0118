package com.mycompany.myapp.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.dto.ProjPostCommentDto;
import com.mycompany.myapp.dto.ProjTimelineDto;


public interface ProjTimelineService {
	public int insert(ProjTimelineDto dto,HttpServletRequest request);
	ModelAndView list(int num);
	public ModelAndView detail(ProjTimelineDto dto);
	public ModelAndView getFile(ProjTimelineDto dtoNum);	
	public void update(ProjTimelineDto dto, HttpServletRequest request);
	public void delete(ProjTimelineDto dto);
	public void cmtInsert(ProjPostCommentDto dto);
}
