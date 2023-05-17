package chap09.EX2;


class Accounting {
	public double supplyVat; //공급가액
	public static double vatRate = 0.08; //부가가치세율(8%)
	public Accounting (double supplyVat) {
		this.supplyVat = supplyVat;
		
	}
	public Accounting() {
		
	}
	//기눙 - 부가가치세액 , 총합계
	public double getVat() {
		double vat = this.supplyVat * vatRate;
		return vat;
	}
	public double getTotal() {
		double total = this.supplyVat + getVat();
		return total;
	}
	

}
