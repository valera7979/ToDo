package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

import java.util.Date;

/**
 * Created by Валера on 08.05.2017.
 */

@SuppressWarnings("JpaQlInspection")
@NamedQueries(value = {
        @NamedQuery(name = Todo.ALL_SORTED, query = "SELECT t FROM Todo t ORDER BY t.id DESC")
})

@Entity
@Table(name = "todo")
public class Todo {

    public static final String ALL_SORTED = "Todo.getAll";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "started", columnDefinition = "timestamp default now()")
    @Temporal(value = TemporalType.DATE)
    private Date started = new Date();

    @Column(name = "expiration_date")
    @Temporal(value = TemporalType.DATE)
    private Date expiration_date;

    @Column(name = "status")
    @NotNull
    private String status;

    public Todo() {

    }

    public Todo(Integer id, String description, Date started, Date expiration_date, String status) {
        this.id = id;
        this.description = description;
        this.started = started;
        this.expiration_date = expiration_date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getStarted() {
        return started;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + getId() +
                ", description='" + description + '\'' +
                ", started=" + started +
                ", status=" + status +
                '}';
    }
}
