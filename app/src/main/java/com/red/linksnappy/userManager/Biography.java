

package com.red.linksnappy.userManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author AlejandroRC
 */
@Entity
@Table(name = "biography")
public class Biography {

    @Id
    private Long id;  // mismo id que user

    @OneToOne
    @MapsId  // indica que usa el id de User
    @JoinColumn(name = "id")  // columna que referencia user.id
    private User user;

    @Column(columnDefinition = "TEXT") 
    private String content;

    // getters y setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
