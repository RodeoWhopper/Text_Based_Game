package content.characters.util;

public class Space {
    private String item;
    private String type;
    private boolean availability;

    public Space(String type, boolean availability) {
        this.type = type;
        this.availability = availability;
        this.item = null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
