package com.makarand.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
//	@RequestMapping(value="/" method=RequestMethod.GET)
//	@RequestMapping(value="/" method=RequestMethod.POST)

	@GetMapping("/")
	public String gold(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if (session.getAttribute("activity") == null) {
			session.setAttribute("activity", activity);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "gold.jsp";
	}

	// findgold
	@PostMapping("/findgold")
	public String goldProcessing(HttpSession session, @RequestParam("building") String building) {

		Random r = new Random();
		LocalDateTime now =LocalDateTime.now();
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		System.out.println(activity.isEmpty());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		System.out.println(formatter.format(now));
		int gold = (int) session.getAttribute("gold");

		int goldThisTurn;

		//
		// Doing some gold logic
		if (building.equals("farm")) {
			// Do farm stuff
			goldThisTurn = r.nextInt((20 - 10) + 1) + 10;
			activity.add(String.format("you entered a farm and earned %d gold \n", goldThisTurn));
			System.out.println(activity.isEmpty());
		} else

		if (building.equals("cave")) {
			// Do cave stuff
			goldThisTurn = r.nextInt((10 - 5) + 1) + 5;
			activity.add(String.format("you entered a cave and earned %d gold \n", goldThisTurn));
		} else

		if (building.equals("house")) {
			// Do house stuff
			goldThisTurn = r.nextInt((5 - 2) + 1) + 5;
			activity.add(String.format("you entered a house and earned %d gold \n", goldThisTurn));
		} else {
			// Do casino stuff
			goldThisTurn = r.nextInt((50 + 50) + 1) - 50;
			if (goldThisTurn < 0) {
				activity.add(String.format("you entered a farm and lost %d gold....ouch! \n", goldThisTurn));
			} else {
				activity.add(String.format("you entered a casino and earn  %d gold \n", goldThisTurn));
			}
		}
		int totalGold = gold += goldThisTurn;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}

}
