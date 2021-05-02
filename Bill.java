class Bill
{
public static void main(String args[])
{
//decimal to binary
 int d=51,rem;
int t1=d,t2=d;
 String bin="";
 while(d>0)
{
  rem=d%2;
  bin=rem+bin;
  d=d/2;
}

System.out.println("Binary number:"+bin);

//decimal to octal
String oct="";
int rem1;
while(t1>0)
{
  rem1=t1%8;
  oct=rem1+oct;
  t1=t1/8;
}
  System.out.println("Octal number:"+oct);
 
//decimal to hexadecimal number 
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  String s="";
int rem2;
while(t2>0)
{
 rem2=t2%16;
 s=hex[rem2]+s;
 t2=t2/16;
}
System.out.println("Hexadecimal number: "+s);

}
} 