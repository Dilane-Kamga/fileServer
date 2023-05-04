package com.teamsolution.fileserver.service;

import com.cloudinary.api.ApiResponse;

import java.io.IOException;

public interface ListFolder {
    ApiResponse listFolder() throws Exception;
}
