package com.company;

public class PolicyCheckRequestHandler extends RequestHandler {
  @Override
  public void handleRequest(WebRequest request) {
    String path = request.getPath();
    boolean isAdmin = request.getLoggedUser().isAdmin();
    
    if (path.equals("/dashboard") && !isAdmin) {
      System.out.println("Status 403 : user is not authorized to access this content");
    } else if (successor != null) {
      successor.handleRequest(request);
    }
  }
}
