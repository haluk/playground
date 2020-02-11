package io.github.haluk.playground.controller;

import io.github.haluk.playground.entity.IssueReport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IssueController {

    @GetMapping("/issuereport")
    public String getReport(Model model) {
        model.addAttribute("issuereport", new IssueReport());
        return "issues/issuereport_form";
    }

    @PostMapping("/issuereport")
    public String submitReport(IssueReport issueReport, Model model) {
        model.addAttribute("issuereport", new IssueReport());
        model.addAttribute("submitted", true);
        return "issues/issuereport_form";
    }

    @GetMapping("/issues")
    public String getIssues(Model model) {
        return "issues/issuereport_list";
    }
}
