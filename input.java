1.
public int input(int num){
return num%5;
}

1a.
int[] count = {0,0,0,0,0};

int load(int input){
 int minCount=count[0], minIndex=0;
 for (int i=1;i<5;i++){
  if (count[i]<minCount){
   minCount = count[i];
   minIndex = i;
  }
 }

 count[minIndex++];
 return minIndex;
}

2.

int divby7(int n) {
 int q;
 q = (n >> 1) + (n >> 4);
 q = q + (q >> 6);
 q = q + (q>>12) + (q>>24); 
return q = q >> 2;
 
}