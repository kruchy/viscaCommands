package pl.agh.kis.mult.v01;

import jssc.SerialPort;
import jssc.SerialPortException;

/**
 * Created by Krzysiek on 2015-11-27.
 */
public class Main {
    public static void main(String[] args)
    {
        ChainCommand up = new UpCommand();
        ChainCommand down = new DownCommand();
        ChainCommand left = new LeftCommand();
        ChainCommand right = new RightCommand();
        up.setNext(down);
        down.setNext(left);
        left.setNext(right);
        SerialPort serialPort = new SerialPort("com1");
        try {
            serialPort.setParams(9600,8,1,0);
        } catch (SerialPortException e) {
            e.printStackTrace();
        }


    }
}
