package src;

public class Bestellung {
	
	String zustand;
	String bestellnummer;
	String bearbeitung;
	String geplanteLieferung;
	
	public String getZustand() {
		return zustand;
	}
	public void setZustand(String zustand) {
		this.zustand = zustand;
	}
	public String getBestellnummer() {
		return bestellnummer;
	}
	public void setBestellnummer(String bestellnummer) {
		this.bestellnummer = bestellnummer;
	}
	public String getBearbeitung() {
		return bearbeitung;
	}
	public void setBearbeitung(String bearbeitung) {
		this.bearbeitung = bearbeitung;
	}
	public String getGeplanteLieferung() {
		return geplanteLieferung;
	}
	public void setGeplanteLieferung(String geplanteLieferung) {
		this.geplanteLieferung = geplanteLieferung;
	}
}
