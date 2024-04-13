package com.gmk.service;

import com.gmk.request.Passenger;
import com.gmk.response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
}
