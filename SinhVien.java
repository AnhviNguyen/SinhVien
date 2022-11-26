package EX1;

import java.util.Scanner;

public class SinhVien {
	private int id;
	private String name;
	private int age;
	private String address;
	private double GPA;
	
	public SinhVien(int id, String name, int age, String address, double gPA) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		GPA = gPA;
	}

	public SinhVien() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Sinh vien: id:"+id+",name:"+name+",age:"+age+"address:"+address+"GPA:"+GPA;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ten: ");
		name=sc.nextLine();
		System.out.print("nhap dia chi: ");
		address=sc.nextLine();
		System.out.print("nhap ID: ");
		id=sc.nextInt();
		System.out.print("nhap tuoi: ");
		age=sc.nextInt();
		System.out.print("nhap GPA: ");
		GPA=sc.nextDouble();
	}
}
