package com.teamsolution.fileserver.service;

import java.util.Map;

public interface ListingAssets {

    Map<String, Object> listAssets(String nextCursor);


}
