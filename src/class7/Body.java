package class7;

import java.util.Random;

public enum Body {
    BLACK ("чёрное тело"),
    RED ("красное тело"),
    GREEN ("зелёное тело");

    private String title;

    Body(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
