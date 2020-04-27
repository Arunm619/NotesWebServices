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
    String getNotesWithPageNumberandPerPageConfig(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "per_page", defaultValue = "10") Integer perPage,
                                                  @RequestParam(value = "sort", required = false) String sort) {
        return "Getting your page ".concat(page.toString()).concat(" with items per page ").concat(perPage.toString()).concat(sort == null ? "" : " and sprted by "+sort);
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
