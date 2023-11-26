package DAT100Exam2022;

//Superclass
public abstract class Rom {
	private char blokk;
	private int nr;

	public Rom(char blokk, int nr) {

	}

	public char getBlokk() {
		return blokk;
	}

	public void setBlokk(char blokk) {
		this.blokk = blokk;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	@Override
	public String toString() {
		return "Rom" + blokk + nr;
	}

//Subclass
	public class Lab extends Rom {

		public int antall;

		public Lab(char blokk, int nr, int[] antall) {
			super(blokk, nr);
			System.out.println("Lab " + blokk + nr + antall);
		}

	}

	// subclass
	public class Kontor extends Lab {

		public String name;

		public Kontor(char blokk, int nr, int[] antall, String name) {
			super(blokk, nr, antall);
		}

		@Override
		public String toString() {
			return "Kontor +" + name + blokk + nr;

		}

		public class Etasje {
			private int etasje;

			public Etasje(int etasje, Rom[] rom) {
				this.etasje = etasje;
			}

			@Override
			public String toString() {
				return "Etasje " + etasje + "\n" + "Kontor" + blokk + nr + name;
			}
		}

	}
}

