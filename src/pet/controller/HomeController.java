package pet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String showHomePage(Model model) {
		// 1-传递模型数据到视图
		model.addAttribute("msg", "hello world");
		// 2-返回逻辑视图名称
		return "home"; // 对应home.jsp
	}
}
