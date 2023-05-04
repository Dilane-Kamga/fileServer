package com.teamsolution.fileserver.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.cloudinary.utils.ObjectUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ListFileInFolderImpl implements ListFileInFolder {

    private final Cloudinary cloudinary;


    @Override
    public List<String> listFileInFolder(String folderName) throws Exception {

        // Call the Admin API to list all assets in the folder
        ApiResponse response = cloudinary.api().resources(ObjectUtils.asMap(
                "type", "upload",
                "prefix", folderName + "/"
        ));

        // Get the list of resources from the response
        List<Map> resources = (List<Map>) response.get("resources");

        // Create a list of urls from the resources
        List<String> urls = new ArrayList<>();

        // Loop through the resources and add the urls to the list
        for (Map resource : resources) {
            // Get the public ID of the resource
            String publicId = (String) resource.get("public_id");
            // Get the URL of the resource using the Cloudinary Java library
            String url = cloudinary.url().secure(true).generate(publicId);
            // Add the URL to the list
            urls.add(url);
        }

        return urls;
    }
}
