package com.dao;

import com.entity.MessagesEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MessagesVO;
import com.entity.view.MessagesView;


/**
 * 举报信息
 * 
 * @author 
 * @email 
 * @date 2022-05-13 15:55:30
 */
public interface MessagesDao extends BaseMapper<MessagesEntity> {
	
	List<MessagesVO> selectListVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	MessagesVO selectVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	List<MessagesView> selectListView(@Param("ew") Wrapper<MessagesEntity> wrapper);

	List<MessagesView> selectListView(Pagination page,@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	MessagesView selectView(@Param("ew") Wrapper<MessagesEntity> wrapper);
	

}
