package com.example.demo.service;

import java.util.concurrent.Future;

public interface TaskService {

	public Future<String> doTask() throws Exception;
}
