package cn.bdqn.util;

import java.util.List;

/**
 * 分页工具类
 * @author 
 *
 */
public class PageSupport<T> {
	//当前页码-来自于用户输入
	private int currentPageNo = 1;
	//页面容量
	private int pageSize = 0;
	//总数量（表）
	private int totalCount = 0;
	//总页数-totalCount/pageSize（+1）
	private int totalPageCount = 1;

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		if(currentPageNo > 0){
			this.currentPageNo = currentPageNo;
		}else if (currentPageNo>totalPageCount){
			this.currentPageNo = totalPageCount;
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		if(totalCount > 0){
			this.totalCount = totalCount;
		}
	}
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize > 0){
			this.pageSize = pageSize;
		}
		//设置总页数
		this.setTotalPageCountByRs();
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public void setTotalPageCountByRs(){
		if(this.totalCount % this.pageSize == 0){
			this.totalPageCount = this.totalCount / this.pageSize;
		}else if(this.totalCount % this.pageSize > 0){
			this.totalPageCount = this.totalCount / this.pageSize + 1;
		}else{
			this.totalPageCount = 0;
		}
	}

	public int getStartRow(){
		return (currentPageNo-1)*pageSize;
	}
	
}