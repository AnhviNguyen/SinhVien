package EX1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int chon=0;
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		System.out.println("--------------MENU-------------");
		System.out.println("1. them sinh vien");
		System.out.println("2. cap nhat sinh vien theo ID");
		System.out.println("3. xoa sinh vien theo ID");
		System.out.println("4. sap xep sinh vien theo ten");
		System.out.println("5. hien thi danh sach sinh vien");
		System.out.println("6. ket thuc chuong trinh");
		
		while (chon!=1) {
			System.out.print("ban chon muc: ");
			int so=sc.nextInt();
			switch (so) {
			case 1: {	//1. them sinh vien
				System.out.print("so sinh vien can them: ");
				int a=sc.nextInt();
				for (int i=0; i<a; i++) {
					SinhVien s1 = new SinhVien();
					s1.nhap();
					list.add(s1);
					System.out.println();
				}
			}
			break;
			case 2: {	//2. cap nhat sinh vien theo id
				System.out.println("nhap id sinh vien can cap nhat");
				int a=sc.nextInt();
				for (int i=0; i<list.size(); i++) {
					if (a==list.get(i).getId()) {
						System.out.println("");
						list.get(i).nhap();
					}
				}
				for (SinhVien x: list) {
					System.out.println(x.toString());
				}
				System.out.println();
			}
			break;
			case 3:{ 	//xoa sinh vien theo id
				System.out.println("nhap id sinh vien can xoa: ");
				int a=sc.nextInt();
				for (int i=0; i<list.size(); i++) {
					if (a==list.get(i).getId()) {
						list.remove(list.get(i));
					}
				}
				for (SinhVien x: list) {
					System.out.println(x.toString());
				}
				System.out.println();
			}
			break;
			case 4:{	//sap xep sinh vien theo ten
				SinhVien a;
				for (int i=0; i<list.size(); i++) {
					for (int j=i+1; j<list.size(); j++) {
						if (list.get(i).getName().compareTo(list.get(j).getName())>0) {
							a=list.get(i);
							list.set(i, list.get(j));
							list.set(j, a);
						}
					}
				}
				for (SinhVien x: list) {
					System.out.println(x.toString());
				}
				System.out.println();
			}
			break;
			case 5: {
				for (SinhVien x : list) {
					System.out.println(x.toString());
				}
				System.out.println();
			}
			break;
			case 6:{
				System.out.println("thoat khoi chuong trinh");
				chon=1;
			}
			break;
			default:
				System.out.println("nhap sai. Yeu cau nhap lai");
			}
		}
	}

}
