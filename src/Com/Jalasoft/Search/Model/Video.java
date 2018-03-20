package Com.Jalasoft.Search.Model;

public class Video extends Asset {
    private final String title;
    private final String author;
    private final String codec;
    private final String fps;
    private final String aspect;
    private final String subtle;
    private final String chapter;

    public Video(String title, String author, String codec, String fps, String aspect, String subtle, String chapter){
        super();
        this.title = title;
        this.author = author;
        this.codec = codec;
        this.fps = fps;
        this.aspect = aspect;
        this.subtle = subtle;
        this.chapter = chapter;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCodec() {
        return codec;
    }

    public String getFps() {
        return fps;
    }

    public String getAspect() {
        return aspect;
    }

    public String getSubtle() {
        return subtle;
    }

    public String getChapter() {
        return chapter;
    }

    public void setTitle(String title){
        title = this.title;
    }

    public void setAuthor(String author){
        author = this.author;
    }

    public void setCodec(String codec){
        codec = this.codec;
    }

    public void setFps(String fps){
        fps = this.fps;
    }

    public void setAspect(String aspect){
        aspect = this.aspect;
    }

    public void setSubtle(String subtle){
        subtle = this.subtle;
    }

    public void setChapter(String chapter){
        chapter = this.chapter;
    }
}
