package main.java.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
  private MessageStore messageStore;
  public String execute() {
    this.messageStore = new MessageStore();

    return SUCCESS;
  }

  public MessageStore getMessageStore() {
    return this.messageStore;
  }
}
