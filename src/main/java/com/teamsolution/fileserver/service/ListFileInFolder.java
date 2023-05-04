package com.teamsolution.fileserver.service;

import java.util.List;

public interface ListFileInFolder {

    List<String> listFileInFolder(String folderName) throws Exception;
}
