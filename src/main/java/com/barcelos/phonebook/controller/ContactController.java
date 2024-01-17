package com.barcelos.phonebook.controller;

import com.barcelos.phonebook.model.Contact;
import com.barcelos.phonebook.service.ContactService;
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

    // TODO: GET /contacts
    // TODO: GET contacts/{id}
    // TODO: POST /contacts
    // TODO: PUT /contacts/{id}
    // TODO: DELETE /contacts/{id}
}
