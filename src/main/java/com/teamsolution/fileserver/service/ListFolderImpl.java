package com.teamsolution.fileserver.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.cloudinary.utils.ObjectUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ListFolderImpl implements ListFolder{

    @Autowired
    private final Cloudinary cloudinary;

    @Override
    public ApiResponse listFolder() throws Exception {
        return cloudinary.api().rootFolders(ObjectUtils.emptyMap());
    }
}
