package io.arunbuilds.NotesWebServices.ui.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @GetMapping(path = "/{noteId}")
    String getNotes(@PathVariable String noteId) {
        return "Getting your ".concat(noteId);
    }

    @GetMapping()
    String getNotesWithPageNumberandPerPageConfig(@RequestParam(value = "page") Integer page, @RequestParam(value = "per_page") Integer perPage) {
        return "Getting your page ".concat(page.toString()).concat(" with items per page").concat(perPage.toString());
    }

    @PostMapping
    String addNotes() {
        return "post";
    }

    @PutMapping
    String updateNotes() {
        return "put";
    }

    @DeleteMapping
    String deleteNotes() {
        return "delete";
    }

}
