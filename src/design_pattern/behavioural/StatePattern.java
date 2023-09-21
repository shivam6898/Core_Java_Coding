package design_pattern.behavioural;

/*
 */
public class StatePattern {
	static class FanWallControl {
		private SpeedLevel current;

		public FanWallControl() {
			current = new Off();
		}

		public void set_state(SpeedLevel state) {
			current = state;
		}

		public void rotate() {
			current.rotate(this);
		}

		@Override
		public String toString() {
			return String.format(
					"FanWallControl [current=%s]", current);
		}
	}

	interface SpeedLevel {
		void rotate(FanWallControl fanWallControl);
	}

	static class Off implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel1());
		}
	}

	static class SpeedLevel1 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel2());
		}
	}

	static class SpeedLevel2 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel3());
		}
	}

	static class SpeedLevel3 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new Off());
		}
	}

	public static void main(String[] args) {
		FanWallControl fanControl = new FanWallControl();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		

	}
}


//FanWallControl [current=design_pattern.behavioural.StatePattern$Off@614c5515]
//FanWallControl [current=design_pattern.behavioural.StatePattern$SpeedLevel1@2d554825]
//FanWallControl [current=design_pattern.behavioural.StatePattern$SpeedLevel2@6be46e8f]
//FanWallControl [current=design_pattern.behavioural.StatePattern$SpeedLevel3@327471b5]