package pl.agh.kis.mult.v01.command;

/**
 * Created by Krzysiek on 2015-11-28.
 */
public class SetAddressCommand  extends ChainCommand{


    public SetAddressCommand() {
        super("set");
    }

    @Override
    public byte[] getCommand() {
        return new byte[] {head,(byte)0x30 ,(byte)0x01 ,tail};
    }


}
