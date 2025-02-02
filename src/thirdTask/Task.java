package thirdTask;

public class Task {
    private String title;
    private boolean finished;

    public Task(String title, boolean finished) {
        this.title = title;
        this.finished = finished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", finished=" + finished +
                '}';
    }
}
