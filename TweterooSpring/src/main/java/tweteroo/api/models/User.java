package tweteroo.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import tweteroo.api.dtos.UserDTO;

@Data
@Entity(name = "Users")
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String avatar;

    public User(UserDTO data) {
        this.username = data.getUsername();
        this.avatar = data.getAvatar();
    }
}
