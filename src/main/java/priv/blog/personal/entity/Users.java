package priv.blog.personal.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    private BigInteger user_id;

    private String user_ip;
    private String user_name;
    private String user_password;
    private String user_email;
    private String user_preFile_photo;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp user_registration_time;
    private Integer user_age;
    private String user_telephone_number;
    private String user_nickname;

    public Users() {
    }

    public Users(String user_name, String user_password, String user_email, Integer user_age, String user_telephone_number, String user_nickname) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_age = user_age;
        this.user_telephone_number = user_telephone_number;
        this.user_nickname = user_nickname;
    }

    public BigInteger getUser_id() {
        return user_id;
    }

    public void setUser_id(BigInteger user_id) {
        this.user_id = user_id;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_preFile_photo() {
        return user_preFile_photo;
    }

    public void setUser_preFile_photo(String user_preFile_photo) {
        this.user_preFile_photo = user_preFile_photo;
    }

    public Timestamp getUser_registration_time() {
        return user_registration_time;
    }

    public void setUser_registration_time(Timestamp user_registration_time) {
        this.user_registration_time = user_registration_time;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_telephone_number() {
        return user_telephone_number;
    }

    public void setUser_telephone_number(String user_telephone_number) {
        this.user_telephone_number = user_telephone_number;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
