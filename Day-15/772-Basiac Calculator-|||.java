int startIndex=0;
public int Calculate(String inputString){
  Stack<integer> numberStack=new Stack();
int number=0;
char operator='+';
while(startIndex<inputString.length()){
  char charval=inputString.charAt(startIndex);
  if(Character.isDigit(charValue)){
    number=(number*10)+(charValue-'0');
  }
  if((!Character.isDigit(charValue)&&charValue!=' ') || (startIndex==inputString.length()-1)){
    if(char
