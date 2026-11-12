package com.printerservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("services", List.of(
                Map.of("title", "On-Site Printer Repair", "description", "Fast diagnostics and repair for office and home printers, including laser, inkjet, and multifunction devices."),
                Map.of("title", "Toner & Ink Refills", "description", "High-quality cartridge replacement and printhead cleaning that restores output quality and reduces downtime."),
                Map.of("title", "Managed Print Support", "description", "Preventive maintenance plans, fleet monitoring, and service contracts for business environments."),
                Map.of("title", "Network & Driver Setup", "description", "Wi‑Fi, Ethernet, and driver configuration for smooth printer connectivity across your office network.")
        ));

        model.addAttribute("plans", List.of(
                Map.of("name", "Essential Care", "price", "$49", "details", "Perfect for home offices and small teams needing quick tune-ups and urgent repair support."),
                Map.of("name", "Business Plus", "price", "$99", "details", "Includes priority response times, quarterly maintenance, and discounted service calls."),
                Map.of("name", "Enterprise Shield", "price", "$199", "details", "Custom monitoring, on-site coverage, multi-device support, and dedicated account management.")
        ));

        model.addAttribute("testimonials", List.of(
                Map.of("quote", "Our office printer was down for two days. The team diagnosed it the same morning and had us running again before lunch.", "name", "Maria R."),
                Map.of("quote", "Their maintenance plan has saved us from multiple service outages. Professional, responsive, and transparent.", "name", "Derek T."),
                Map.of("quote", "They handled our fleet of color printers and scanners with zero disruption to our team. Highly recommended.", "name", "Alicia S.")
        ));

        return "index";
    }

    @PostMapping("/contact")
    public String contact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String service,
            @RequestParam String message,
            Model model) {

        model.addAttribute("successMessage",
                "Thank you, " + name + ". Your request has been received. A printer service specialist will contact you shortly.");

        model.addAttribute("submittedService", service);
        model.addAttribute("services", List.of(
                Map.of("title", "On-Site Printer Repair", "description", "Fast diagnostics and repair for office and home printers, including laser, inkjet, and multifunction devices."),
                Map.of("title", "Toner & Ink Refills", "description", "High-quality cartridge replacement and printhead cleaning that restores output quality and reduces downtime."),
                Map.of("title", "Managed Print Support", "description", "Preventive maintenance plans, fleet monitoring, and service contracts for business environments."),
                Map.of("title", "Network & Driver Setup", "description", "Wi‑Fi, Ethernet, and driver configuration for smooth printer connectivity across your office network.")
        ));

        model.addAttribute("plans", List.of(
                Map.of("name", "Essential Care", "price", "$49", "details", "Perfect for home offices and small teams needing quick tune-ups and urgent repair support."),
                Map.of("name", "Business Plus", "price", "$99", "details", "Includes priority response times, quarterly maintenance, and discounted service calls."),
                Map.of("name", "Enterprise Shield", "price", "$199", "details", "Custom monitoring, on-site coverage, multi-device support, and dedicated account management.")
        ));

        model.addAttribute("testimonials", List.of(
                Map.of("quote", "Our office printer was down for two days. The team diagnosed it the same morning and had us running again before lunch.", "name", "Maria R."),
                Map.of("quote", "Their maintenance plan has saved us from multiple service outages. Professional, responsive, and transparent.", "name", "Derek T."),
                Map.of("quote", "They handled our fleet of color printers and scanners with zero disruption to our team. Highly recommended.", "name", "Alicia S.")
        ));

        return "index";
    }
}
