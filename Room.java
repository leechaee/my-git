/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.oop2.ch02.HMS;

/**
 *
 * @author 82109
 */
/*
public class HotelVO {
    private String rNum;
	private String name;
	
	public HotelVO(String rNum, String name) {
		super();
		this.name = name;
		this.rNum = rNum;
	}
	
	public String getrNum() {
		return rNum;
	}


	public void setrNum(String rNum) {
		this.rNum = rNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Hotel [rNum=" + rNum + ", name=" + name + "]";
	}

    public String getgusetName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
*/
public class Room {
    private String roomNum;
    private String guestName;
	
	public Room(String roomNum, String guestName) {
		super();
		this.guestName = guestName;
		this.roomNum = roomNum;
	}
	
	public String getroomNum() {
		return roomNum;
	}


	public void setroomNum(String roomNum) {
		this.roomNum = roomNum;
	}


	public String getguestName() {
		return guestName;
	}


	public void setguestName(String guestName) {
		this.guestName = guestName;
	}


	@Override
	public String toString() {
		return "Hotel [rNum=" + roomNum + ", name=" + guestName + "]";
	}

    public String getgusetName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
