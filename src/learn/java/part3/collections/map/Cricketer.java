package learn.java.part3.collections.map;

public class Cricketer implements Comparable<Cricketer> {
	private int jerseyNum;
	private String name;
	private int rank;

	public Cricketer(int jerseyNum, String name, int rank) {
		super();
		this.jerseyNum = jerseyNum;
		this.name = name;
		this.rank = rank;
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Cricketer [jerseyNum=" + jerseyNum + ", name=" + name + ", rank=" + rank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jerseyNum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rank;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		if (jerseyNum != other.jerseyNum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}

	@Override
	public int compareTo(Cricketer o) {
		if (this.getRank() > o.getRank()) {
			return 1;
		} else if (this.getRank() < o.getRank()) {
			return -1;
		}
		return 0;
	}
}
