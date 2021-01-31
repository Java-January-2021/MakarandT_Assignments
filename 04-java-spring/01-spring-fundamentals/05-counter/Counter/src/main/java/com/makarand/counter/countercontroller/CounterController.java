package com.makarand.counter.countercontroller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CounterController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Home(Model viewModel, HttpSession session) {
		Integer count = (Integer) session.getAttribute("pageView");
		if (count == null) {
			// no key found! set session "count" to 0
			session.setAttribute("pageView", 0);
			count = 0;
		}
		count++;
		session.setAttribute("pageView", count);
		System.out.println(count);
		viewModel.addAttribute("pageView", count);
		return "home.jsp";

	}

	public void setCount(HttpSession session, Integer currentCount) {
		session.setAttribute("pageView", currentCount);
	}

	@RequestMapping(value = "/counter", method = RequestMethod.GET)
	public String Counter() {
		return "counter.jsp";
	}

	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String Reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}

	@RequestMapping(value = "/twice", method = RequestMethod.GET)
	public String twice(Model viewModel, HttpSession session) {
		Integer count = (Integer) session.getAttribute("pageView");
		count += 2;
		setCount(session, count);
		viewModel.addAttribute("pageView", count);
		System.out.println(count);
		return "counter.jsp";
	}
}
