/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.ch02.HMS;

/**
 *
 * @author 82109
 */

//import cse.oop2.ch02.HMS1.Room;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Hotel {
    private Scanner sc;
    private Map<String, Room> hotelMap;
    private String gusetName;
    
    public Hotel(){
        sc=new Scanner(System.in);
        hotelMap = new HashMap<>();
       
    }
    public void roomStart(){
        System.out.println("--------------------");
        System.out.println("작업을 시작합니다.");
        System.out.println("--------------------");
        
        while(true){
            System.out.println("-------------------");
            System.out.println("작업을 선택하십시오");
            System.out.println("1.체크인   2.체크아웃   3.방 상태   4.종료");
            System.out.println("-------------------");
            System.out.println();
            
            int num = sc.nextInt();
            sc.nextLine();
            
            //int select = Work();
            switch(num){
                case 1:
                    checkIn(); break;
                case 2:
                    checkOut(); break;
                case 3:
                    roomState(); break;
                case 4:
                    System.out.println("작업을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하십시오.");
                    
            }
        }
    }
    private void checkOut(){
        System.out.println("체크아웃 하시겠습니까?");
        System.out.println();
        System.out.print("방 번호 입력: ");
        String roomNum=sc.next();
        //String guestName=sc.next();
        if(hotelMap.remove(roomNum) == null) {
            
            System.out.println(roomNum + "호는 빈 방 입니다.");
	} else {
            System.out.println( "체크아웃 되었습니다. 감사합니다."); // 
	}
    }
    private void roomState(){
        Set<String> keySet = hotelMap.keySet();
        System.out.println("--------------------");
	System.out.println("방 번호    고객 이름");
	System.out.println("--------------------");
		
		if(keySet.size() == 0) {
			System.out.println("존재하지 않는 방 입니다");
		} else {
			Iterator<String> it = keySet.iterator();
			
			int count = 0;
			while(it.hasNext()) {
				count++;
				String roomNum = it.next();
				Room h = hotelMap.get(roomNum);
				System.out.println(" " + count + "호"+ "\t" +"방 번호 : "+ h.getroomNum() +"\t" + "고객 이름 : "+ h.getgusetName());

			}
		}
		System.out.println("--------------------");
    }
   private void checkIn(){
       System.out.println();
       System.out.println("체크인 내용 기록");
       System.out.print("방 번호 입력: ");
       String roomNum = sc.next();
       
       if(hotelMap.get(roomNum) != null) {
			System.out.println("이미 체크인 완료된 방 입니다");
			return;
		}
		
		sc.nextLine();
		System.out.println("이름을 입력하시오");
		System.out.print("이름 입력: ");
		String guestName = sc.next();
		
		hotelMap.put(roomNum, new Room(roomNum, guestName));
		System.out.println(guestName + " 체크인 되었습니다");
   }
   public static void main(String[] args) {
		new Hotel().roomStart();
	}
}
