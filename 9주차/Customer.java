
public class Customer {
	public boolean interestProduct(String productName) {
		Product p1 = new Product(); //객체 생성
		boolean check = p1.searchProduct(productName); //searchProduct를 호출해서 check라는 변수에 담음
		return check; //boolean인데 우리는 이걸 boolean 타입 check에 받았으니까 return check;
	}

}
