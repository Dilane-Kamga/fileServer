package com.teamsolution.fileserver.controller;

import com.teamsolution.fileserver.service.ListFileInFolder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apidms")
public class ListFileInFolderController {

    private final ListFileInFolder listFileInFolder;

    @GetMapping("/list-file")
    public List<String> listFileInFolder(@RequestParam("folder") String folder) throws Exception {
        return listFileInFolder.listFileInFolder(folder);
    }

}
