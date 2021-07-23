package learn.java.oops.composition;

public class Brain {
	private int numOfNeurons;
	private int iq;
	
	public Brain(int numOfNeurons, int iq) {
		this.numOfNeurons = numOfNeurons;
		this.iq = iq;
	}

	public int getNumOfNeurons() {
		return numOfNeurons;
	}

	public void setNumOfNeurons(int numOfNeurons) {
		this.numOfNeurons = numOfNeurons;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

}
