package inha;

public class 대여정보 {
  private String 대여id;
  private int 대여일;
  private int 반납예정일;

  public boolean 대여(String id, String 도서id, int 대여일, int 반납예정일) {
    사용자정보 user = new 사용자정보();
    boolean userCheck = user.사용자id조회(id);
    if (userCheck) {
      도서정보 book = new 도서정보();
      boolean bookCheck = book.도서id조회(도서id);
      if (bookCheck) {
        this.대여id = id + 도서id;
        this.대여일 = 대여일;
        this.반납예정일 = 반납예정일;
        System.out.println("대여완료");
        return true;
      } else {
        System.out.println("도서정보 오류");
        return false;
      }
    } else {
      System.out.println("사용자정보 오류");
      return false;
    }
  }

  public boolean 반납(String id, String 도서id, int 반납일) {
    사용자정보 user = new 사용자정보();
    boolean userCheck = user.사용자id조회(id);
    if (userCheck) {
      도서정보 book = new 도서정보();
      boolean bookCheck = book.도서id조회(도서id);
      if (bookCheck) {
        boolean delayCheck = this.연체확인(반납일);
        if (delayCheck) {
          System.out.println("반납완료");
          return true;
        } else {
          System.out.println("연체");
          return true;
        }
      } else {
        System.out.println("도서정보 오류");
        return false;
      }
    } else {
      System.out.println("사용자정보 오류");
      return false;
    }
  }

  public boolean 연체확인(int 반납일) {
    if (this.반납예정일 > 반납일) {
      return true;
    } else {
      return false;
    }
  }
}