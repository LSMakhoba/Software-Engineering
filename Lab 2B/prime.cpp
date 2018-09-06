#include<iostream>
#include<vector>
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
void CheckInput(){
 long x;
  
  cin>>x;
vector<int> only_prime = primeNumbers(x);
  int length = only_prime.size();

  if(cin){
	if(x<0){
		cout<<"Negative Integer &  Error Code 101-Negative 	int. Enter positive int."<<length<<endl;
	
	}else{
		cout<<"Total number of primes: "<<length<<endl;
	for(vector<int>::iterator c=only_prime.begin(); c!=only_prime.end(); ++c)
	   cout<<" "<<*c;
     cout<<endl;

		}
	}else{
	cout<<"String of char & Error Code 102-String of character.Enter positive int"<<length<<endl;
	}
}
int main()
{
 CheckInput();

  
  
	
  return 0;
}


