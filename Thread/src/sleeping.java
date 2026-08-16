class sleeping extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
