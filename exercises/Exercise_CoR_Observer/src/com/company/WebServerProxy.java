package com.company;

public class WebServerProxy {
  private WebServer realWebServer;
  private FileLogger logger;
  
  public WebServerProxy(WebServer realWebServer, FileLogger logger) {
    this.realWebServer = realWebServer;
    this.logger = logger;
  }
  
  public void getRequest(WebRequest request) {
    User user = request.getLoggedUser();
    String userType = user.isAdmin() ? "admin" : "non-admin";
    logger.log("Request made to " + request.getPath() + " by " + userType + " user");
    
    realWebServer.getRequest(request);
  }
}
