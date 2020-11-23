package test07;

public class VipCustomr extends Customr{

	private double saleRatio;
	
	public VipCustomr(int id, String name) {
		super(id,name);
		super.grade="VIP";
		super.point=1000;
		super.pointRatio = 0.05;
		this.saleRatio=0.1;
	}
	public int calcPrice(int price) {
			point += price * pointRatio;
			return price -(int)(price*saleRatio);
	}

}
