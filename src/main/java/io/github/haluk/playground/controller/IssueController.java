package io.github.haluk.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IssueController {

    @GetMapping("/issuereport")
    @ResponseBody
    public String getReport() {
        return "issues/issuereport_form";
    }
}
