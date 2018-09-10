#include <iostream>
#include <vector>
#include <string>
using namespace std;

/*Global Variable*/
vector<int> primeArray;

/*Funtion Prototype*/
bool isPrime(int n);
void validate(int n);

int main(){

	long int n;

	cin >> n;
	cout << n << endl;
	//validate(n);
	for(int i = 2; i <= n; i++){
		if(isPrime(i) == 1){
			primeArray.push_back(i);
		}
	}
		

	for(int i = 0; i < primeArray.size(); i++)
		cout << primeArray.at(i) << " ";

	cout << endl;


}

bool isPrime(int n){

	bool isPrime = true;
	for(int j = 2; j <= n/2; j++){
		if(n % j == 0)
			isPrime = false;
	}
	return isPrime;

}

/*Testing Methods*/
void validate(int n){
	if(!n){
		cout << "Please Enter Valid Input" << endl;
	}else if(n < 0){
		cout << "Please Enter Positive Integer" << endl;
	}else{
		isPrime((int)n);
	}
}
