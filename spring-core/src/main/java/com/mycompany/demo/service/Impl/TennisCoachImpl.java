package com.mycompany.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.mycompany.demo.service.TennisCoachService;

@Service
public class TennisCoachImpl implements TennisCoachService {

	public String getPlayer() {
		return "Player1";
	}

}
