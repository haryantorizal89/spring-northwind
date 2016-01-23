package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * Territories generated by hbm2java
 */
public class Territories implements java.io.Serializable {

	private static final long serialVersionUID = 7422151046733923857L;

	private String territoryId;
	private char territoryDescription;
	private short regionId;

	public Territories() {
	}

	public Territories(String territoryId, char territoryDescription, short regionId) {
		this.territoryId = territoryId;
		this.territoryDescription = territoryDescription;
		this.regionId = regionId;
	}

	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	public char getTerritoryDescription() {
		return this.territoryDescription;
	}

	public void setTerritoryDescription(char territoryDescription) {
		this.territoryDescription = territoryDescription;
	}

	public short getRegionId() {
		return this.regionId;
	}

	public void setRegionId(short regionId) {
		this.regionId = regionId;
	}
}