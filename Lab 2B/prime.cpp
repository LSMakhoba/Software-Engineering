#include<iostream>
#include<vector>
#include<cstdlib>
#include<cstdio>
#include<fstream>
#define N 100
using namespace std;


vector<int> primeNumbers(int X)
{
  int r;
  vector<int> prime_numbers;
  for(int i=1; i <= X; i++)
  {
       r = 2;
       bool prime = true;
      while(r < i/2 + 1)
      {
        if(i%r == 0 ) 
        {
		   prime = false;
        }
        r++;
      }
      
      if(prime==true and i!=1)
      {
        prime_numbers.push_back(i);
      }
  }
  
     
     return prime_numbers;
}
void checkInput(){
 long x;
  
  cin>>x;
vector<int> only_prime = primeNumbers(x);
  int length = only_prime.size();

  if(cin){//Checks input taken
	if(x<0){
		//if input is negative integer return apprpriate error message
		cout<<"Negative Integer &  Error Code 101-Negative 	int. Enter positive int."<<endl;
	
	}else{	
		//if input is Positive integer, correct input return correct answer
		cout<<"Total number of primes: "<<length<<endl;
	for(vector<int>::iterator c=only_prime.begin(); c!=only_prime.end(); ++c)
	   cout<<" "<<*c;
     cout<<endl;

		}
	}else{//if input is string of characters or blank
	cout<<"String of char & Error Code 102-String of character.Enter positive int "<<endl;
	}
}
vector<int> test_prime(int X)
{
  ifstream file;
  int prime_number, count=0;
  vector<int> true_prime;
  file.open("prim_numbers.txt");
  if(!file)
  {
    cout<<"couldn't open the file\n";
    exit(1);
  } 
  
  while(file>> prime_number)
  {
    count++;
    true_prime.push_back(prime_number);
    if(count == 10000)break;
  }
	vector<int> in_range;
	for(vector<int>:: iterator i = true_prime.begin(); i!=true_prime.end();++i)
	     if(*i<X)
	     {
	       in_range.push_back(*i);
	       cout<<' '<<*i;
	     }
	     file.close();
	     cout<<' '<<endl;
	return in_range;
}

void TestProg(){

//Test Case 1: x=10

vector<int> vec =test_prime(10);
if(vec == primeNumbers(20)){
		cout<<"Pass test case 1"<<endl;
}else{
		cout<<"Failed test case 1"<<endl;
	}
}

int main()
{
 TestProg();
  //test_prime(100);
    
  return 0;
}


