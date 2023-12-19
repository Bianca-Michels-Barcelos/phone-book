package com.barcelos.phonebook.controller;

import com.barcelos.phonebook.model.Contact;
import com.barcelos.phonebook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<Contact> save(Contact contact) {
        return null;
    }



    // GET localhost:8080/contacts/hi

    // GET localhost:8080/contacts

    // GET /contacts
    // GET contacts/{id}
    // POST /contacts
    // PUT /contacts/{id}
    // DELETE /contacts/{id}


}
