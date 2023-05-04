package com.teamsolution.fileserver.controller;


import com.cloudinary.api.ApiResponse;
import com.teamsolution.fileserver.service.ListFolder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apidms")
@CrossOrigin(origins = "http://localhost:4200")
public class ListFolderController {

    private final ListFolder listFolder;


    @GetMapping("/list-folder")
    public ApiResponse listFolder() throws Exception {
        return listFolder.listFolder();
    }
}
