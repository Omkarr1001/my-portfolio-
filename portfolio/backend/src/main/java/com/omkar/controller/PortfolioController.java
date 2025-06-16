package com.omkar.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:5173", "https://omkarsalunkhe.dev"})
public class PortfolioController {

    @GetMapping("/about")
    public ResponseEntity<Map<String, String>> getAbout() {
        Map<String, String> aboutData = new HashMap<>();
        aboutData.put("name", "Omkar Salunkhe");
        aboutData.put("title", "Full Stack Developer");
        aboutData.put("description", "Aspiring Software Developer with strong fundamentals in Java, Web Development, and a growing command over AI-powered productivity tools. Certified by Ontskill in Generative AI Tool Usage. Skilled at using tools like ChatGPT, Claude, RunwayML, and Notion AI to automate tasks, generate content/code faster, and enhance workflows. Have basic knowledge of creating simple AI agents for specific use cases using prompt chaining or automation platforms.");
        aboutData.put("imageUrl", "https://source.unsplash.com/random/600x400?developer,ai,profile"); // Dynamic image for profile
        return new ResponseEntity<>(aboutData, HttpStatus.OK);
    }

    @GetMapping("/skills")
    public ResponseEntity<Map<String, List<String>>> getSkills() {
        Map<String, List<String>> skills = new HashMap<>();
        skills.put("Languages", List.of("Java", "JavaScript", "Python", "SQL"));
        skills.put("Frameworks/Technologies", List.of("Spring Boot", "JSP", "Servlets", "Hibernate", "REST APIs"));
        skills.put("Frontend", List.of("HTML", "CSS", "JavaScript", "React.js"));
        skills.put("Databases", List.of("MySQL", "MongoDB"));
        skills.put("AI Tools for Productivity", List.of("ChatGPT", "Claude", "Notion AI", "RunwayML", "Stable Diffusion"));
        skills.put("AI Usage", List.of("Code generation", "content writing", "idea brainstorming", "simple AI agent setup (prompt chaining or Zapier)"));
        skills.put("Tools", List.of("IntelliJ IDEA", "VS Code", "Postman", "Git", "GitHub", "MySQL Workbench", "Google Colab"));
        skills.put("Concepts", List.of("SDLC", "Agile Methodology", "Debugging", "Task Automation"));
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/projects")
    public ResponseEntity<List<Map<String, Object>>> getProjects() {
        List<Map<String, Object>> projects = new ArrayList<>();

        Map<String, Object> project1 = new HashMap<>();
        project1.put("id", 1);
        project1.put("name", "Skillbridge");
        project1.put("description", "Developed a full-stack platform helping learners upskill through real-world projects. Integrated backend with frontend and deployed using GitHub Actions. Used AI tools like ChatGPT and Claude to generate content, plan UI, and create documentation.");
        project1.put("tags", List.of("Full-stack", "GitHub Actions", "ChatGPT", "Claude"));
        project1.put("imageUrl", "https://source.unsplash.com/random/400x250?coding,education"); // Dynamic image
        project1.put("githubUrl", "https://github.com/Omkarr1001/skillbridge");
        project1.put("demoUrl", "#"); // Placeholder
        projects.add(project1);

        Map<String, Object> project2 = new HashMap<>();
        project2.put("id", 2);
        project2.put("name", "Resume Ranker (NLP + AI Tools)");
        project2.put("description", "Used HuggingFace and LLMs for ranking and summarizing resumes. Used AI tools to brainstorm filters and generate prompt templates.");
        project2.put("tags", List.of("NLP", "HuggingFace", "LLMs", "AI"));
        project2.put("imageUrl", "https://source.unsplash.com/random/400x250?resume,ai,nlp"); // Dynamic image
        project2.put("githubUrl", "#"); // Placeholder
        project2.put("demoUrl", "#"); // Placeholder
        projects.add(project2);
        
        Map<String, Object> project3 = new HashMap<>();
        project3.put("id", 3);
        project3.put("name", "Online Bookstore Web App");
        project3.put("description", "Java and SQL-based web app for searching, browsing, and purchasing books. Focused on backend optimization and UI development.");
        project3.put("tags", List.of("Java", "SQL", "Web App", "Backend Optimization", "UI Development"));
        project3.put("imageUrl", "https://source.unsplash.com/random/400x250?bookstore,webdev"); // Dynamic image
        project3.put("githubUrl", "#"); // Placeholder
        project3.put("demoUrl", "#"); // Placeholder
        projects.add(project3);

        Map<String, Object> project4 = new HashMap<>();
        project4.put("id", 4);
        project4.put("name", "E-Servana – Local Business Android App");
        project4.put("description", "Developed a Java-based Android app for discovering and reviewing local businesses. Designed admin dashboard with content moderation features.");
        project4.put("tags", List.of("Java", "Android", "Mobile App", "Admin Dashboard"));
        project4.put("imageUrl", "https://source.unsplash.com/random/400x250?android,mobileapp"); // Dynamic image
        project4.put("githubUrl", "#"); // Placeholder
        project4.put("demoUrl", "#"); // Placeholder
        projects.add(project4);
        
        Map<String, Object> project5 = new HashMap<>();
        project5.put("id", 5);
        project5.put("name", "Optimized Data Storage for Sharding-Based Blockchain");
        project5.put("description", "Implemented shard-based storage using Java to enhance scalability and data efficiency.");
        project5.put("tags", List.of("Java", "Blockchain", "Data Storage", "Scalability"));
        project5.put("imageUrl", "https://source.unsplash.com/random/400x250?blockchain,data"); // Dynamic image
        project5.put("githubUrl", "#"); // Placeholder
        project5.put("demoUrl", "#"); // Placeholder
        projects.add(project5);

        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/certifications")
    public ResponseEntity<List<Map<String, String>>> getCertifications() {
        List<Map<String, String>> certifications = new ArrayList<>();
        Map<String, String> cert1 = new HashMap<>();
        cert1.put("id", "1");
        cert1.put("title", "Generative AI Tools Mastery");
        cert1.put("issuer", "Ontskill");
        cert1.put("date", "2025"); // Assuming (2025) means the year
        cert1.put("description", "3-Day Masterclass in Generative AI Tools.");
        certifications.add(cert1);

        Map<String, String> cert2 = new HashMap<>();
        cert2.put("id", "2");
        cert2.put("title", "AWS Certified Developer – Associate");
        cert2.put("issuer", "Amazon Web Services");
        cert2.put("date", "May 2023");
        cert2.put("description", "Demonstrated proficiency in developing, deploying, and debugging cloud-based applications using AWS services.");
        certifications.add(cert2);

        Map<String, String> cert3 = new HashMap<>();
        cert3.put("id", "3");
        cert3.put("title", "Oracle Certified Professional, Java SE 11 Developer");
        cert3.put("issuer", "Oracle");
        cert3.put("date", "Nov 2022");
        cert3.put("description", "Validated advanced-level Java programming skills and in-depth knowledge of Java SE 11.");
        certifications.add(cert3);
        return new ResponseEntity<>(certifications, HttpStatus.OK);
    }

    @GetMapping("/experience")
    public ResponseEntity<List<Map<String, String>>> getExperience() {
        List<Map<String, String>> experiences = new ArrayList<>();
        Map<String, String> exp1 = new HashMap<>();
        exp1.put("id", "1");
        exp1.put("title", "Full Stack Java Intern");
        exp1.put("company", "Java By Kiran");
        exp1.put("location", "Pune");
        exp1.put("duration", "Aug 2023 – Jan 2024");
        exp1.put("description", "Built scalable Java applications using Spring Boot and RESTful APIs. Participated in Agile SDLC, code reviews, and debugging. Used GitHub, Postman, and IntelliJ for deployment and testing.");
        experiences.add(exp1);
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }

    @PostMapping("/contact")
    public ResponseEntity<String> submitContactForm(@RequestBody Map<String, String> contactData) {
        // In a real application, you would process this data (e.g., save to DB, send email)
        System.out.println("Received contact form submission:");
        contactData.forEach((key, value) -> System.out.println(key + ": " + value));
        return new ResponseEntity<>("Message sent successfully!", HttpStatus.OK);
    }
} 