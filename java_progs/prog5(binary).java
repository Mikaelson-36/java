import java.util.Scanner;
class BinarySearch {
static int binarySearch(int a[],int n,int key) {
int first=0;
int last=n-1;
while(first<=last) {
int middle=(first+last)/2;if(a[middle]==key)
return middle;
else if(a[middle]<key)
first=middle+1;
else if(a[middle]>key)
last=middle-1;
}
return -1;
}
public static void main(String args[]) {
int i, n, key,index,array[];
Scanner in=new Scanner(System.in);
System.out.println("Enter number of elements");
n=in.nextInt();
array=new int[n];
System.out.println("Enter " + n + " integers in increasing order");
for(i=0; i<n; i++)
array[i]=in.nextInt();
System.out.println("Enter value to find");
key=in.nextInt();
index=binarySearch(array,n,key);
if(index==-1)
System.out.println(key + " is not present in the list.\n");
else
System.out.println("Element found at index " + (index+1));
}
}
