package com.patterns.behavioral.mediator;

public abstract class AbstractUser {

    protected ChatMediator mediator;
    protected String name;
    private String message;

    public AbstractUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.addUser(this);
    }

    public abstract void send(String message);

    public abstract void receive(String message);


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
