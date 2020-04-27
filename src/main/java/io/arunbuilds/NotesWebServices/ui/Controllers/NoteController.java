package io.arunbuilds.NotesWebServices.ui.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @GetMapping
    String getNotes(){
        return "Get";
    }

    @PostMapping
    String addNotes(){
        return "post";
    }
    @PutMapping
    String updateNotes(){
        return "put";
    }

    @DeleteMapping
    String deleteNotes(){
        return "delete";
    }

}
