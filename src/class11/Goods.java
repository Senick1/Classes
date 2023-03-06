package class11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Goods {

    private static Long nextId = 1237L;
    private Long id;
    private String name;
    private Date date;

    public Goods(String [] el) {
        try {
            this.id = nextId++;
        } catch (NumberFormatException e) {
            System.out.println("wrong name");
        }
        this.name = el[0];
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            this.date = simpleDateFormat.parse(el[1]);
        } catch (ParseException e) {
            e.getStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}