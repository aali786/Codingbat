public int diff21(int n) {
  if(n < 21){
    return 21 - n;
  }
   return Math.abs(n-21)*2;   //Math function is always Math.abs() 
    
}
// You can also solve it by intializing a variable 
public int diff21(int n) {
int difference = 21 -n;
  if(n < 21){
    return difference;
  }
   return Math.abs(difference)*2;   
}

