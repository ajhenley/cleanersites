package com.byaj.cleanersites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @Autowired
  CleanerRepository cleanerRepository;

  @RequestMapping("/")
  public String home(Model model){
    model.addAttribute("cleaners", cleanerRepository.findAll());
    return "index";
  }

  @RequestMapping("/site/{slug}")
  public String showSite(@PathVariable("slug") String slug, Model model){
    Cleaner cleaner = cleanerRepository.findBySlug(slug);
    model.addAttribute("cleaner", cleaner);

    return cleaner.theme;
  }
}
