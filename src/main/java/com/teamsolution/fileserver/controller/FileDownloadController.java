package com.teamsolution.fileserver.controller;


import com.teamsolution.fileserver.service.FileDownload;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apidms")
@CrossOrigin(origins = "http://localhost:4200")
public class FileDownloadController {

    private final FileDownload fileDownload;

    @GetMapping("/download")
    public String getImageUrl(@RequestParam("id") String publicId) {
        return fileDownload.getImageUrl(publicId);
    }

}
