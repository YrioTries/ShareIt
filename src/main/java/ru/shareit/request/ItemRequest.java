package ru.shareit.request;

import lombok.Data;
import ru.shareit.user.User;

import java.time.LocalDateTime;

@Data
public class ItemRequest {
    private long id;
    private String description;
    private User requestor;
    private LocalDateTime created;
}
