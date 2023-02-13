package class7;

import java.util.Random;

public enum Head {
    SPHERE ("круглая голова"),
    CUBE ("квадратная голова"),
    PYRAMID ("треугольная голова");

    private String title;

    Head(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Head{" +
                "title='" + title + '\'' +
                '}';
    }
}