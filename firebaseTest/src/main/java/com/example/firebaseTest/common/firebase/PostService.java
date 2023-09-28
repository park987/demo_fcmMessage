package com.example.firebaseTest.common.firebase;

public class PostService {

    private final NotificationService notificationService;



    public PostService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    private void createNotification(Member member) {
        if(true) {
            NotificationRequest notificationRequest = NotificationRequest.builder()
                    .title("POST RECEIVED")
                    .token(notificationService.getToken(member.getId()))
                    .message("123")
                    .build();
        }
    }
}
