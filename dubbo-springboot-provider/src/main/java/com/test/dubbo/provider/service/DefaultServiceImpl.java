package com.test.dubbo.provider.service;

import org.springframework.stereotype.Service;

import com.test.dubbo.api.DefaultApiService;

@Service("defaultService")
public class DefaultServiceImpl implements DefaultApiService{
	
	public String defaultMethod(String str) {
		return "hello "+str;
	}
}
