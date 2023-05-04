package com.teamsolution.fileserver.controller;


import com.teamsolution.fileserver.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apidms")
public class FileUploadController {

    private final FileUpload fileUpload;
    @PostMapping("upload")
    public String uploadFile(@RequestParam("image") MultipartFile multipartFile) throws IOException {

        String imageURL = fileUpload.uploadFile(multipartFile);
        return imageURL;
    }
}
