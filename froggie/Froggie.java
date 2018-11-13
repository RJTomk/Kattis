import java.util.*;
public class Froggie { // TODO: Solve

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int l = reader.nextInt();
		int w = reader.nextInt();
	}

	private static Car[] setLine(int o, int i, int s, int width) {
		ArrayList<Car> cars = new ArrayList<Car>();
		while(o < width) {
			Car ca = new Car(width, s, o);
			cars.add(ca);
			o += s;
		}

		Car[] res = new Car[cars.size()];
		cars.toArray(res);
		return res;
	}

	public class Car{
		public int Speed, Position;
		private int _width;

		public Car(int width, int iSpeed, int iPos) {
			Speed = iSpeed;
			Position = iPos;
			_width = width;
		}

		public boolean willRunOverFrog(int pos) {
			int oldPos = Position;
			move();
			if(Speed < 0) {
				if(oldPos < Position) {
					if(pos < oldPos || pos >= Position)
						return true;
				}else if(pos < oldPos && pos >= Position)
					return true;
			}else {
				if(oldPos > Position) {
					if(pos > oldPos || pos <= Position)
						return true;
				}else if(pos > oldPos && pos <= Position)
					return true;
			}

			return false;

		}

		public void move() {
			int newPos = Position + Speed;
			newPos = newPos >= _width ? newPos - _width : newPos;
			newPos = newPos < 0 ? _width + newPos: newPos;

			Position = newPos;
		}

		public void move(int elapsedTime) {
			while(elapsedTime-- > 0) move();
		}
	}
}
