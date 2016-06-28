/**
 * Created by rohan.kushwaha on 26/06/16.
 */
public class Printer implements Runnable{

    private int printerId;

    private PrinterService printingService;

    Printer(PrinterService printingService){
        this.printingService = printingService;
    }

    public int getPrinterId() {
        return printerId;
    }

    public void setPrinterId(int printerId) {
        this.printerId = printerId;
    }


    @Override
    public void run() {
        System.out.println(printingService.read());
    }
}
