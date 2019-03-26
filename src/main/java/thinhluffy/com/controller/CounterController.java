package thinhluffy.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import thinhluffy.com.model.MyCounter;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter) {
        myCounter.increment();
        return "index";
    }
}
