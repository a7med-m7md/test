package rec.com.ahmedmelsherbini.recye;

public class model {
    private String img ="";
    private String text ="";
    private String link ="";

    public model(String img, String text, String link) {
        this.img = img;
        this.text = text;
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
