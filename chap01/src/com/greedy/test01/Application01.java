package com.greedy.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PostController postController = new PostController();

	      do {
	         System.out.println("======= 게시글 관리 ========");
	         System.out.println("1. 게시글 전체 조회");
	         System.out.println("2. 게시글 번호로 조회");
	         System.out.println("3. 게시글 추가");
	         System.out.println("4. 게시글 수정");
	         System.out.println("5. 게시글 삭제");
	         System.out.println(" 게시글 번호를 입력해주세요 :");
	         int no = sc.nextInt();

	         switch (no) {
	         case 1:
	            postController.findAllPost();
	            break;
//	         case 2:
//	            menuController.findMenuByMenuCode(inputMenuCode());
//	            break;
//	         case 3:
//	            menuController.registNewMenu(inputMenu());
//	            break;
//	         case 4:
//	            menuController.modifyMenu(inputModifyMenu());
//	            break;
//	         case 5:
//	            menuController.removeMenu(inputMenuCode());
//	            break;

	         default:
	            System.out.println("잘못된 메뉴를 선택하였습니다.");
	            break;
	         }
	      } while (true);

	   }

	   private static Map<String, String> inputMenuCode() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("메뉴 코드를 입력해주세요 : ");
	      String code = sc.nextLine();

	      Map<String, String> parameter = new HashMap<String, String>();
	      parameter.put("code", code);

	      return parameter;
	   }

//	   private static Map<String, String> inputMenu() {
//
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("메뉴의 이름을 입력해주세요 : ");
//	      String name = sc.nextLine();
//
//	      System.out.println("메뉴의  가격을 입력해주세요 : ");
//	      String price = sc.nextLine();
//
//	      System.out.println("카테고리 코드를 입력해주세요 : ");
//	      String categoryCode = sc.nextLine();
//
//	      Map<String, String> parmeter = new HashMap<>();
//	      parmeter.put("name", name);
//	      parmeter.put("price", price);
//	      parmeter.put("categoryCode", categoryCode);
//
//	      return parmeter;
//	   }
//
//	   private static Map<String, String> inputModifyMenu() {
//
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("수정할 메뉴 코드를 입력해주세요 : ");
//	      String code = sc.nextLine();
//
//	      System.out.println("수정할 메뉴 이름을 입력해주세요 : ");
//	      String name = sc.nextLine();
//
//	      System.out.println("수정할 메뉴 가격을 입력해주세요 : ");
//	      String price = sc.nextLine();
//
//	      System.out.println("수정할 카테고리 코드를 입력해주세요 : ");
//	      String categoryCode = sc.nextLine();
//
//	      Map<String, String> parmeter = new HashMap<>();
//	      parmeter.put("code", code);
//	      parmeter.put("name", name);
//	      parmeter.put("price", price);
//	      parmeter.put("categoryCode", categoryCode);
//
//	      return parmeter;
//	   }
}
