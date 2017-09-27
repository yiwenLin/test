package huawei;

import java.util.Scanner;

public class huawei03 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String[] left,right;
	  String[] line;
	  String nextLine, outString;
	  while(sc.hasNext()) {
		  nextLine = sc.nextLine();
		  //有王炸就王炸最大
		  if(nextLine.contains("joker JOKER")) {
			  outString = "joker JOKER";
		  }else {
			  //先拆成左右在拆成单排
			  line = nextLine.split("-");
			  left = line[0].split("");
			  right = line[1].split("");
			  //炸弹最大
			  if(left.length==4&&right.length!=4) {
				  outString = line[0];
			  }else if(right.length==4&&left.length!=4) {
				  outString = line[1];
				  
				  
			  }
			//牌数相同的情况下比较大小，compare返回牌的大小
			  else if(right.length==left.length) {
				  if(count(left[0])==count(right[0])) {
					  outString = line[0];
				  }else {
					  outString = line[1];
				  }
			  }else {
				  outString = "ERROR";
			  }
		  }
		  System.out.println(outString);
	  }
  }

private static int count(String str) {
	// TODO Auto-generated method stub
	return "34569101JQKA2jokerJOKER".indexOf(str);
}
}
