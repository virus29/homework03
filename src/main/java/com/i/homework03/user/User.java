package com.i.homework03.user;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Служебное поле hibernate
    @Version
    private Integer version;

    // LogIn
    @Basic(optional = false)
    private String login;

    // Password
    @Basic(optional = false)
    private String password;

    // Имя пользователя
    @Basic(optional = false)
    private String userFirstname;

    // Фамилия пользователя
    @Basic(optional = false)
    private String userSecondname;

    // Отчество пользователя
    @Basic(optional = false)
    private String userMiddlename;

    //Занимаемая должность
    @Basic(optional = false)
    private String userPosition;

    // Телефон
    @Basic(optional = false)
    private String userPhone;

    // Номер документа пользователя
    @Basic(optional = false)
    private String userDocnumber;

    //Дата выдачи документа пользователя
    @Basic(optional = false)
    private String userDocdate;

// Идентифицирован ли пользователь
    @Basic(optional = false)
    private Boolean userIsidentified;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "office_id")
//    private Office office;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_citizenshipCode")
//    private Country country;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_docCode")
//    private Document document;

//    public User() {
//    }

//    public User(String login) {
//        this.login = login;
//    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserSecondname() {
        return userSecondname;
    }

    public String getUserMiddlename() {
        return userMiddlename;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserDocnumber() {
        return userDocnumber;
    }

    public String getUserDocdate() {
        return userDocdate;
    }

    public Boolean getUserIsidentified() {
        return userIsidentified;
    }
}
