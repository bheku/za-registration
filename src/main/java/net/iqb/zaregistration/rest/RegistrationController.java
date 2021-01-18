package net.iqb.zaregistration.rest;

import net.iqb.zaregistration.model.json.PersonDetails;
import net.iqb.zaregistration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("registration")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

    private RegistrationService service;

    @Autowired
    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody PersonDetails details){
        service.add(details);
    }

    @GetMapping("/report")
    public List<PersonDetails> report(){
        return service.getReport();
    }
}
