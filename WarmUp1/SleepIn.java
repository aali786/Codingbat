public boolean sleepIn(boolean weekday, boolean vacation) {
  if(weekday == true && vacation == false){
    return false;
  }
  else if(weekday == false && vacation == true){
    return true;
  }
  else{
    return true;
  }
}
