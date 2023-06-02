package com.greedy.test01;

import java.util.List;
import java.util.Map;

public class PostController {
   
	private final PostService menuService;
	   private final PrintResult printResult;

	   public PostController() {
	      this.menuService = new PostService();
	      this.printResult = new PrintResult();
	   }

	   public void findAllMenus() {
	      List<postDTO> menuList = menuService.findAllMenus();
	      if (menuList != null) {
	         printResult.printMenuList(menuList);
	      } else {
	         printResult.printErrorMessage("findAllMenus");
	      }
	   }

	public void findAllPost() {
		System.out.println("findAllPost");
	}
	   

//	   public void findMenuByMenuCode(Map<String, String> inputMenuCode) {
//	      int code = Integer.parseInt(inputMenuCode.get("code"));
//
//	      MenuDTO menu = menuService.findMenuByMenuCode(code);
//	      if (menu == null) {
//	         printResult.printErrorMessage("findMenuByMenuCode");
//	      } else {
//	         printResult.printMenu(menu);
//	      }
//
//	   }
//
//	   public void registNewMenu(Map<String, String> inputMenu) {
//	      String name = inputMenu.get("name");
//	      int price = Integer.parseInt(inputMenu.get("price"));
//	      int categoryCode = Integer.parseInt(inputMenu.get("categoryCode"));
//
//	      MenuDTO menu = new MenuDTO();
//	      menu.setName(name);
//	      menu.setPrice(price);
//	      menu.setCategoryCode(categoryCode);
//
//	      if (menuService.registNewMenu(menu)) {
//	         printResult.printSuccessMessage("registNewMenu");
//	      } else {
//	         printResult.printErrorMessage("registNewMenu");
//	      }
//	   }
//
//	   public void modifyMenu(Map<String, String> inputModifyMenu) {
//	      ModifyMenuDTO menuDTO = new ModifyMenuDTO();
//
//	      menuDTO.setCode(inputModifyMenu.get("code"));
//	      menuDTO.setName(inputModifyMenu.get("name"));
//	      menuDTO.setPrice(inputModifyMenu.get("price"));
//	      menuDTO.setCategoryCode(inputModifyMenu.get("categoryCode"));
//	      int result = menuService.modifyMenu(menuDTO);
//
//	      if (result > 0) {
//	         printResult.printSuccessMessage("modifyMenu");
//	      } else {
//	         printResult.printErrorMessage("notModify");
//	      }
//	   }
//
//	   public void removeMenu(Map<String, String> inputMenuCode) {
//	      int code = Integer.parseInt(inputMenuCode.get("code"));
//
//	      int result = menuService.removeMenu(code);
//
//	      if(result > 0 ) {
//	         printResult.printSuccessMessage("removeMenu");
//	      }else {
//	         printResult.printErrorMessage("notremove");
//	      }
//	   }
}
