package ru.shareit.item;

import lombok.Data;
import ru.shareit.request.ItemRequest;
import ru.shareit.user.User;

@Data
public class Item {
    private long id;
    private String name;
    private String description;
    private boolean available;
    private User owner;
    private ItemRequest request;
}
