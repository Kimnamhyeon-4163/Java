package sub1;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("SAMSUNG powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNG powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("SAMSUNG chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("SAMSUNG chDown...");
	}

}
