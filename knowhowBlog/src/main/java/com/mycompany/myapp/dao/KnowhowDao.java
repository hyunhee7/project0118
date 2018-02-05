package com.mycompany.myapp.dao;

import java.util.List;

import com.mycompany.myapp.dto.KnowhowDto;
import com.mycompany.myapp.dto.KnowhowTagDto;
import com.mycompany.myapp.dto.ProjTimelineDto;


public interface KnowhowDao {
	public List<KnowhowDto> getList();
	public int insert(KnowhowDto dto);
	public KnowhowDto getDetail(KnowhowDto dtoNum);
	public KnowhowDto getFile(KnowhowDto dtoNum);
	public List<KnowhowTagDto> getTags(KnowhowDto dtoNum);
	public void update(KnowhowDto dto) ;
	public void delete(int kh_num);
}