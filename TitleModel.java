public class TitleModel {
    private String message;
    private boolean FrameVisible;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public TitleModel() {
        FrameVisible = false;
    }

    public boolean isFrameVisible() {
        return FrameVisible;
    }

    public void setFrameVisible(boolean visible) {
        FrameVisible = visible;
    }
}
