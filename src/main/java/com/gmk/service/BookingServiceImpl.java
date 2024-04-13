package com.gmk.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.gmk.request.Passenger;
import com.gmk.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> ticketsMap = new HashMap<Integer, Ticket>();
	
	private Integer ticketNum = 1;
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		ticketNum++;
		
		ticketsMap.put(ticketNum, t);
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(ticketsMap.containsKey(ticketNumber)) {
			return ticketsMap.get(ticketNumber);
		}
		return null;
	}

}
