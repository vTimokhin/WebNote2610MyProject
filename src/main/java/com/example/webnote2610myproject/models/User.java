package com.example.webnote2610myproject.models;

   import lombok.*;
    import javax.persistence.*;
   import java.util.List;

@Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    //
    @Entity
    @Table(name = "users")
    public class User {
        public enum Status{
            ACTIVE,
            BLOCK,
            DELETED
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Integer id;
        @Column (nullable = false, length = 10, unique = true)
        private String login;
        @Column (nullable = false, length = 10)
        private String pass;
        @Column (nullable = false, length = 20)
        private String nickName;
        @Column (nullable = false, length = 20, unique = true)
        private String mail;
        @Column (nullable = false)
        private Status status;
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
        private List<Note> notes;



    }
