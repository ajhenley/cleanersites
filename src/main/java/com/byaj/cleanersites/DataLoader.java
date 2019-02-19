package com.byaj.cleanersites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  @Autowired
  CleanerRepository cleanerRepository;

  @Override
  public void run(String... strings) throws Exception{
    System.out.println("Loading data...");

    Cleaner cleaner = new Cleaner("Ace Cleaning",
            "Noon - 9pm Everyday",
            "Cleaning with a smile",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "aceclean",
            "theme1");
    cleanerRepository.save(cleaner);

    cleaner = new Cleaner("Base Cleaning",
            "Noon - 1pm Tuesdays",
            "Cleaning with a sign",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "baseclean",
            "theme1");
    cleanerRepository.save(cleaner);

    cleaner = new Cleaner("Just Cleaning",
            "24 hours a day",
            "No frills cleaning",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "justclean",
            "theme2");
    cleanerRepository.save(cleaner);
  }
}