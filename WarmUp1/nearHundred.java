// Breakdown 
public boolean nearHundred(int n) {
  if(Math.abs(n-100) <=10){
    return true;
  }
  else if(Math.abs(n- 200) <=10){
    return true;
  }
  else
  return false;
}

// or you can intialize and consice the code
public boolean nearHundred(int n) {
int numb = 100 - n;
int numb1 = 200 - n;

return (Math.abs(numb) <= 10 || Math.abs(numb1) <= 10);
