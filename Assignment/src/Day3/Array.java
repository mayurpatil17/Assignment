package Day3;

public class Array {

	public static void main(String[] args) {
		int[] a= {3,4,6,8};
		int[] b= {1,2,3,4};
		int[] c1= {0,0,0,0};
		int[] c2= {0,0,0,0};
		int[] c3= {0,0,0,0};
		int[] c4= {0,0,0,0};
		
		for(int i=0;i<a.length;i++) {
			
			c1[i]=a[i]+b[i];
			c2[i]=a[i]-b[i];
			c3[i]=a[i]*b[i];
			c4[i]=a[i]/b[i];
			
		}
		System.out.println(c1[0]+","+c1[1]+","+c1[2]+","+c1[3]);
		System.out.println(c2[0]+","+c2[1]+","+c2[2]+","+c2[3]);
		System.out.println(c3[0]+","+c3[1]+","+c3[2]+","+c3[3]);
		System.out.println(c4[0]+","+c4[1]+","+c4[2]+","+c4[3]);

	}

}
