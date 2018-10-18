public class Stopwatch {
    private long startTime;
    private long endTime;

    Stopwatch (){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void end(){
        endTime = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return endTime - startTime;
    }
}
