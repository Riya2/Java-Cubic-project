package com.cubic.training.variables;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Remote re= new Remote();
		//re.DecreaseVolumne();
		//re.IncreaseVolumne();
	}
	class Remote implements IRemote{

		@Override
		public void Poweron() {
			System.out.println("power on");
			
		}

		@Override
		public void Poweroff() {
			// TODO Auto-generated method stub
			System.out.println("power off");
			
		}

		@Override
		public void IncreaseVolumne() {
			// TODO Auto-generated method stub
			System.out.println("increase volumn");
			
		}

		@Override
		public void DecreaseVolumne() {
			// TODO Auto-generated method stub
			System.out.println("dereased volumn");
			
		}
		}

}
