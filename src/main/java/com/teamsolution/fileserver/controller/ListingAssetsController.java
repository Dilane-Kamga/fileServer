package com.teamsolution.fileserver.controller;


import com.teamsolution.fileserver.service.ListingAssets;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/apidms")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ListingAssetsController {

    private final ListingAssets listingAssets;

    @GetMapping("/list-assets")
    public Map<String, Object> listAssets(@RequestParam("prefix") String nextCursor) {
        return listingAssets.listAssets(nextCursor);
    }
}
