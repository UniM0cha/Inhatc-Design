package inha;

public class BookRentUI {
  public static void main(String[] args) {
    대여정보 rent = new 대여정보();
    rent.대여("kim", "book002", 20220320, 20220401);
    rent.대여("hong", "book002", 20220320, 20220401);
    rent.대여("hong", "book001", 20220320, 20220401);
    rent.반납("hong", "book001", 20220402);
    rent.반납("hong", "book001", 20220322);
  }
}