package com.biz.addr.service;

import java.util.List;

import com.biz.addr.persistence.AddrDTO;
import com.biz.addr.persistence.dao.AddrDao;

public class AddrServiceV1 {

	public static void main(String[] args) {
		

	}

	public void viewAddrList() {
		
		List<AddrDTO> AddrList = AddrDao.selectAll();
		this.viewList(AddrList);
	}

	private void viewList(List<AddrDTO> bookList) {
		// TODO Auto-generated method stub
		
	}

		
	}


