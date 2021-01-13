package Data_Structure.section3;

import java.util.Scanner;

import Data_Structure.section2.Event;

public class Main {
	int n = 0;
	Shape [] figure = new Shape [100];
	int capacity = figure.length;
	Scanner sc = new Scanner(System.in);
	public void ProcessCommend() {
		while(true) {
			System.out.print("$");
			String fun = sc.next();
			if(fun.equalsIgnoreCase("add")) {
				System.out.print("$ input shape : (r/c/t)");
				String info = sc.next();
				if(info.equalsIgnoreCase("r")) {
					System.out.print("$ input width and height :");
					int width = sc.nextInt();
					int height = sc.nextInt();
					Rectangle r = new Rectangle(width,height);
					addShape(r);
				}
				else if(info.equalsIgnoreCase("c")) {
					System.out.print("$ input raidus :");
					int radius = sc.nextInt();
					Circle c = new Circle(radius);
					addShape(c);
				}
				else if(info.equalsIgnoreCase("t")) {
					System.out.print("$ input width and height :");
					int width = sc.nextInt();
					int height = sc.nextInt();
					RtTriangle t = new RtTriangle(width,height);
					addShape(t);
				}
				
			}
			else if(fun.equalsIgnoreCase("show")) {
				showData();
			}
			else if(fun.equalsIgnoreCase("showdetail")) {
				showDetail();
			}
			else if(fun.equalsIgnoreCase("sort")) {
				Sort();
			}
			else if(fun.equalsIgnoreCase("exit")) {
				System.out.println("Exit");
				break;
			}
		}
		
	}
	public void addShape(Shape s) {
		if(n >= capacity) {
			realLocate();
		}
		figure[n++] = s;
	}
	public void realLocate() {
		Shape [] tmp = new Shape [capacity * 2];
		for(int i = 0; i <= n; i++) {
			tmp[i] = figure[i];
		}
		figure = tmp;
		capacity *= 2;
	}
	public void Sort() {
		System.out.println("#Sort");
		for(int i = 0; i < n-1; i++) {
			double max = figure[i].computeArea();
			int idx = i;
			for(int j = i+1; j < n; j++) {
				if(max > figure[j].computeArea()) {
					idx = j;
					max = figure[j].computeArea();
				}
			}
			if(idx != i) {
				Shape temp = figure[i];
				figure[i] = figure[idx];
				figure[idx] = temp;
			}
		}
	}
	public void showDetail() {
		System.out.println("#show detail");
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) +"."+ figure[i].toString());
			System.out.println("\t-The area is " + figure[i].computeArea());
			System.out.println("\t-The perimeter is "+figure[i].computePerimeter());
		}
	}
	public void showData() {
		System.out.println("#show data");
		for(int i = 0; i < n; i++) {
			System.out.println((i+1)+"." + figure[i].toString());
		}
	}
	public int ParseDataInt(String s) {
		int num = Integer.parseInt(s);
		return num;
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.ProcessCommend();
	}

}
