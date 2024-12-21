package com.company;

import java.util.Arrays;
import java.util.List;

public class ExistingContentCheckRequestHandler extends RequestHandler {
  private static final List<String> VALID_PATHS = Arrays.asList("/dashboard", "/home");
  
  @Override
  public void handleRequest(WebRequest request) {
    if (!VALID_PATHS.contains(request.getPath())) {
      System.out.println("Status 404 : Page missing");
    } else if (successor != null) {
      successor.handleRequest(request);
    }
  }
}
