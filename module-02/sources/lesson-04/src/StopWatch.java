import java.util.Date;
import java.util.Scanner;

class SelectionSort {
    void sort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = new Date();
        this.endTime = new Date();
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        Date Start = new Date();
        setStartTime(Start);
    }

    public void stop() {
        Date Stop = new Date();
        setEndTime(Stop);
    }

    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
//        Date start = new Date();
//        Date stop = new Date();
//        while (true) {
//            stop = new Date();
//            if (((stop.getTime() - start.getTime()) / 1000) == 5) {
//                break;
//            }
//        }
//        System.out.println(stop);
        SelectionSort ob = new SelectionSort();
        StopWatch watch = new StopWatch();
        watch.start();
        int[] arr = new int[100000];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (int) (Math.random() * 100000);
        }
//        int[] arr = {64,25,12,22,11,45,80,47,32,49,59,97,98,27,28,29,15,17,61,62};
        ob.sort(arr);
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
        watch.stop();
        System.out.println("Sorted array");
        ob.printArray(arr);
        System.out.println("Time elapsed = " + watch.getElapsedTime());
    }
}
